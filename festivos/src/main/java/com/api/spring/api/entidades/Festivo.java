package com.api.spring.api.entidades;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "festivo")
public class Festivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha", nullable = false, unique = true)
    private LocalDate fecha;

    @Column(name = "descripcion", nullable = false)                                                                                                                                                                                                                                                                                                                                                                                                                     
    private String descripcion;

    public Festivo() {}

    public Festivo(LocalDate fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Long getId() { return id; }
    public LocalDate getFecha() { return fecha; }
    public String getDescripcion() { return descripcion; }

    public void setId(Long id) { this.id = id; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}