package com.examen2.carwash.Servicios.Implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.carwash.Modelos.Cliente;
import com.examen2.carwash.Modelos.TipoCliente;
import com.examen2.carwash.Repositorios.ClienteRepository;
import com.examen2.carwash.Repositorios.TipoClienteRepository;
import com.examen2.carwash.Servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private TipoClienteRepository tipoClienteRepository;
    @Override
    public Cliente crearCliente(Cliente cliente, int tipoCliente) {
        TipoCliente tipoCliente2 = tipoClienteRepository.findById(tipoCliente).get();
        if(tipoCliente2 != null ){
            cliente.setIdTipoCliente(tipoCliente2);
            return clienteRepository.save(cliente);
        }
        return null;
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        return clienteRepository.findById(id).get();
    }
    
}
