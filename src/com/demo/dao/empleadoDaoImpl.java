/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.Empleado;
import com.demo.dominio.User;
import com.demo.interfaces.empleadoInterface;
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
public class empleadoDaoImpl implements empleadoInterface{

    @Override
    public boolean save(Empleado empleado) {
        boolean registrar = false;
        Connection con = null;
        PreparedStatement pst = null;

        String sql = "INSERT INTO empleado (nombre, apellido, correo, cedulaIdentidad, direccion, telefono)"
                + "values (?, ?, ?, ?, ?, ?)";

        try {
            con = conexion_mysql.conectar();
            pst=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, empleado.getNombre());
			pst.setString(2, empleado.getApellido());
                        pst.setString(3,empleado.getCorreo());
			pst.setString(4,empleado.getCedulaIdentidad());
			pst.setString(5, empleado.getDireccion());
                        pst.setString(6, empleado.getTelefono());
                        pst.execute();
             ResultSet rs = pst.getGeneratedKeys();	
                        //envio los demas datos
            sql = "";
            if (rs.next())
		    empleado.setId_empleado(rs.getInt(1));
            pst=con.prepareStatement(sql);
			pst.setInt(1, empleado.getId_empleado());
			pst.setString(2, empleado.getUsuraio().getNick());
                        pst.setString(3, empleado.getUsuraio().getPassword());
                        pst.setString(4, empleado.getUsuraio().getRol());
                        pst.setBoolean(5, empleado.getUsuraio().isActivo());//enviar true o 1
			pst.execute();	
                        
            registrar = true;
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método save");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Empleado> getEmpleadoAll() {
         Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM empleado";

        List<Empleado> listaCliente = new ArrayList<Empleado>();
        try {
            con = conexion_mysql.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setId_empleado(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApellido(rs.getString(3));
                e.setCedulaIdentidad(rs.getString(4));
                e.setCorreo(rs.getString(5));
                e.setDireccion(rs.getString(6));
                e.setTelefono(rs.getString(7));
                e.setUsuraio(new User(rs.getString(8),rs.getString(9),rs.getString(10),rs.getBoolean(11)));
                listaCliente.add(e);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método getEmpleadoAll");
            e.printStackTrace();
        }

        return listaCliente;
        
    }

    @Override
    public boolean updateEmpleado(Empleado empleado) {
         Connection con = null;
        PreparedStatement pst= null;

        boolean actualizar = false;

        String sql = "UPDATE empleado SET cedula='";
        try {
           con = conexion_mysql.conectar();
            pst=con.prepareStatement(sql);
			pst.setString(1, empleado.getNombre());
			pst.setString(2, empleado.getApellido());
                        pst.setString(3,empleado.getCorreo());
			pst.setString(4,empleado.getCedulaIdentidad());
			pst.setString(5, empleado.getDireccion());
                        pst.setString(6, empleado.getTelefono());
                        pst.setInt(7, empleado.getId_empleado());
                        pst.execute();
                        
                        //actualizo rol, nick o password
            sql = "";
            pst=con.prepareStatement(sql);
			pst.setString(1, empleado.getUsuraio().getNick());
                        pst.setString(2, empleado.getUsuraio().getPassword());
                        pst.setString(3, empleado.getUsuraio().getRol());
                        pst.setBoolean(4, empleado.getUsuraio().isActivo());//enviar true o 1
                        pst.setInt(5, empleado.getId_empleado());
			pst.execute();	
                        
            pst.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
        
    }

    @Override
    public boolean deleteEmpleado(Empleado empleado) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM empleado WHERE ID=" + empleado.getId_empleado();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
    
    
}
