/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.Articulo;
import com.demo.interfaces.articuloInterface;
import com.demo.utileria.conexion_mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class articuloDaoImpl implements articuloInterface{

    @Override
    public boolean save(Articulo articulo) {
         boolean registrar = false;
        Connection con = null;
        PreparedStatement pst = null;
        
        String sql= "INSERT INTO articulo (nombre, codigo_fisico, descripcion, stock, precio_venta, precio_compra, estado)"
                + " values (?,?,?,?,?,?,?)";
       
        try {
             con = conexion_mysql.conectar();
            pst=con.prepareStatement(sql);
			pst.setString(1, articulo.getNombre());
                        pst.setString(2,articulo.getCodigo_fisico());
                        pst.setString(3, articulo.getDescripcion());
                        pst.setInt(4, articulo.getStock());
                        pst.setDouble(5, articulo.getPrecio_venta());
                        pst.setDouble(6, articulo.getPrecio_compra());
                        pst.setBoolean(7, articulo.isEstado());
			         
            pst.execute();
            registrar = true;
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ArticuloDaoImpl, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Articulo> getArticuloAll() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Articulo";
        List<Articulo> listaArticulo = new ArrayList<Articulo>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Articulo a = new Articulo();
                a.setId_articulo(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setCodigo_fisico(rs.getString(3));
                a.setDescripcion(rs.getString(4));
                a.setStock(rs.getInt(5));
                a.setPrecio_venta(rs.getDouble(6));
                a.setPrecio_compra(rs.getDouble(7));
                
                listaArticulo.add(a);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ArticuloDaoImple, método getArticuloAll");
            e.printStackTrace();
        }
        return listaArticulo;
            
    }

    @Override
    public boolean updateArticulo(Articulo articulo) {
        Connection con = null;
        PreparedStatement pst= null;

        boolean actualizar = false;

        String sql = "UPDATE Articulo SET nombre='";
        try {
           con = conexion_mysql.conectar();
            pst=con.prepareStatement(sql);
			pst.setString(1, articulo.getNombre());
                        pst.setString(2,articulo.getCodigo_fisico());
                        pst.setString(3, articulo.getDescripcion());
                        pst.setInt(4, articulo.getStock());
                        pst.setDouble(5, articulo.getPrecio_venta());
                        pst.setDouble(6, articulo.getPrecio_compra());
                        pst.setBoolean(7, articulo.isEstado());
                        pst.execute();
                                           
            pst.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ArticuloDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;

    }

    @Override
    public boolean deleteArticulo(Articulo articulo) {
        Connection con = null;

        boolean eliminar = false;

            String sql = "DELETE FROM ARTICULO WHERE ID=";
        try {
            con = conexion_mysql.conectar();
            PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, articulo.getId_articulo());
                        pst.execute();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ArticuloDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
    
 
    
}
