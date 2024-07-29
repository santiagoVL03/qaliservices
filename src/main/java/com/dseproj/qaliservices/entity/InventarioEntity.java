package com.dseproj.qaliservices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTOS")
public class InventarioEntity {
    
    @Id
    @Column(name = "ID_PROD")
    private int codigo;

    @Column(name = "NOMBRE_PROD")
    private String nombre_prod;

    @Column(name = "CANTIDAD")
    private int cantidad;

    @Column(name = "CALIDAD_PROD")
    private String calidad_prod;

    @Column(name = "ESTADO_PROD")
    private String estado_prod;

    @Column(name = "CATEGORIA")
    private String categoria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getCalidad_prod() {
        return calidad_prod;
    }

    public void setCalidad_prod(String calidad_prod) {
        this.calidad_prod = calidad_prod;
    }

    public String getEstado_prod() {
        return estado_prod;
    }

    public void setEstado_prod(String estado_prod) {
        this.estado_prod = estado_prod;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "InventarioEntity [codigo=" + codigo + ", nombre_prod=" + nombre_prod + ", cantidad=" + cantidad
                + ", calidad_prod=" + calidad_prod + ", estado_prod=" + estado_prod + ", categoria=" + categoria + "]";
    }

    
}
