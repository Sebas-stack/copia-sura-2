package com.example.Servidor.sura5.REPOSITORIOS;

import com.example.Servidor.sura5.MODELOS.MEDICO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedico extends JpaRepository<MEDICO,Long> {
}
