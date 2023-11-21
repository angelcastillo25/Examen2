package com.examen2.carwash.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.carwash.Modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
