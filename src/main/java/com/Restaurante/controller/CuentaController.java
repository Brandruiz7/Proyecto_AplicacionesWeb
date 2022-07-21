/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante.controller;

import com.Restaurante.domain.Cliente;
import com.Restaurante.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Brandon R
 */
@Controller
@Slf4j
public class CuentaController {

    /**
     *
     * @Autowired private ClienteDao clienteDao;
     */
    @Autowired
    private ClienteService clienteService;

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el cuenta del sitio.
     */
    @RequestMapping(path = "/cuenta/Configuration_Account", method = RequestMethod.GET)
    public String loadAccount() {
        System.out.println("Cargando página...");

        return "/cuenta/Configuration_Account";
    }
    
    @GetMapping("/cuenta/listado")
    public String inicio(Model model){
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes",clientes);
        return "/cuenta/listado";
    }

    @GetMapping("/cuenta/nuevo")
    public String nuevoCliente(Cliente cliente) {
        return "/cuenta/modificar";
    }

    @PostMapping("/cuenta/guardar")
    public String guardarCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/cuenta/listado";
    }

    @GetMapping("/cuenta/modificar/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "/cuenta/modificar";
    }

    @GetMapping("/cliente/eliminar/{idCliente}")
    public String eliminarCliente(Cliente cliente) {
        clienteService.delete(cliente);
        return "redirect:/cliente/listado";
    }
}
