package com.academy.demo.services;

import org.springframework.stereotype.Service;

import com.academy.demo.repositories.AulaRepository;
import com.academy.demo.entities.Aula;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AulaService {
    @Autowired
    private AulaRepository aulaRepository;

    public Aula getAula(Integer idAula){
        Optional<Aula> aula = aulaRepository.findById(idAula);
        return aula.get();
    }
    public Aula salvar(Aula aula){
        return aulaRepository.save(aula);

    }
    public Aula atualizar(Aula aula){
        return aulaRepository.save(aula);
    }

    public void remover(Integer idAula){
        aulaRepository.deleteById(idAula);

    }
    
   /* public List<Aula> getClientePorAula(Integer idAula){
        return aulaRepository.getClientePorAula(idAula);
    }
     */

    /*public List<Aula> getFuncionarioPorAula(Integer idAula){
        return aulaRepository.getFuncionarioPorAula(idAula);
    }
     */
}
