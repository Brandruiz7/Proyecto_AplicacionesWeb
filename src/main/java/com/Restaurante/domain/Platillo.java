package com.Restaurante.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="menu")
public class Platillo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_platillo")
    private Long idPlatillo; 
    private String descripcion;
    private String categoria; 
    private double precio; 
    
    public Platillo() {
    }

    public Platillo(Long idPlatillo, String descripcion, String categoria, double precio) {
        this.idPlatillo = idPlatillo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }
}   
