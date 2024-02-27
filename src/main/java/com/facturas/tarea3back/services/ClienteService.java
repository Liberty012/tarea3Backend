package com.facturas.tarea3back.services;

import com.facturas.tarea3back.model.Cliente;
import com.facturas.tarea3back.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> showByUsername(String nombre){
        return clienteRepository.findByUsername(nombre);
    }

}
