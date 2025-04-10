package com.api.spring.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.api.entidades.Festivo;
import com.api.spring.api.repositorios.FestivoRepositorio;

@RestController
@RequestMapping("/festivos")
public class FestivoController {

    private final FestivoRepositorio festivoRepositorio;

    public FestivoController(FestivoRepositorio festivoRepositorio) {
        this.festivoRepositorio = festivoRepositorio;
    }

    @GetMapping
    public List<Festivo> festivos() {
    List<Festivo> festivos = festivoRepositorio.findAll();
    System.out.println("Festivos encontrados: " + festivos.size());
    return festivos;
    }

    @GetMapping("/{idpais}/{ano}/{mes}/{dia}")
    public boolean buscarFestivo(
            @PathVariable int idpais, 
            @PathVariable int ano, 
            @PathVariable int mes, 
            @PathVariable int dia) {

        boolean existe = festivoRepositorio.buscarPorIdpaisYFecha(idpais, mes, dia).isPresent();

        System.out.println("Buscando festivo con ID País: " + idpais + ", Año: " + ano + ", Mes: " + mes + ", Día: " + dia);
        System.out.println("¿Festivo encontrado? " + existe);

        return existe;
    }
    
}
