package com.example.festivos;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FestivoRepository extends JpaRepository<Festivo, Long> {
    Optional<Festivo> findByPaisIdAndFecha(int paisId, LocalDate fecha);
    List<Festivo> findByPaisIdAndFechaYear(int paisId, int anio);
}
