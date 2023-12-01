package com.academy.demo.repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.demo.entities.Academia;

public interface AcademiaRepository extends JpaRepository<Academia, Integer> {
   // List<Academia> getClientePorUsuario(Integer idUsuario);
   // List<Academia> getFuncionarioPorUsuario(Integer idFuncionario);
    
}
