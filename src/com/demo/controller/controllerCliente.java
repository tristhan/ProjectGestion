/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dominio.Cliente;
import com.demo.dao.clienteDaoImpl;
import java.util.ArrayList;
import java.util.List;
import com.demo.interfaces.clienteInterface;

/**
 *
 * @author Jona
 */
public class controllerCliente {

    private clienteInterface dao;

    public controllerCliente() {
        if (dao == null) {
            dao = new clienteDaoImpl();
        }
    }

    //llama al DAO para guardar un cliente
    public boolean registrar(Cliente cliente) {
        boolean verificar;
        if (dao.save(cliente)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para actualizar un cliente
    public boolean actualizar(Cliente cliente) {
        boolean verificar;
        if (dao.updateCliente(cliente)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para eliminar un cliente
    public boolean eliminar(Cliente cliente) {
        boolean verificar;
        if (dao.deleteCliente(cliente)) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public List<Cliente> verClientesAll() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes = dao.getClienteAll();
        return clientes;
    }

}//
