package com.dseproj.qaliservices.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dseproj.qaliservices.model.InventarioEntity;
import com.dseproj.qaliservices.repository.InventarioRepository;
import com.dseproj.qaliservices.services.IInventario;

import jakarta.persistence.EntityNotFoundException;

@Service
public class InventarioImpl implements IInventario{

    @Autowired
    private InventarioRepository dataRepo;

    @Override
    public String addProducto(String nombreProducto) {
        return "Se procede a guardar el producto " + nombreProducto;
    }
    
    @Override
    public List<InventarioEntity> listar() {
        return (List<InventarioEntity>)dataRepo.findAll();
    }

    @Override
    public Optional<InventarioEntity> listarid(int id) {
        return dataRepo.findById(id);
    }

    @Override
    public int save(InventarioEntity inv) {
        int res = 0;
        InventarioEntity inventario = dataRepo.save(inv);
        if (!inventario.equals(null)) {
            res = 1;
        }

        return res;
    }

    @Override
    public void delete(int idInventario) {
        if (dataRepo.existsById(idInventario)) {
            dataRepo.deleteById(idInventario);
        } else {
            throw new EntityNotFoundException("Inventario no encontrado con id: " + idInventario);
        }
    }

    @Override
    public InventarioEntity update(int idInventario, InventarioEntity inv) {
        Optional<InventarioEntity> inventarioOpt = dataRepo.findById(idInventario);
        if (inventarioOpt.isPresent()) {
            InventarioEntity inventarioExistente = inventarioOpt.get();
            
            inventarioExistente.setNombreProducto(inv.getNombreProducto());
            inventarioExistente.setCantidad(inv.getCantidad());
            inventarioExistente.setEstado(inv.getEstado());
            inventarioExistente.setIdVendedor(inv.getIdVendedor());
            
            dataRepo.save(inventarioExistente);
            return inventarioExistente;
        } else {
            return null;
        }
    }
}
