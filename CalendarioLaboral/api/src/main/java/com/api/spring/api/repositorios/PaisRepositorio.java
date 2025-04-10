package com.api.spring.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.spring.api.entidades.Pais;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Integer> {
}
