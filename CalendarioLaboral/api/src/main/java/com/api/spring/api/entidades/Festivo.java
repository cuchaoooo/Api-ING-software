package com.api.spring.api.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "festivo")
public class Festivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idpais") // Relación con la tabla 'pais'
    private Pais pais;

    private String nombre;
    private int dia;
    private int mes;
    private int diaspascua;
    private int idtipo;

    // Getters y Setters
    public int getId() { return id; }

    public Pais getPais() { return pais; } // Relación con Pais
    public void setPais(Pais pais) { this.pais = pais; }

    public int getDiaspascua() { return diaspascua; }
    public void setDiaspascua(int diaspascua) { this.diaspascua = diaspascua; }

    public int getIdtipo() { return idtipo; }
    public void setIdtipo(int idtipo) { this.idtipo = idtipo; }

    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
