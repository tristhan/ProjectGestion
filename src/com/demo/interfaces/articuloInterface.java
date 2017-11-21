/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.interfaces;

import com.demo.dominio.Articulo;
import java.util.List;

/**
 *
 * @author Jona
 */
public interface articuloInterface {
    
    
    public boolean save(Articulo articulo);
    public List<Articulo> getArticuloAll();
    public boolean updateArticulo(Articulo articulo);
    public boolean deleteArticulo(Articulo articulo);
    
}
