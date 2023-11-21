package com.examen2.carwash.Servicios;

import java.util.List;

import com.examen2.carwash.Modelos.Vehiculos;

public interface VehiculoService {
    public Vehiculos crearVehiculo(Vehiculos vehiculos);
    public List<Vehiculos> obtenerTodosLosVehiculos();
    public Vehiculos obtenerVehiculoPorId(int idVehiculo);
}
