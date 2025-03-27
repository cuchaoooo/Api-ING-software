package com.example.festivos;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/festivos")
public class FestivoController {
    private final FestivoService festivoService;

    @Autowired
    public FestivoController(FestivoService festivoService) {
        this.festivoService = festivoService;
    }

    @GetMapping("/validar")
    public boolean esFestivo(@RequestParam int paisId, @RequestParam String fecha) {
        return festivoService.esFestivo(paisId, LocalDate.parse(fecha));
    }

    @GetMapping("/listar")
    public List<Festivo> listarFestivos(@RequestParam int paisId, @RequestParam int anio) {
        return festivoService.listarFestivos(paisId, anio);
    }
}
