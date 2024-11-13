package com.example.Servidor.sura5.REPOSITORIOS;


import com.example.Servidor.sura5.MODELOS.MEDICAMENTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedicamento extends JpaRepository<MEDICAMENTO, Long> {
}
