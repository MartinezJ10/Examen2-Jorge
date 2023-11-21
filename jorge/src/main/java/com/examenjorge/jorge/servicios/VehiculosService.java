package com.examenjorge.jorge.servicios;

import java.util.List;

import com.examenjorge.jorge.modelos.Vehiculos;

public interface VehiculosService {
    
    public Vehiculos crearVehiculos(Vehiculos vehiculos,int tipoVehiculo);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos vehiculoPorID(int id);

} 
