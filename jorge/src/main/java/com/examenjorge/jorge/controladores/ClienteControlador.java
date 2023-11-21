package com.examenjorge.jorge.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenjorge.jorge.modelos.Cliente;
import com.examenjorge.jorge.servicios.impl.ClienteServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/cliente")
public class ClienteControlador {

    @Autowired 
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente nvoCliente, @RequestParam(name="tipoCliente") int tipoCliente){
        return this.clienteServiceImpl.crearCliente(nvoCliente, tipoCliente);
    }

    @GetMapping("/listar")
    public List<Cliente> obtenerClientes() {
        return clienteServiceImpl.obtenerClientes();
    }

    @GetMapping("/buscar/{id}")
    public Cliente clientePorId(@PathVariable int id) {
        return clienteServiceImpl.clientePorID(id);
    }

    
}
