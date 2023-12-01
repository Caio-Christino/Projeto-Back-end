package com.academy.demo.controllers;
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

import com.academy.demo.entities.Funcionario;
import com.academy.demo.services.FuncionarioService;


@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioService funcionarioService;
    
    @GetMapping("/{idFuncionario}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_FUNCIONARIO", "ROLE_CLIENTE" })
    public Funcionario getFuncionario(@PathVariable Integer idFuncionario) {
       Funcionario funcionario = funcionarioService.getFuncionario(idFuncionario);
       return funcionario;
    }

    @PostMapping
    @Secured(value = { "ROLE_ADMIN" })
    public void cadastrarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.salvar(funcionario);
    }

    @PutMapping
    @Secured(value = { "ROLE_ADMIN" })
    public void atualizarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.atualizar(funcionario);
    }

    @DeleteMapping("/{idFuncionario}")
    @Secured(value = { "ROLE_ADMIN" })
    public void removerFuncionario(@PathVariable Integer idFuncionario) {
        funcionarioService.remover(idFuncionario);
    }
    

    @GetMapping("/funcionario/{idFuncionario}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_FUNCIONARIO" })
    public Funcionario getFuncionariosPorAcademia(@PathVariable Integer idFuncionario) {
       Funcionario funcionario = funcionarioService.getFuncionario(idFuncionario);
       return funcionario;
    }

}
