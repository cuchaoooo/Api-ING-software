package com.api.spring.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.api.entidades.Pais;
import com.api.spring.api.repositorios.PaisRepositorio;

@RestController
@RequestMapping("/paises")
public class PaisController {

    private final PaisRepositorio paisRepositorio;

    public PaisController(PaisRepositorio paisRepositorio) {
        this.paisRepositorio = paisRepositorio;
    }

    // 🔹 Endpoint para obtener todos los países
    @GetMapping
    public List<Pais> obtenerTodosLosPaises() {
        return paisRepositorio.findAll();
    }
    
}
