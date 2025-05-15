package com.api.spring.api.interfaces;

import com.api.spring.api.entidades.Festivo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IFestivoServicio {
    List<Festivo> listarTodos();
    Optional<Festivo> buscarPorFecha(LocalDate fecha);
    Festivo guardar(Festivo festivo);
    void eliminar(Long id);
    boolean esFestivo(LocalDate fecha);
}