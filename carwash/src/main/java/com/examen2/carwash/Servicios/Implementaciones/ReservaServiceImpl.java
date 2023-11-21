package com.examen2.carwash.Servicios.Implementaciones;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.carwash.Dto.ReservaDto;
import com.examen2.carwash.Modelos.Cliente;
import com.examen2.carwash.Modelos.Reserva;
import com.examen2.carwash.Modelos.TipoVehiculo;
import com.examen2.carwash.Modelos.Vehiculos;
import com.examen2.carwash.Repositorios.ClienteRepository;
import com.examen2.carwash.Repositorios.ReservaRepository;
import com.examen2.carwash.Repositorios.VehiculosRepository;
import com.examen2.carwash.Servicios.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{
    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculosRepository vehiculosRepository;

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public String crearReserva(ReservaDto reservaDto) {
        int idVehiculo = reservaDto.getCodigoVehiculo();
        int idCliente = reservaDto.getCodigoCliente();
        int dias = reservaDto.getCantidadDeDias();
        Vehiculos vehiculo = vehiculosRepository.findById(idVehiculo).get();
        Cliente cliente = clienteRepository.findById(idCliente).get();
        Date fecha = new Date(System.currentTimeMillis());
        if(vehiculo != null && cliente != null){
            boolean disponible = vehiculo.isDisponible();
            if (disponible){
                vehiculo.setDisponible(false);
                TipoVehiculo tipoVehiculo = vehiculo.getIdTipoVehiculo();
                double precioXHora = tipoVehiculo.getPrecioXHora();
                double total = precioXHora*dias;
                Reserva reserva = new Reserva();
                reserva.setIdCliente(idCliente);
                reserva.setIdVehiculo(idVehiculo);
                reserva.setDias(dias);
                reserva.setFecha(fecha);
                reserva.setTotal(total);
                reservaRepository.save(reserva);
                return "se ha creado la reserva exitosamente";
            }
             
            return "El vehiculo ya se encuentra rentado";
        } return "Algo salio mal, uno de los paramentros no existe";
    } 
    
}
