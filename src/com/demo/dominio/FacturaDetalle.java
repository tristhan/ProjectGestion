/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dominio;

import java.util.List;

/**
 *
 * @author Denisse Bailon
 */
public class FacturaDetalle {
    private int id_detalleFactura;
    private FacturaCabecera facturaCabecera;
    private List <Articulo> articulo;
    private int cantidad;
    private double precioUnitario;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int id_detalleFactura, FacturaCabecera facturaCabecera, List<Articulo> articulo, int cantidad, double precioUnitario) {
        this.id_detalleFactura = id_detalleFactura;
        this.facturaCabecera = facturaCabecera;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getId_detalleFactura() {
        return id_detalleFactura;
    }

    public void setId_detalleFactura(int id_detalleFactura) {
        this.id_detalleFactura = id_detalleFactura;
    }

    public FacturaCabecera getFacturaCabecera() {
        return facturaCabecera;
    }

    public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
        this.facturaCabecera = facturaCabecera;
    }

    public List<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(List<Articulo> articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "id_detalleFactura=" + id_detalleFactura + 
                ", facturaCabecera=" + facturaCabecera.toString() + 
                ", articulo=" + articulo + 
                ", cantidad=" + cantidad + 
                ", precioUnitario=" + precioUnitario + '}';
    }
    
}
