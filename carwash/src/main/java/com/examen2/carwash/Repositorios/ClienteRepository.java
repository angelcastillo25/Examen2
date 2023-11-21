package com.examen2.carwash.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.carwash.Modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
