/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Brandon R
 */
@Controller
@Slf4j
public class ClienteController {
    
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el inicio de sesión del sitio.
     */
    @RequestMapping(path = "/cliente/Sign_In", method = RequestMethod.GET)
    public String loadSign_In(){
        System.out.println("Cargando página...");
        
        return "/cliente/Sign_In";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el registro del sitio.
     */
    @RequestMapping(path = "/cliente/Sign_Up", method = RequestMethod.GET)
    public String loadSign_Up(){
        System.out.println("Cargando página...");
        
        return "/cliente/Sign_Up";
    }
    
}
