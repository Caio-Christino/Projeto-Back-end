package com.academy.demo.controllers;
import java.util.List;

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

import com.academy.demo.entities.Academia;
import com.academy.demo.services.AcademiaService;

@RestController
@RequestMapping("/academia")

public class AcademiaController {

    @Autowired
    AcademiaService academiaService;
    
    @GetMapping("/{idAcademia}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR" })
    public Academia getAcademia(@PathVariable Integer idAcademia) {
       Academia academia = academiaService.getAcademia(idAcademia);
       return academia;
    }

    @PostMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void cadastrarAcademia(@RequestBody Academia academia) {
        academiaService.salvar(academia);
    }

    @PutMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void atualizarTurma(@RequestBody Academia academia) {
        academiaService.atualizar(academia);
    }

    @DeleteMapping("/{idAcademia}")
    @Secured(value = { "ROLE_GESTOR" })
    public void removerTurma(@PathVariable Integer idAcademia) {
        academiaService.remover(idAcademia);
    }

    @GetMapping("/usuario/{idUsuario}")
    @Secured(value = { "ROLE_GESTOR" })
    public List<Academia> getClientePorUsuario(@PathVariable Integer idUsuario) {
        List<Academia> academias = academiaService.getClientePorUsuario(idUsuario);
        return academias;
    }
    
    
}
