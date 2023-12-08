package com.academy.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.academy.demo.entities.AulaPersonal;

public interface AulaPersonalRepository extends JpaRepository<AulaPersonal, Integer>{

  
}