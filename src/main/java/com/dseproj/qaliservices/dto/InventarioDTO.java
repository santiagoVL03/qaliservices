package com.dseproj.qaliservices.dto;

import java.io.Serializable;

public class InventarioDTO implements Serializable{

    private Integer id_prod;
    private String nombre_prod;
    private Integer cantidad;
    private String calidad_prod;
    private String estado_prod;
    private String categoria;

    public Integer getId_prod() {
        return id_prod;
    }
    public void setId_prod(Integer id_prod) {
        this.id_prod = id_prod;
    }
    public String getNombre_prod() {
        return nombre_prod;
    }
    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
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

    
}
