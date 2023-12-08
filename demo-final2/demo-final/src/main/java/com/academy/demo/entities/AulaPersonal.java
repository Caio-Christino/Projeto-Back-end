package com.academy.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class AulaPersonal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(nullable = false)
    private Funcionario funcionario;

    @OneToOne
    @JoinColumn(nullable = false)
    private Cliente cliente;

}
