package com.dseproj.qaliservices.services;

import java.util.List;
import java.util.Optional;

import com.dseproj.qaliservices.entity.InventarioEntity;

public interface IInventario {
    String AddProducto(String nombreproducto);
    
    public List<InventarioEntity>listar();
    public Optional<InventarioEntity>listarid(int id);
    public int save (InventarioEntity inv);
    public void delete (int id);
}
