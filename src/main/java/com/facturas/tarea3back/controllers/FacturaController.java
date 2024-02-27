package com.facturas.tarea3back.controllers;

import com.facturas.tarea3back.model.Factura;
import com.facturas.tarea3back.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping
    public Factura saveFactura(@RequestBody Factura factura) {
        return facturaService.guardarFactura(factura);
    }
}
