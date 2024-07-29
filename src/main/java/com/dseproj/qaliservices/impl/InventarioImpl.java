package com.dseproj.qaliservices.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dseproj.qaliservices.entity.InventarioEntity;
import com.dseproj.qaliservices.repository.InventarioRepository;
import com.dseproj.qaliservices.services.IInventario;

@Service
public class InventarioImpl implements IInventario{

    @Autowired
    private InventarioRepository data_repo;

    @Override
    public String AddProducto(String nombre) {
        return "Se procede a guardar el producto " + nombre;
    }
    
    @Override
    public List<InventarioEntity> listar() {
        return (List<InventarioEntity>)data_repo.findAll();
    }

    @Override
    public Optional<InventarioEntity> listarid(int id) {
        return data_repo.findById(id);
    }

    @Override
    public int save(InventarioEntity inv) {
        int res = 0;
        InventarioEntity inventario = data_repo.save(inv);
        if (!inventario.equals(null)) {
            res = 1;
        }

        return res;
    }

    @Override
    public void delete(int id) {
        if (data_repo.existsById(id)) {
            data_repo.deleteById(id);
        } else {
            throw new RuntimeException("Inventario no encontrado con id: " + id);
        }
    }

    @Override
    public InventarioEntity actualizar(int id, InventarioEntity inv) {
        Optional<InventarioEntity> inventarioOpt = data_repo.findById(id);
        if (inventarioOpt.isPresent()) {
            InventarioEntity inventarioExistente = inventarioOpt.get();
            
            inventarioExistente.setNombre_prod(inv.getNombre_prod());
            inventarioExistente.setCantidad(inv.getCantidad());
            inventarioExistente.setEstado(inv.getEstado());
            inventarioExistente.setIdvend(inv.getIdvend());
            
            data_repo.save(inventarioExistente);
            return inventarioExistente;
        } else {
            return null;
        }
    }
}
