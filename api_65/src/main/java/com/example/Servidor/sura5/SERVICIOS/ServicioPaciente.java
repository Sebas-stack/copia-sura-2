package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaciente {
    //1.Llamar el repositorio pasiente
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //2.se programan las funciones para distinatas operaciones en la bd

    //Funciona para guardar datos

    public PACIENTE guardarPaciente(PACIENTE datosPaciente)throws Exception{
        try{
            return iRepositorioPaciente.save(datosPaciente);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
