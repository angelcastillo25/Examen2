package com.examen2.carwash.Servicios.Implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.carwash.Modelos.TipoVehiculo;
import com.examen2.carwash.Repositorios.TipoVehiculoRepository;
import com.examen2.carwash.Servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;
    @Override
    public TipoVehiculo creaTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return tipoVehiculoRepository.save(tipoVehiculo);
    }
    
}
