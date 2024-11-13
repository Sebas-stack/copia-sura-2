package com.example.Servidor.sura5.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "medicamento")

public class MEDICAMENTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String oresentacion;

    private Double docis;

    private String laboratorio;

    private LocalDate fechaCaducidad;

    private String contraIndicaciones;

    private Boolean tieneCopago;

    public MEDICAMENTO() {
    }

    public MEDICAMENTO(long id, String nombre, String oresentacion, Double docis, String laboratorio, LocalDate fechaCaducidad, String contraIndicaciones, Boolean tieneCopago) {
        this.id = id;
        this.nombre = nombre;
        this.oresentacion = oresentacion;
        this.docis = docis;
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraIndicaciones = contraIndicaciones;
        this.tieneCopago = tieneCopago;
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

    public String getOresentacion() {
        return oresentacion;
    }

    public void setOresentacion(String oresentacion) {
        this.oresentacion = oresentacion;
    }

    public Double getDocis() {
        return docis;
    }

    public void setDocis(Double docis) {
        this.docis = docis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(String contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public Boolean getTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(Boolean tieneCopago) {
        this.tieneCopago = tieneCopago;
    }
}
