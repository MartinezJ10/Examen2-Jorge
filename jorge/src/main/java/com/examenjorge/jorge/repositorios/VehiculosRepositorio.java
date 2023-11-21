package com.examenjorge.jorge.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenjorge.jorge.modelos.Vehiculos;

public interface VehiculosRepositorio extends JpaRepository<Vehiculos, Integer> {
    
}
