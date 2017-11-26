/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.Proveedor;
import com.demo.interfaces.proveedorInterface;
import com.demo.utileria.conexion_mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jona
 */
public class proveedorDaoImpl implements proveedorInterface {

    @Override
    public boolean save(Proveedor proveedor) {
        boolean registrar = false;
        Connection con = null;
        PreparedStatement pst = null;

        String sql = "INSERT INTO proveedor (nombre,apellido,empresa,ruc,telefono,celular,direccion)"
                + " values (?,?,?,?,?,?,?)";

        try {
            con = conexion_mysql.conectar();
            pst = con.prepareStatement(sql);
            pst.setString(1, proveedor.getNombre());
            pst.setString(2, proveedor.getApellido());
            pst.setString(3, proveedor.getEmpresa());
            pst.setString(4, proveedor.getRuc());
            pst.setString(5, proveedor.getTelefono());
            pst.setString(6, proveedor.getCelular());
            pst.setString(7, proveedor.getDireccion());
            pst.setString(8, proveedor.getCorreo());
            pst.execute();
            registrar = true;
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedorDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Proveedor> getProveedorAll() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM proveedor";
        List<Proveedor> listaProveedor = new ArrayList<Proveedor>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedor p = new Proveedor();
                p.setId_proveedor(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                p.setEmpresa(rs.getString(4));
                p.setRuc(rs.getString(5));
                p.setTelefono(rs.getString(6));
                p.setCelular(rs.getString(7));
                p.setDireccion(rs.getString(8));
                p.setCorreo(rs.getString(9));
                listaProveedor.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedorDaoImple, método getProveedorAll");
            e.printStackTrace();
        }
        return listaProveedor;
    }

    @Override
    public boolean updateProveedor(Proveedor proveedor) {
        Connection con = null;
        PreparedStatement pst = null;

        boolean actualizar = false;

        String sql = "UPDATE proveedor SET nombre=?, apellido=?, empresa=?, ruc=?, telefono=?, "
                + "celular=?, direccion=?, correo=? where id_proveedor=?" ;
        try {
           con = conexion_mysql.conectar();
            pst = con.prepareStatement(sql);
            pst.setString(1, proveedor.getNombre());
            pst.setString(2, proveedor.getApellido());
            pst.setString(3, proveedor.getEmpresa());
            pst.setString(4, proveedor.getRuc());
            pst.setString(5, proveedor.getTelefono());
            pst.setString(6, proveedor.getCelular());
            pst.setString(7, proveedor.getDireccion());
            pst.setString(8, proveedor.getCorreo());
            pst.setInt(9, proveedor.getId_proveedor());
            pst.execute();
            
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedorDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean deleteProveedor(Proveedor proveedor) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM proveedor WHERE ID=" + proveedor.getId_proveedor();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedoroDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

}
