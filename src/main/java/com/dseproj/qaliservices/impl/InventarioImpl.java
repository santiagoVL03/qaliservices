package com.dseproj.qaliservices.impl;

import org.springframework.stereotype.Service;

import com.dseproj.qaliservices.services.IInventario;

@Service
public class InventarioImpl implements IInventario{

    @Override
    public String AddProducto() {
        return "Papas";
    }
}
