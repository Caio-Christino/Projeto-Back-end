package com.academy.demo.services;

import org.springframework.stereotype.Service;

import com.academy.demo.repositories.AulaPersonalRepository;
import com.academy.demo.entities.AulaPersonal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AulaPersonalService {
    @Autowired
    private AulaPersonalRepository aulaRepository;

    public AulaPersonal getAula(Integer idAula){
        Optional<AulaPersonal> aula = aulaRepository.findById(idAula);
        return aula.get();
    }

    public AulaPersonal salvar(AulaPersonal aula)throws RuntimeException{
        if(!("instrutor".equals(aula.getFuncionario().getCargo()))){
            throw new RuntimeException("Funcionario não é um instrutor");
        }
        return aulaRepository.save(aula);

    }
    public AulaPersonal atualizar(AulaPersonal aula){
        return aulaRepository.save(aula);
    }

    public void remover(Integer idAula){
        aulaRepository.deleteById(idAula);

    }
}
