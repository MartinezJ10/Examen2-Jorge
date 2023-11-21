package com.examenjorge.jorge.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenjorge.jorge.modelos.TipoVehiculo;
import com.examenjorge.jorge.servicios.impl.TipoVehiculoServiceImpl;


@RestController
@RequestMapping("/api/tipovehiculos")
public class TipoVehiculoControlador {
     
    @Autowired
    TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo descripcion){
        return tipoVehiculoServiceImpl.crearTipoVehiculo(descripcion);
    }


}
