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
public class IndexController {

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el Menú del sitio.
     */
    @RequestMapping(path = "/Menu", method = RequestMethod.GET)
    public String loadMenu() {
        System.out.println("Cargando página...");

        return "Menu";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el Employment del sitio.
     */
    @RequestMapping(path = "/Employment", method = RequestMethod.GET)
    public String loadEmployment() {
        System.out.println("Cargando página...");

        return "Employment";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el sobre nosotros del sitio.
     */
    @RequestMapping(path = "/About_Us", method = RequestMethod.GET)
    public String loadAbout_Us() {
        System.out.println("Cargando página...");

        return "About_Us";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el actividades del sitio.
     */
    @RequestMapping(path = "/Activities", method = RequestMethod.GET)
    public String loadActivities() {
        System.out.println("Cargando página...");

        return "Activities";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el contáctenos del sitio.
     */
    @RequestMapping(path = "/Contact_Us", method = RequestMethod.GET)
    public String loadContact_Us() {
        System.out.println("Cargando página...");

        return "Contact_Us";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el home del sitio.
     */
    @RequestMapping(path = "/Index", method = RequestMethod.GET)
    public String loadHome() {
        System.out.println("Cargando página...");

        return "Index";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el ordenes del sitio.
     */
    //@RequestMapping(path = "/Orders", method = RequestMethod.GET)
    public String loadOrders() {
        System.out.println("Cargando página...");

        return "Orders";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna el políticas de privacidad del sitio.
     */
    @RequestMapping(path = "/Privacy_Policies", method = RequestMethod.GET)
    public String loadPrivacy_Policies() {
        System.out.println("Cargando página...");

        return "Privacy_Policies";
    }

    /**
     * Este método me permite llamar las URL del sitio.
     *
     * @return Retorna los términos y condiciones del sitio.
     */
    @RequestMapping(path = "/Terms", method = RequestMethod.GET)
    public String loadTerms() {
        System.out.println("Cargando página...");

        return "Terms";
    }
}
