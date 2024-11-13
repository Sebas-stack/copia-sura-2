package com.example.Servidor.sura5.CONTROLADORES;

import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.SERVICIOS.ServicioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicamento")
public class ControladorMedicamento {
    @Autowired
    ServicioPaciente servicioPaciente;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody PACIENTE datos) {
        try {
            return ResponseEntity
                    .status((HttpStatus.OK))
                    .body(servicioPaciente.guardarPaciente(datos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}


