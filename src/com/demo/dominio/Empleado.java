/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dominio;

import java.util.List;

/**
 *
 * @author Jona
 */
public class Empleado {
    private int id_empleado;
    private String nombre;
    private String apellido;
    private String cedulaIdentidad;
    private String correo;
    private String direccion;
    private String telefono;
    List<FacturaCabecera> factura;
    private User usuraio;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String apellido, String cedulaIdentidad, String correo, String direccion, String telefono, List<FacturaCabecera> factura, User usuraio) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedulaIdentidad = cedulaIdentidad;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.factura = factura;
        this.usuraio = usuraio;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<FacturaCabecera> getFactura() {
        return factura;
    }

    public void setFactura(List<FacturaCabecera> factura) {
        this.factura = factura;
    }

    public User getUsuraio() {
        return usuraio;
    }

    public void setUsuraio(User usuraio) {
        this.usuraio = usuraio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", cedulaIdentidad=" + cedulaIdentidad + 
                ", correo=" + correo + 
                ", direccion=" + direccion + 
                ", telefono=" + telefono + 
                ", factura=" + factura + 
                ", usuraio=" + usuraio + '}';
    }
    
}
