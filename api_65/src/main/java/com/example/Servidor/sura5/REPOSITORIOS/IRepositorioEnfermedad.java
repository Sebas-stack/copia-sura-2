package com.example.Servidor.sura5.REPOSITORIOS;


import com.example.Servidor.sura5.MODELOS.ENFERMEDAD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioEnfermedad extends JpaRepository<ENFERMEDAD, Long> {
}
