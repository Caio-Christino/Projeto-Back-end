package com.academy.demo.services;

import org.springframework.stereotype.Service;

import com.academy.demo.repositories.ClienteRepository;
import com.academy.demo.entities.Cliente;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente getCliente(Integer idCliente){
        Optional<Cliente> cliente = clienteRepository.findById(idCliente);
        return cliente.get();
    }
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);

    }
    public Cliente atualizar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

     public void remover(Integer idCliente){
        clienteRepository.deleteById(idCliente);
    }
     
}