package com.dseproj.qaliservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dseproj.qaliservices.entity.InventarioEntity;
import com.dseproj.qaliservices.services.IInventario;

@RestController
@RequestMapping("/proj")
public class InventarioController {

    @Autowired
    private IInventario inv;

    @GetMapping(path = "/inventario/buscar/{nombreprod}")
    public String addProducto (@PathVariable("nombreprod") String nombreprod) {
        String respuesta = null;
        try {
            respuesta = inv.AddProducto(nombreprod);
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return respuesta;
    }

    @GetMapping(path = "/inventario/listar")
    public String listar (){
        List<InventarioEntity> productos_inv = inv.listar();
        String productosString = productos_inv.toString();
        
        return productosString;
    }
}
