/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante.dao;


import com.Restaurante.domain.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Brandon R
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long>{
    
    Usuario findByUsername(String username);
    
    List<Usuario> findByIdRol(Long idRol);
}
