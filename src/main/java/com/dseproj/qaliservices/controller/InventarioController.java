package com.dseproj.qaliservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dseproj.qaliservices.dto.InventarioDTO;
import com.dseproj.qaliservices.services.IInventario;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Produces({"application/json"})
@RestController
@RequestMapping("/proj")
public class InventarioController {

    @Autowired
    private IInventario inv;

    @GetMapping(path = "/inventario/{nombreprod}")
    public String addProducto (@PathVariable("nombreprod") String nombreprod) {
        String respuesta = null;
        try {
            respuesta = inv.AddProducto(nombreprod);
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return respuesta;
    }

    @PostMapping(path = "/guardar/producto", consumes = MediaType.APPLICATION_JSON)
    public String guardarProducto(@RequestBody InventarioDTO inventarioDTO){
        String respuesta = null;
        try {
            respuesta = inv.guardarProducto(inventarioDTO);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return respuesta;
    }
}
