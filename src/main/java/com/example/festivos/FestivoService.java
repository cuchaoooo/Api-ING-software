package com.example.festivos;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;
import java.util.List;

@Service
public class FestivoService {
    @Autowired
    private FestivoRepository festivoRepository;

    public boolean esFestivo(int paisId, LocalDate fecha) {
        return festivoRepository.findByPaisIdAndFecha(paisId, fecha).isPresent();
    }

    public List<Festivo> listarFestivos(int paisId, int anio) {
        return festivoRepository.findByPaisIdAndFechaYear(paisId, anio);
    }
}
