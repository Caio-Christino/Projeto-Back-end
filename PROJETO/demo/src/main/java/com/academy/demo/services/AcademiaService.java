package com.academy.demo.services;

import org.springframework.stereotype.Service;

import com.academy.demo.repositories.AcademiaRepository;
import com.academy.demo.entities.Academia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AcademiaService {
    @Autowired
    private AcademiaRepository academiaRepository;

    public Academia getAcademia(Integer idAcademia){
        Optional<Academia> academia = academiaRepository.findById(idAcademia);
        return academia.get();
        
        

    }
    public Academia salvar(Academia academia){
        return academiaRepository.save(academia);

    }
    public Academia atualizar(Academia academia){
        return academiaRepository.save(academia);
    }

     public void remover(Integer idAcademia){
        academiaRepository.deleteById(idAcademia);

    }
    /*
    public List<Academia> getClientePorUsuario(Integer idUsuario){
        return academiaRepository.getClientePorUsuario(idUsuario);
    }
     */
}
