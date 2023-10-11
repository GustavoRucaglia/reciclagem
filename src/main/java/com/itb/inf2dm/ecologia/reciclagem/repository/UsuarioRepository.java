package com.itb.inf2dm.ecologia.reciclagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itb.inf2dm.ecologia.reciclagem.model.Reciclador;

public interface UsuarioRepository  extends JpaRepository<Reciclador, Long> {

}
