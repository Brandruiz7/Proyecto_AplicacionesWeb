/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante.controller;

import com.Restaurante.domain.Usuario;
import com.Restaurante.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Brandon R
 */
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService; 
    
    
    @GetMapping("/usuario/nuevo")
    public String nuevoUsuario(Usuario usuario) {
        return "/usuario/modificar";
    }

    @PostMapping("/usuario/guardar")
    public String guardarUsuario(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/Index";
    }

    @GetMapping("/usuario/eliminar/{idUsuario}")
    public String eliminarUsuario(Usuario usuario) {
        usuarioService.delete(usuario);
        return "redirect:/usuario/listado";
    }
}
