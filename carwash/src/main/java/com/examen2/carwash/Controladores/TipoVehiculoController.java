package com.examen2.carwash.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.carwash.Modelos.TipoVehiculo;
import com.examen2.carwash.Servicios.Implementaciones.TipoVehiculoServiceImpl;
@RestController
@RequestMapping("/api/examen2/tipovehiculo")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping()
    public TipoVehiculo creaTipoCliente(@RequestBody TipoVehiculo tipoVehiculo){
        return tipoVehiculoServiceImpl.creaTipoVehiculo(tipoVehiculo);
    }
}
