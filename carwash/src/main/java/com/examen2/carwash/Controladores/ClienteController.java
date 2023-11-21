package com.examen2.carwash.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.carwash.Modelos.Cliente;
import com.examen2.carwash.Servicios.Implementaciones.ClienteServiceImpl;

@RestController
@RequestMapping("/api/examen2/cliente")
public class ClienteController {
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/guardar")
    public Cliente crearCliente(@RequestBody Cliente cliente, @RequestParam(name = "idtipocliente") int idTipoCliente){
        return clienteServiceImpl.crearCliente(cliente, idTipoCliente);
    }

    @GetMapping("/obtenertodos")
    public List<Cliente> obtenenerClientes(){
        return clienteServiceImpl.obtenerTodosLosClientes();
    }

    @GetMapping("/{idcliente}")
    public Cliente buscaClientePorId(@PathVariable(name = "idcliente") int cliente){
        return clienteServiceImpl.obtenerClientePorId(cliente);
    }
}
