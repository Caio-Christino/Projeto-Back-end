package com.academy.demo.services;

import org.springframework.stereotype.Service;

import com.academy.demo.entities.Funcionario;
import com.academy.demo.repositories.FuncionarioRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario getFuncionario(Integer idFuncionario){
        Optional<Funcionario> funcionario = funcionarioRepository.findById(idFuncionario);
        return funcionario.get();
    }
    public Funcionario salvar(Funcionario funcionario){
        Integer idAcademia = funcionario.getAcademia().getId();
        Integer numFuncionarios = funcionarioRepository.countByAcademiaId(idAcademia);
        Integer MaxFuncionarios = 5;
        
        if(MaxFuncionarios <= numFuncionarios){
            throw new RuntimeException("Academia está com sua capacidade máxima de funcionarios");
        }
        return funcionarioRepository.save(funcionario);

    }
    public Funcionario atualizar(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

     public void remover(Integer idFuncionario){
        funcionarioRepository.deleteById(idFuncionario);
    }

    public List<Funcionario> getFuncionariosPorAcademia(Integer idAcademia){
        return funcionarioRepository.getFuncionariosPorAcademia(idAcademia);
    }
    public Integer getNumFuncionariosPorAcademia(Integer idAcademia){
        return funcionarioRepository.getFuncionariosPorAcademia(idAcademia).size();
    }

     
}