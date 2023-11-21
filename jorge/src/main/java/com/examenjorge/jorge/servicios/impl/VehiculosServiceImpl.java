package com.examenjorge.jorge.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenjorge.jorge.modelos.TipoVehiculo;
import com.examenjorge.jorge.modelos.Vehiculos;
import com.examenjorge.jorge.repositorios.TipoVehiculoRepositorio;
import com.examenjorge.jorge.repositorios.VehiculosRepositorio;
import com.examenjorge.jorge.servicios.VehiculosService;

@Service
public class VehiculosServiceImpl implements VehiculosService{
    
    @Autowired
    VehiculosRepositorio vehiculosRepositorio;
    TipoVehiculoRepositorio tipoVehiculoRepositorio;

    @Override
    public Vehiculos crearVehiculos(Vehiculos vehiculos, int tipoVehiculo){
         TipoVehiculo tipoVehiculoAsociado = this.tipoVehiculoRepositorio.findById(tipoVehiculo).get();

        if(tipoVehiculoAsociado != null){
            vehiculos.setIdTipoVehiculo(tipoVehiculoAsociado);
            return vehiculosRepositorio.save(vehiculos);
        }
        return null;
    } 
 
    @Override
    public List<Vehiculos> obtenerVehiculos(){
        return vehiculosRepositorio.findAll();
    }

    @Override
    public Vehiculos vehiculoPorID(int id){
        Vehiculos vehiculoEncontrado = vehiculosRepositorio.findById(id).get();
 
        if (vehiculoEncontrado != null) {
            return vehiculoEncontrado;
        }
        return null;
    }

}
