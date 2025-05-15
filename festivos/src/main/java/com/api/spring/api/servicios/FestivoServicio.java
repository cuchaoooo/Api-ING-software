package com.api.spring.api.servicios;

import com.api.spring.api.entidades.Festivo;
import com.api.spring.api.interfaces.IFestivoServicio;
import com.api.spring.api.repositorios.FestivoRepositorio;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FestivoServicio implements IFestivoServicio {

    private final FestivoRepositorio repositorio;

    public FestivoServicio(FestivoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Festivo> listarTodos() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Festivo> buscarPorFecha(LocalDate fecha) {
        return repositorio.findByFecha(fecha);
    }

    @Override
    public Festivo guardar(Festivo festivo) {
        return repositorio.save(festivo);
    }

    @Override
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public boolean esFestivo(LocalDate fecha) {
        return repositorio.findByFecha(fecha).isPresent();
    }
}