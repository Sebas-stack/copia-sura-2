package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.MODELOS.SIGNO_VITAL;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioSignoVital {
    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;
    public SIGNO_VITAL guardarSignoVital(SIGNO_VITAL datossignovital)throws Exception{
        try{
            return iRepositorioSignoVital.save(datossignovital);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}

