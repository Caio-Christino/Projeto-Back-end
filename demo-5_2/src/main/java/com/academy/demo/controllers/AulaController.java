package com.academy.demo.controllers;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.demo.entities.Aula;
import com.academy.demo.services.AulaService;

@RestController
@RequestMapping("/aula")

public class AulaController {

    @Autowired
    AulaService aulaService;
    
    @GetMapping("/{idAula}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_FUNCIONARIO","ROLE_CLIENTE" })
    public Aula getAula(@PathVariable Integer idAula) {
       Aula aula = aulaService.getAula(idAula);
       return aula;
    }

    @PostMapping
    @Secured(value = { "ROLE_FUNCIONARIO", "ROLE_ADMIN" })
    public void cadastrarAula(@RequestBody Aula aula) {
        aulaService.salvar(aula);
    }

    @PutMapping
    @Secured(value = { "ROLE_FUNCIONARIO","ROLE_ADMIN" })
    public void atualizarAula(@RequestBody Aula aula) {
        aulaService.atualizar(aula);
    }

    @DeleteMapping("/{idAula}")
    @Secured(value = { "ROLE_ADMIN","ROLE_FUNCIONARIO" })
    public void removerAula(@PathVariable Integer idAula) {
        aulaService.remover(idAula);
    }

   /*  @GetMapping("/usuario/{idUsuario}")
    @Secured(value = { "ROLE_FUNCIONARIO" })
    public List<Aula> getClientePorAula(@PathVariable Integer idAula) {
        List<Aula> aulas = aulaService.getClientePorAula(idAula);
        return aulas;
    }*/
    
    
}
