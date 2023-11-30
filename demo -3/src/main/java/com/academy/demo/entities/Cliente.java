package com.academy.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;


@NamedQuery(name = "Usuario.getUsuarioPorLogin", query = "SELECT u FROM Usuario u WHERE u.login=:login")

@Entity
@Getter @Setter

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String plano;

    //cliente conectado a uma academia
    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Academia academia;
}
