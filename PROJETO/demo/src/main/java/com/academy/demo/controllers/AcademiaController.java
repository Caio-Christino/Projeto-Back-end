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
    
    @GetMapping("/{idTurma}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR" })
    public Academia getAcademia(@PathVariable Integer idAcademia) {
       Academia academia = AcademiaService.getAcademia(idAcademia);
       return academia;
    }

    @PostMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void cadastrarAcademia(@RequestBody Academia academia) {
        AcademiaService.salvar(academia);
    }

    @PutMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void atualizarTurma(@RequestBody Turma turma) {
        turmaService.atualizar(turma);
    }

    @DeleteMapping("/{idTurma}")
    @Secured(value = { "ROLE_GESTOR" })
    public void removerTurma(@PathVariable Integer idTurma) {
        turmaService.remover(idTurma);
    }

    @GetMapping("/curso/{idCurso}")
    @Secured(value = { "ROLE_GESTOR" })
    public List<Turma> getTurmasPorCurso(@PathVariable Integer idCurso) {
        List<Turma> turmas = turmaService.getTurmasPorCurso(idCurso);
        return turmas;
    }
    
    
}
