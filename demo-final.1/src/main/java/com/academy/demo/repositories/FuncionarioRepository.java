package com.academy.demo.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.academy.demo.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {

    List<Funcionario> getFuncionariosPorAcademia(Integer idAcademia);
    Integer countByAcademiaId(Integer idAcademia);
    
   
}
