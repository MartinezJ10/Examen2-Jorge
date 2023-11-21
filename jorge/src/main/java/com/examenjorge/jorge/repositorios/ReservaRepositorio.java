package com.examenjorge.jorge.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenjorge.jorge.modelos.Reserva;

public interface ReservaRepositorio extends JpaRepository<Reserva, Integer>{
    
}
