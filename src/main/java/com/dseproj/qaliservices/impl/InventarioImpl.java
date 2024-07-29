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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarid'");
    }

    @Override
    public int save(InventarioEntity inv) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
