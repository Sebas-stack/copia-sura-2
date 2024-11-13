package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.MEDICO;
import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedico {
    @Autowired
    IRepositorioMedico iRepositorioMedico;

    public MEDICO guardarMedico(MEDICO datosMedico)throws Exception{
        try{
            return iRepositorioMedico.save(datosMedico);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
