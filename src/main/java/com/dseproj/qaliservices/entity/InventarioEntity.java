package com.dseproj.qaliservices.entity;

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
    private int idproductos;
    private String nombre_prod;
    private int cantidad;
    private String estado;
    private int idvend;
    public InventarioEntity() {
    }
    public InventarioEntity(int idproductos, String nombre_prod, int cantidad, String estado, int idvend) {
        this.idproductos = idproductos;
        this.nombre_prod = nombre_prod;
        this.cantidad = cantidad;
        this.estado = estado;
        this.idvend = idvend;
    }
    public int getIdproductos() {
        return idproductos;
    }
    public void setIdproductos(int idproductos) {
        this.idproductos = idproductos;
    }
    public String getNombre_prod() {
        return nombre_prod;
    }
    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
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
    public int getIdvend() {
        return idvend;
    }
    public void setIdvend(int idvend) {
        this.idvend = idvend;
    }
    @Override
    public String toString() {
        return "InventarioEntity [idproductos=" + idproductos + ", nombre_prod=" + nombre_prod + ", cantidad="
                + cantidad + ", estado=" + estado + ", idvend=" + idvend + "]";
    }
    
}
