package com.academy.demo.repositories;

import com.academy.demo.entities.Cliente;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository <Cliente, Integer>  {
    List<Cliente> getClientePorAcademia(Integer idAcademia);
    
}
