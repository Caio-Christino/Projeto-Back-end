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

import com.academy.demo.entities.Cliente;
import com.academy.demo.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    
    @GetMapping("/{idCliente}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_FUNCIONARIO", "ROLE_CLIENTE" })
    public Cliente getCliente(@PathVariable Integer idCliente) {
       Cliente cliente = clienteService.getCliente(idCliente);
       return cliente;
    }

    @PostMapping
    @Secured(value = { "ROLE_FUNCIONARIO", "ROLE_ADMIN", "ROLE_CLIENTE" })
    public void cadastrarCliente(@RequestBody Cliente cliente) {
        clienteService.salvar(cliente);
    }

    @PutMapping
    @Secured(value = { "ROLE_FUNCIONARIO", "ROLE_ADMIN", "ROLE_CLIENTE" })
    public void atualizarCliente(@RequestBody Cliente cliente) {
        clienteService.atualizar(cliente);
    }

    @DeleteMapping("/{idCliente}")
    @Secured(value = { "ROLE_FUNCIONARIO", "ROLE_ADMIN", "ROLE_CLIENTE" })
    public void removerCliente(@PathVariable Integer idCliente) {
        clienteService.remover(idCliente);
    }
    
}
