package com.academy.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class Aula{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome_aula;

    @Column(nullable = false)
    private Integer num_clientes;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cliente clientes;

    @OneToOne
    @JoinColumn(nullable = false)
    private Funcionario funcionario;

}
