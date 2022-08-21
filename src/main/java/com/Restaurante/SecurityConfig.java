/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante;

import com.Restaurante.service.UsuarioDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    UsuarioDetailsServiceImpl userDetailsService;
    //El siguiente método funciona para hacer la autenticación del usuario
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    //Definir la configuración de accesos (HAY QUE MODIFICAR LOS ACCESOS)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("About_Us","Activities","Contact_Us",
                        "Index","Menu","Orders","Privacy_Policies",
                        "Terms","/cliente/Shopping_Cart"
                        ,"/cuenta/Configuration_Account", "Employment")
                .hasAnyRole("ADMIN", "CLIENTE")
                .antMatchers("/")
                .hasAnyRole("ADMIN","CLIENTE")
                .and()
                .formLogin()
                .loginPage("/cliente/Sign_In")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403");
    }
}
