/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.loginDaoImpl;
import com.demo.dominio.User;
import com.demo.interfaces.loginInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class controllerLogin {
    private loginInterface dao = new  loginDaoImpl();
    
    	public controllerLogin() {
            
	}
        
        // gestiona el inicio de sesion del empleado
        // hacemos devolver los parametros
        // id_empleado, nombre, apellido y su rol
        //para validar a que opciones del menu tiene acceso.
        
        public List<User> userLogin(User usuario){
            List<User> lista = new ArrayList<>();
            dao.login(usuario);
            System.out.println("mira login "+lista.toString());
            return lista;
        }
    
}
