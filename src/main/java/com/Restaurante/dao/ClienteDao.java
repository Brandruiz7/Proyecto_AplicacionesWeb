/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante.dao;

import com.Restaurante.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Brandon R
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
