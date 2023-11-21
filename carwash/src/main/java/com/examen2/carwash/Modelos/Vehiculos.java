package com.examen2.carwash.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvehiculo")
    private int idVehiculo;
    private String marca;
    private int anio;
    private boolean disponible;
    @ManyToOne
    @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private TipoVehiculo idTipoVehiculo;
}
