package com.dseproj.qaliservices.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class InventarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    private String nombreProducto;
    private int cantidad;
    private String estado;
    private int idVendedor;
    public InventarioEntity() {
    }
    public InventarioEntity(int idProducto, String nombreProducto, int cantidad, String estado, int idVendedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.estado = estado;
        this.idVendedor = idVendedor;
    }
    public int getIdproductos() {
        return idProducto;
    }
    public void setIdproducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getIdVendedor() {
        return idVendedor;
    }
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    @Override
    public String toString() {
        return "InventarioEntity [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", cantidad="
                + cantidad + ", estado=" + estado + ", idVendedor=" + idVendedor + "]";
    }
    
}
