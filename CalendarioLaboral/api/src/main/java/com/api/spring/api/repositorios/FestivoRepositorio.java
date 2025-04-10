package com.api.spring.api.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.spring.api.entidades.Festivo;

public interface FestivoRepositorio extends JpaRepository<Festivo, Integer> {

    @Query("SELECT f FROM Festivo f WHERE f.pais.id = :idpais AND f.mes = :mes AND f.dia = :dia")
    Optional<Festivo> buscarPorIdpaisYFecha(
        @Param("idpais") int idpais, 
        @Param("mes") int mes, 
        @Param("dia") int dia
    );
}
