/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.empleadoDaoImpl;
import com.demo.dominio.Empleado;
import com.demo.interfaces.empleadoInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class controllerEmpleado {

    private empleadoInterface dao;

    public controllerEmpleado() {
        if (dao == null) {
            dao = new empleadoDaoImpl();
        }
    }

    //llama al DAO para guardar un empleado
    public boolean registrar(Empleado empleado) {
        boolean verificar;
        if (dao.save(empleado)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para actualizar un empleado
    public boolean actualizar(Empleado empleado) {
        boolean verificar;
        if (dao.updateEmpleado(empleado)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para eliminar un empleado
    public boolean eliminar(Empleado empleado) {
        boolean verificar;
        if (dao.deleteEmpleado(empleado)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para obtener todos los empleados y luego los muestra en la vista
    // convertir en metod list
    public List<Empleado> verEmpleadoByCedula(String cedula) {
        List<Empleado> empleados = new ArrayList<>();
        empleados = dao.getEmpleadoByCedula(cedula);
        return empleados;
    }

    //
    public List<Empleado> verEmpleadoAll() {
        List<Empleado> empleados = new ArrayList<>();
        empleados = dao.getEmpleadoAll();
        return empleados;
    }
}
