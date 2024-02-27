package com.facturas.tarea3back.services;

import com.facturas.tarea3back.model.Factura;
import com.facturas.tarea3back.repositories.ClienteRepository;
import com.facturas.tarea3back.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura guardarFactura(Factura factura) {
        return facturaRepository.save(factura);
    }
}
