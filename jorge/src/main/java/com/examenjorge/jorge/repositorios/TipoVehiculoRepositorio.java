package com.examenjorge.jorge.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenjorge.jorge.modelos.TipoVehiculo;

public interface TipoVehiculoRepositorio extends JpaRepository<TipoVehiculo, Integer>{
    
}
