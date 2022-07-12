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
public class IndexController {

    /**
     *
     * @Autowired private ClienteDao clienteDao;
     */
    @Autowired
    private ClienteService clienteService;

    /**
     * Revisar los HTTP Verbs de peticiones, en el paréntesis va una ruta.
     *
     * @param model
     * @return
     */
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");

        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el Menú del sitio.
     */
    @RequestMapping(path = "/Menu", method = RequestMethod.GET)
    public String loadMenu(){
        System.out.println("Cargando página...");
        
        return "Menu";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el sobre nosotros del sitio.
     */
    @RequestMapping(path = "/About_Us", method = RequestMethod.GET)
    public String loadAbout_Us(){
        System.out.println("Cargando página...");
        
        return "About_Us";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el cuenta del sitio.
     */
    @RequestMapping(path = "/Account", method = RequestMethod.GET)
    public String loadAccount(){
        System.out.println("Cargando página...");
        
        return "Account";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el actividades del sitio.
     */
    @RequestMapping(path = "/Activities", method = RequestMethod.GET)
    public String loadActivities(){
        System.out.println("Cargando página...");
        
        return "Activities";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el contáctenos del sitio.
     */
    @RequestMapping(path = "/Contact_Us", method = RequestMethod.GET)
    public String loadContact_Us(){
        System.out.println("Cargando página...");
        
        return "Contact_Us";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el home del sitio.
     */
    @RequestMapping(path = "/Index", method = RequestMethod.GET)
    public String loadHome(){
        System.out.println("Cargando página...");
        
        return "Index";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el ordenes del sitio.
     */
    @RequestMapping(path = "/Orders", method = RequestMethod.GET)
    public String loadOrders(){
        System.out.println("Cargando página...");
        
        return "Orders";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el políticas de privacidad del sitio.
     */
    @RequestMapping(path = "/Privacy_Policies", method = RequestMethod.GET)
    public String loadPrivacy_Policies(){
        System.out.println("Cargando página...");
        
        return "Privacy_Policies";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el inicio de sesión del sitio.
     */
    @RequestMapping(path = "/Sign_In", method = RequestMethod.GET)
    public String loadSign_In(){
        System.out.println("Cargando página...");
        
        return "Sign_In";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna el registro del sitio.
     */
    @RequestMapping(path = "/Sign_Up", method = RequestMethod.GET)
    public String loadSign_Up(){
        System.out.println("Cargando página...");
        
        return "Sign_Up";
    }
    /**
     * Este método me permite llamar las URL del sitio.
     * @return Retorna los términos y condiciones del sitio.
     */
    @RequestMapping(path = "/Terms", method = RequestMethod.GET)
    public String loadTerms(){
        System.out.println("Cargando página...");
        
        return "Terms";
    }
    

    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente) {
        return "modificarCliente";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificarCliente";
    }

    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente) {
        clienteService.delete(cliente);
        return "redirect:/";
    }
}
