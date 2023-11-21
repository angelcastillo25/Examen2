package com.examen2.carwash.Servicios;

import java.util.List;

import com.examen2.carwash.Modelos.Cliente;

public interface ClienteService {
    public Cliente crearCliente(Cliente cliente, int tipoCliente);
    public List<Cliente> obtenerTodosLosClientes();
    public Cliente obtenerClientePorId(int id);
}
