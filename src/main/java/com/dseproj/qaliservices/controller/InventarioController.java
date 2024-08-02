package com.dseproj.qaliservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dseproj.qaliservices.domain.InventarioEntity;
import com.dseproj.qaliservices.services.IInventario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/proj")
public class InventarioController {

    @Autowired
    private IInventario inv;

    @GetMapping(path = "/inventario/buscar/{nombreprod}")
    public String addProducto (@PathVariable("nombreprod") String nombreProducto) {
        String respuesta = null;
        try {
            respuesta = inv.addProducto(nombreProducto);
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return respuesta;
    }

    @GetMapping(path = "/inventario/listar")
    public List<InventarioEntity> listar (){
        List<InventarioEntity> productos_inv = inv.listar();
        
        return productos_inv;
    }
    @PostMapping("/inventario/guardar")
    public int save(@RequestBody InventarioEntity inventarioEntity) {
        int respuesta = 0;
        respuesta = inv.save(inventarioEntity);
        return respuesta;
    }
    @PostMapping("/inventario/editar/{id}")
    public ResponseEntity<String> editar(@PathVariable int id, @RequestBody InventarioEntity inventarioEntity) {
        InventarioEntity inventario = inv.update(id, inventarioEntity);

        if (inventario != null) {
            return ResponseEntity.ok("Inventario actualizado correctamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inventario no encontrado.");
        }
    }

    @DeleteMapping("/inventario/eliminar/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        try {
            inv.delete(id);
            return ResponseEntity.ok("Inventario eliminado correctamente.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
