package com.examenjorge.jorge.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examenjorge.jorge.modelos.Vehiculos;
import com.examenjorge.jorge.servicios.impl.VehiculosServiceImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculosControlador {
    @Autowired
    VehiculosServiceImpl vehiculosServiceImpl;

    @PostMapping("/guardar")
    public Vehiculos guardarVehiculo(@RequestBody Vehiculos nvoVehiculo, @RequestParam(name="tipoVehiculo") int tipoVehiculo){
        return this.vehiculosServiceImpl.crearVehiculos(nvoVehiculo, tipoVehiculo);
    }

    @GetMapping(value="/listar")
    public List<Vehiculos> obtenerVehiculos() {
        return vehiculosServiceImpl.obtenerVehiculos();
    }

    @GetMapping(value="/buscar/{id}")
    public Vehiculos vehiculosPorId(@PathVariable int id) {
        return vehiculosServiceImpl.vehiculoPorID(id);
    }
}
