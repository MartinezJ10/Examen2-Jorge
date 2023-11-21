package com.examenjorge.jorge.servicios;

import java.util.List;

import com.examenjorge.jorge.modelos.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente, int tipoCliente);

    public List<Cliente> obtenerClientes();

    public Cliente clientePorID(int id);
}
