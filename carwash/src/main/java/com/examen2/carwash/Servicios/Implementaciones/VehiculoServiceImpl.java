package com.examen2.carwash.Servicios.Implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.carwash.Modelos.Vehiculos;
import com.examen2.carwash.Repositorios.VehiculosRepository;
import com.examen2.carwash.Servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculosRepository vehiculosRepository;
    @Override
    public Vehiculos crearVehiculo(Vehiculos vehiculos) {
        return vehiculosRepository.save(vehiculos);
    }

    @Override
    public List<Vehiculos> obtenerTodosLosVehiculos() {
        return vehiculosRepository.findAll();
    }

    @Override
    public Vehiculos obtenerVehiculoPorId(int idVehiculo) {
        return vehiculosRepository.findById(idVehiculo).get();
    }
    
}
