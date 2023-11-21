package com.examen2.carwash.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDto {
    private int codigoCliente;
    private int codigoVehiculo;
    private int cantidadDeDias;
}
