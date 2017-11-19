/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dominio;

import java.sql.Date;
import java.util.List;

/**
 * @author Denisse Bailon
 */
public class FacturaCabecera {
    private int id_facturaCab;
    private Cliente cliente;
    private Empleado empleado;
    private Date fecha;
    private String Telefono;
    private String direccion;
    private double descuento;
    private double subtotal;
    private double iva;
    private double totalPagar;
    private FacturaDetalle facturaDetalle;

    public FacturaCabecera() {
    }

    public FacturaCabecera(int id_facturaCab, Cliente cliente, Empleado empleado, Date fecha, String Telefono, double descuento, double subtotal, double iva, double totalPagar, FacturaDetalle facturaDetalle) {
        this.id_facturaCab = id_facturaCab;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;
        this.Telefono = Telefono;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.iva = iva;
        this.totalPagar = totalPagar;
        this.facturaDetalle = facturaDetalle;
    }

    public int getId_facturaCab() {
        return id_facturaCab;
    }

    public void setId_facturaCab(int id_facturaCab) {
        this.id_facturaCab = id_facturaCab;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public FacturaDetalle getFacturaDetalle() {
        return facturaDetalle;
    }

    public void setFacturaDetalle(FacturaDetalle facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }

    @Override
    public String toString() {
        return "FacturaCabecera{" + "id_facturaCab=" + id_facturaCab + 
                ", cliente=" + cliente.toString() + 
                ", empleado=" + empleado.toString() + 
                ", fecha=" + fecha + 
                ", Telefono=" + Telefono + 
                ", direccion=" + direccion + 
                ", descuento=" + descuento + 
                ", subtotal=" + subtotal + 
                ", iva=" + iva + 
                ", totalPagar=" + totalPagar + 
                ", facturaDetalle=" + facturaDetalle.toString() + '}';
    }

    
}
