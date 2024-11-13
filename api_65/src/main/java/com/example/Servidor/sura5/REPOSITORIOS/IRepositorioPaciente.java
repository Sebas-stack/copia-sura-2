package com.example.Servidor.sura5.REPOSITORIOS;


import com.example.Servidor.sura5.MODELOS.PACIENTE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioPaciente extends JpaRepository<PACIENTE,Long> {
}
