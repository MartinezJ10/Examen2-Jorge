package com.examenjorge.jorge.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenjorge.jorge.modelos.TipoCliente;
import com.examenjorge.jorge.repositorios.TipoClienteRepositorio;
import com.examenjorge.jorge.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{
    
    @Autowired
    TipoClienteRepositorio tipoClienteRepositorio;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente){
        return tipoClienteRepositorio.save(tipoCliente);
    }


}
