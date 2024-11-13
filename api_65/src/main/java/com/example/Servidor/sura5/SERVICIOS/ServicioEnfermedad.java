package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.ENFERMEDAD;
import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEnfermedad {
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    public ENFERMEDAD guardarEnfermedad(ENFERMEDAD datosEnfermedad)throws Exception{
        try{
            return iRepositorioEnfermedad.save(datosEnfermedad);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
