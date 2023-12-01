package com.academy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.demo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

  Usuario getUsuarioPorLogin(String login);
    
}
