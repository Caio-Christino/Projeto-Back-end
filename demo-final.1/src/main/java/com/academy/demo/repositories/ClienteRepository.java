package com.academy.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.demo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

   List<Cliente> getClientesPorAcademia(Integer idAcademia);
   Integer countByAcademiaId(Integer idAcademia);

}
