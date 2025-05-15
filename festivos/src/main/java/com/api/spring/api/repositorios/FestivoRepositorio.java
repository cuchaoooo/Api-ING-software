package com.api.spring.api.repositorios;

import com.api.spring.api.entidades.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface FestivoRepositorio extends JpaRepository<Festivo, Long> {
    Optional<Festivo> findByFecha(LocalDate fecha);
}