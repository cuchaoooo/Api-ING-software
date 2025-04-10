package com.api.spring.api.controller; // Ajusta según tu estructura de paquetes

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Bienvenido a la API";
    }
}