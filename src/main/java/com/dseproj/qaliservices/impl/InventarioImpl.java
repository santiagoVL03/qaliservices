package com.dseproj.qaliservices.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dseproj.qaliservices.dto.InventarioDTO;
import com.dseproj.qaliservices.entity.InventarioEntity;
import com.dseproj.qaliservices.repository.InventarioRepository;
import com.dseproj.qaliservices.services.IInventario;

@Service
public class InventarioImpl implements IInventario{

    @Override
    public String AddProducto(String nombre) {
        return "Se procede a guardar el producto " + nombre;
    }

    @Override
    public String guardarProducto(InventarioDTO inventarioDto) {
        InventarioEntity inventarioEnt = new InventarioEntity();
        inventarioEnt.setCodigo(inventarioDto.getId_prod());
        inventarioEnt.setNombre_prod(inventarioDto.getNombre_prod());
        inventarioEnt.setCalidad_prod(inventarioDto.getCalidad_prod());
        inventarioEnt.setCantidad(inventarioDto.getCantidad());
        inventarioEnt.setCategoria(inventarioDto.getCategoria());
        inventarioEnt.setEstado_prod(inventarioDto.getEstado_prod());

        return "Guardado Exitoso";
    }
}
