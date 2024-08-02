package com.dseproj.qaliservices.services;

import java.util.List;
import java.util.Optional;

import com.dseproj.qaliservices.model.InventarioEntity;

public interface IInventario {

    String addProducto(String nombreProducto);
    public List<InventarioEntity>listar();
    public Optional<InventarioEntity>listarid(int id);
    public int save (InventarioEntity inv);
    public void delete (int id);
    public InventarioEntity update(int id, InventarioEntity inv);
}
