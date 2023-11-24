package com.academy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.demo.entities.Academia;

public interface AcademiaRepository extends JpaRepository<Academia, Integer> {

    
}
