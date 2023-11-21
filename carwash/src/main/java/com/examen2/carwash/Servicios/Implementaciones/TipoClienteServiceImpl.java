package com.examen2.carwash.Servicios.Implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.carwash.Modelos.TipoCliente;
import com.examen2.carwash.Repositorios.TipoClienteRepository;
import com.examen2.carwash.Servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

    @Autowired
    private TipoClienteRepository tipoClienteRepository;
    @Override
    public TipoCliente creaTipoCliente(String tipoCliente) {
        TipoCliente tipoCliente2 = new TipoCliente();
        tipoCliente2.setDescripcion(tipoCliente);
        return tipoClienteRepository.save(tipoCliente2);
    }
    
}
