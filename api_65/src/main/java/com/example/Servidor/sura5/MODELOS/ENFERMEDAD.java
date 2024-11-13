package com.example.Servidor.sura5.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "enfermedad")

public class ENFERMEDAD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String sintomas;

    private String clasificacion;

    private String grado;

    private Double probabilidaddeVida;

    public ENFERMEDAD() {
    }

    public ENFERMEDAD(long id, String nombre, String sintomas, String clasificacion, String grado, Double probabilidaddeVida) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probabilidaddeVida = probabilidaddeVida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getProbabilidaddeVida() {
        return probabilidaddeVida;
    }

    public void setProbabilidaddeVida(Double probabilidaddeVida) {
        this.probabilidaddeVida = probabilidaddeVida;
    }
}
