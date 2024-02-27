package com.facturas.tarea3back.controllers;

import com.facturas.tarea3back.model.Cliente;
import com.facturas.tarea3back.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{nombre}")
    public List<Cliente> mostrarPorUsuario(@PathVariable String nombre){
        return clienteService.showByUsername(nombre);
    }
}
