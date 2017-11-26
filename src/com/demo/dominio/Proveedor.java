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
public class Proveedor {
    private int id_proveedor;
    private String nombre;
    private String apellido;
    private String empresa;
    private String ruc;
    private String telefono;
    private int celular;
    private String direccion;
    private String correo;
    List<Articulo> articulos;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Proveedor(int id_proveedor, String nombre, String apellido, String empresa, String ruc, String telefono, int celular, String direccion, String correo, List<Articulo> articulos) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.ruc = ruc;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
        this.articulos = articulos;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id_proveedor=" + id_proveedor + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", empresa=" + empresa + 
                ", ruc=" + ruc + 
                ", telefono=" + telefono + 
                ", celular=" + celular + 
                ", direccion=" + direccion + 
                ", correo=" + correo + 
                /*", articulos=" + articulos.toString() + */
                '}';
    }
    
    
}
