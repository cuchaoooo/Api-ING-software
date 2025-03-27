package com.example.festivos;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Festivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private LocalDate fecha;
    private int paisId;

    public Festivo() {}

    public Festivo(String nombre, LocalDate fecha, int paisId) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.paisId = paisId;
    }

    public String getNombre() { return nombre; }
    public LocalDate getFecha() { return fecha; }
}
