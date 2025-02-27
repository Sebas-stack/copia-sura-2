package com.example.Servidor.sura5.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "pacientes")
public class PACIENTE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;// 35 caracteres y solo letras

    private String nombres;

    private LocalDate fechaNacimiento; //maximo 1900

    private String ciudad; // 40 caracteres y solo letras

    private String correo; // correo valido @sura.com.co

    private String telefono; // maximo 12 caracteres y solo numero

    private String ips; // maximo 50 caracteres

    private String grupoIngreso; // solo se admite A B o C en mayuscula

    private Boolean tienePoliza;

    private LocalDate fechaAfiliacion; // no puede ser menor a 2016

    public PACIENTE() {
    }

    public PACIENTE(long id, String nombres, LocalDate fechaNacimiento, String ciudad, String correo, String telefono, String ips, String grupoIngreso, Boolean tienePoliza, LocalDate fechaAfiliacion) {
        this.id = id;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.grupoIngreso = grupoIngreso;
        this.tienePoliza = tienePoliza;
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getGrupoIngreso() {
        return grupoIngreso;
    }

    public void setGrupoIngreso(String grupoIngreso) {
        this.grupoIngreso = grupoIngreso;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }
}
