/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Brandon R
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //El siguiente método funciona para hacer la autenticación del usuario
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123") //noop es para NO encriptar la contraseña
                .roles("ADMIN", "CLIENTE")
                .and()
                .withUser("cliente")
                .password("{noop}123") //noop es para NO encriptar la contraseña
                .roles("CLIENTE")
                .and();
    }

    //Definir la configuración de accesos (HAY QUE MODIFICAR LOS ACCESOS)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/cuenta/nuevo", "/cuenta/guardar",
                        "/cuenta/modificar/**", "/cuenta/eliminar/**")
                .hasAnyRole("ADMIN", "CLIENTE")
                .antMatchers("/cuenta/listado")
                .hasRole("ADMIN") //Roles asignados
                .antMatchers("/")
                .hasAnyRole("ADMIN","CLIENTE")
                .and()
                .formLogin()
                .loginPage("/cliente/Sign_In")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403");
    }
}
