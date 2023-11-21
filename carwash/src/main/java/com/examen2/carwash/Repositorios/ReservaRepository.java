package com.examen2.carwash.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.carwash.Modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
    
}
