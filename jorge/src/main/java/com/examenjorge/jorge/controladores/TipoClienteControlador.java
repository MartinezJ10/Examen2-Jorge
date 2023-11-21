package com.examenjorge.jorge.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenjorge.jorge.modelos.TipoCliente;
import com.examenjorge.jorge.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteControlador {

    @Autowired 
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente nvoTipo){
        return tipoClienteServiceImpl.crearTipoCliente(nvoTipo);
    }
    
}
