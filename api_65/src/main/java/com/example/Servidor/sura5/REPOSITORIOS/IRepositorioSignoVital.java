package com.example.Servidor.sura5.REPOSITORIOS;


import com.example.Servidor.sura5.MODELOS.SIGNO_VITAL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioSignoVital extends JpaRepository<SIGNO_VITAL, Long> {
}
