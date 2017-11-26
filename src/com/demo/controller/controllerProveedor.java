/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.proveedorDaoImpl;
import com.demo.dominio.Proveedor;
import com.demo.interfaces.proveedorInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class controllerProveedor {

    private proveedorInterface dao;

    public controllerProveedor() {
        if (dao == null) {
            dao = new proveedorDaoImpl();
        }
    }

    //llama al DAO para guardar un empleado
    public boolean registrar(Proveedor proveedor) {
        boolean verificar;
        if (dao.save(proveedor)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para actualizar un empleado
    public boolean actualizar(Proveedor proveedor) {
        boolean verificar;
        if (dao.updateProveedor(proveedor)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para eliminar un empleado
    public boolean eliminar(Proveedor proveedor) {
        boolean verificar;
        if (dao.deleteProveedor(proveedor)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para obtener todos los empleados y luego los muestra en la vista
    // convertir en metod list
    public List<Proveedor> verProveedoresAll() {
        List<Proveedor> proveedores = new ArrayList<>();
        proveedores = dao.getProveedorAll();
        return proveedores;
    }
    //
}
