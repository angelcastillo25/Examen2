package com.examen2.carwash.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.carwash.Modelos.TipoCliente;
import com.examen2.carwash.Servicios.Implementaciones.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/examen2")
public class TipoClienteController {
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping()
    public TipoCliente creaTipoCliente(@RequestParam(name = "descripcion") String descripcion){
        return tipoClienteServiceImpl.creaTipoCliente(descripcion);
    }
}
