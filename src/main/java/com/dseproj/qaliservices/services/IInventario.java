package com.dseproj.qaliservices.services;

import com.dseproj.qaliservices.dto.InventarioDTO;

public interface IInventario {
    String AddProducto(String nombreproducto);

    String guardarProducto(InventarioDTO inventarioDTO);
}
