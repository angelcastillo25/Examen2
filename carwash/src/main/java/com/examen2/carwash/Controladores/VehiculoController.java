package com.examen2.carwash.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examen2.carwash.Modelos.Vehiculos;
import com.examen2.carwash.Servicios.Implementaciones.VehiculoServiceImpl;

@RequestMapping("/api/examen2/vehiculo")
public class VehiculoController {
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/guardar")
    public Vehiculos guardarVehiculo(@RequestBody Vehiculos vehiculos){
        return vehiculoServiceImpl.crearVehiculo(vehiculos);
    }
}
