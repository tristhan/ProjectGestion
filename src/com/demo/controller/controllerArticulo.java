/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.articuloDaoImpl;
import com.demo.dominio.Articulo;
import com.demo.interfaces.articuloInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class controllerArticulo {
    
    private articuloInterface dao;
    
    	public controllerArticulo() {
            if(dao == null){
                dao= new  articuloDaoImpl();
            }
	}
	
	//llama al DAO para guardar un articulo
	public void registrar(Articulo articulo ) {
		dao.save(articulo);
	}
	
	//llama al DAO para actualizar un articulo
	public void actualizar(Articulo articulo ) {
		dao.updateArticulo(articulo);
	}
	
	//llama al DAO para eliminar un articulo
	public void eliminar(Articulo articulo ) {
		dao.deleteArticulo(articulo);
	}
	
	//llama al DAO para obtener todos los articulo y luego los muestra en la vista
        // convertir en metod list
	public void verArticulos(){
		List<Articulo> articulos = new ArrayList<Articulo>();
		articulos=dao.getArticuloAll();
		//vista.verClientes(clientes);
                for (Articulo articulo  : articulos) {
                    System.out.println("asas... "+articulo.getCodigo_fisico());
            }
	}
}
