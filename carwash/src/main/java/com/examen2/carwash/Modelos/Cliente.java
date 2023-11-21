package com.examen2.carwash.Modelos;

import java.util.Date;

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
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private int idCliente;
    private String nombre;
    private String apellido;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    @ManyToOne
    @JoinColumn(name = "idtipocliente", referencedColumnName = "idtipocliente")
    private TipoCliente idTipoCliente;
}
