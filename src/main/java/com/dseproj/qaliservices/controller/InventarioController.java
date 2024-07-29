package com.dseproj.qaliservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dseproj.qaliservices.services.IInventario;

import jakarta.ws.rs.Produces;
import org.springframework.web.bind.annotation.RequestParam;


@Produces({"application/json"})
@RestController
@RequestMapping("/proj")
public class InventarioController {

    @Autowired
    private IInventario inv;

    @GetMapping(path = "/inventario")
    public String addProducto () {
        String respuesta = null;
        try {
            respuesta = inv.AddProducto();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return respuesta;
    }
    
}
