package com.examenjorge.jorge.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenjorge.jorge.modelos.TipoVehiculo;
import com.examenjorge.jorge.repositorios.TipoVehiculoRepositorio;
import com.examenjorge.jorge.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    TipoVehiculoRepositorio tipoVehiculoRepositorio;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo){
        return tipoVehiculoRepositorio.save(tipoVehiculo);
    }

}
