package com.examenjorge.jorge.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenjorge.jorge.modelos.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
    
}
