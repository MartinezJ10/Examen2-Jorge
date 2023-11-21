package com.examenjorge.jorge.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenjorge.jorge.modelos.Cliente;
import com.examenjorge.jorge.modelos.TipoCliente;
import com.examenjorge.jorge.repositorios.ClienteRepositorio;
import com.examenjorge.jorge.repositorios.TipoClienteRepositorio;
import com.examenjorge.jorge.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    private TipoClienteRepositorio tipoClienteRepositorio;
    
    @Override
    public Cliente crearCliente(Cliente cliente, int tipoCliente){
        TipoCliente tipoClienteAsociado = tipoClienteRepositorio.findById(tipoCliente).get();

        if(tipoClienteAsociado != null){
            cliente.setIdTipoCliente(tipoClienteAsociado);
            return clienteRepositorio.save(cliente);
        }
        return null;
    }

    @Override
    public  List<Cliente> obtenerClientes(){
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente clientePorID(int id){
        Cliente clienteEncontrado = clienteRepositorio.findById(id).get();
 
        if (clienteEncontrado != null) {
            return clienteEncontrado;
        }
        return null;
    }
}
