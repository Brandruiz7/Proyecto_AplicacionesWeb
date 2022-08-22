package com.Restaurante.controller;

import com.Restaurante.domain.Platillo;
import com.Restaurante.service.PlatilloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlatilloController {
    
        @Autowired
    private PlatilloService platilloservice;
    
    
        @GetMapping("/Orders")
    public String inicio(Model model) {
        var platillos = platilloservice.getPlatillos();
        model.addAttribute("platillos", platillos);
        return "/Orders";
    }
}
