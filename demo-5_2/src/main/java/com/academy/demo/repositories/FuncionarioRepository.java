package com.academy.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.demo.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {
    
   
}
