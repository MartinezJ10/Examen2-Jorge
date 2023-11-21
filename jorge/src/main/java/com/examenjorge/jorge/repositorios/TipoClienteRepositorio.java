package com.examenjorge.jorge.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenjorge.jorge.modelos.TipoCliente;

public interface TipoClienteRepositorio extends JpaRepository<TipoCliente, Integer> {
    
}
