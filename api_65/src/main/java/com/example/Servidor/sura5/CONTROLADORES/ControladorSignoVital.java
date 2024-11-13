package com.example.Servidor.sura5.CONTROLADORES;

import com.example.Servidor.sura5.MODELOS.SIGNO_VITAL;
import com.example.Servidor.sura5.SERVICIOS.ServicioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signovital")
public class ControladorSignoVital {
    @Autowired
    ServicioSignoVital servivioSignoVital;
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SIGNO_VITAL datos) {
        try {
            return ResponseEntity
                    .status((HttpStatus.OK))
                    .body(servivioSignoVital.guardarSignoVital(datos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
