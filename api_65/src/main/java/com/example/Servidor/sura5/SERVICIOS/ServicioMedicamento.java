package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.MEDICAMENTO;
import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedicamento {
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    public MEDICAMENTO guardarMedicamento(MEDICAMENTO datosMedicamento)throws Exception{
        try{
            return iRepositorioMedicamento.save(datosMedicamento);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
