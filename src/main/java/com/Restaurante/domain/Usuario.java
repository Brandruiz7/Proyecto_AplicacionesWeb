/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario; // Hibernate lo transforma en id_Usuario
    private String username;
    private String apellido_P;
    private String apellido_M;
    private Long idRol;
    private String correo;
    private String password;
    private String provincia;
    private String canton;
    private String distrito;
    private String otras_senias;
    
    public Usuario() {
    }

    public Usuario(String username, String apellido_P, String apellido_M, Long idRol, String correo, String password, String provincia, String canton, String distrito, String otras_senias) {
        this.username = username;
        this.apellido_P = apellido_P;
        this.apellido_M = apellido_M;
        this.idRol = idRol;
        this.correo = correo;
        this.password = password;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.otras_senias = otras_senias;
    }

    
}
