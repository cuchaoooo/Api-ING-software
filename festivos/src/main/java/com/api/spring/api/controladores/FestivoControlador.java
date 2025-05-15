package com.api.spring.api.controladores;

import com.api.spring.api.entidades.Festivo;
import com.api.spring.api.interfaces.IFestivoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/festivos")
public class FestivoControlador {

    @Autowired
    private IFestivoServicio servicio;

    @GetMapping("/listar")
    public List<Festivo> listar() {
        return servicio.listarTodos();
    }

    @GetMapping("/buscar")
    public Festivo buscarPorFecha(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return servicio.buscarPorFecha(fecha).orElse(null);
    }

    @PostMapping("/agregar")
    public Festivo agregar(@RequestBody Festivo festivo) {
        return servicio.guardar(festivo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
    }

    @GetMapping("/esfestivo")
    public boolean esFestivo(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return servicio.esFestivo(fecha);
    }
}