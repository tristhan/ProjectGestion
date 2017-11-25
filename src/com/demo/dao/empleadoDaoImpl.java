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
public class empleadoDaoImpl implements empleadoInterface {

    @Override
    public boolean save(Empleado empleado) {
        boolean registrar = false;
        Connection con = null;
        PreparedStatement pst = null;

        String sql = "INSERT INTO empleado (nombre, apellido, correo, cedulaIdentidad, direccion, telefono)"
                + "values (?, ?, ?, ?, ?, ?)";

        try {
            con = conexion_mysql.conectar();
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getApellido());
            pst.setString(3, empleado.getCorreo());
            pst.setString(4, empleado.getCedulaIdentidad());
            pst.setString(5, empleado.getDireccion());
            pst.setString(6, empleado.getTelefono());
            pst.execute();
            ResultSet rs = pst.getGeneratedKeys();
            //envio los demas datosde usuario
            sql = "INSERT INTO user (nick, password, rol, activo, empleado_id_empleado) "
                    + "values (?, ?, ?, ?, ?)";
            if (rs.next()) {
                empleado.setId_empleado(rs.getInt(1));
            }
            pst = con.prepareStatement(sql);
            pst.setString(1, empleado.getUsuraio().getNick());
            pst.setString(2, empleado.getUsuraio().getPassword());
            pst.setString(3, empleado.getUsuraio().getRol());
            pst.setBoolean(4, empleado.getUsuraio().isActivo());//enviar true o 1
            pst.setInt(5, empleado.getId_empleado());
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

    // devuelve todo los empleados y por cedulaIdentidad
    @Override
    public List<Empleado> getEmpleadoByCedula(String cedula) {
        List<Empleado> listaCliente = new ArrayList<>();
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql1="SELECT empleado.id_empleado, empleado.nombre, empleado.apellido, empleado.cedulaIdentidad, "
                + "empleado.correo, "+
                "empleado.direccion, empleado.telefono, "+
                "user.id_user, user.nick, user.password, user.rol, user.activo "+
                "from empleado empleado "+
                "INNER JOIN user user "+
                "on empleado.id_empleado = user.empleado_id_empleado "+
                "where empleado.cedulaIdentidad ="+ cedula +"";

        try {
            con = conexion_mysql.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql1);
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setId_empleado(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApellido(rs.getString(3));
                e.setCedulaIdentidad(rs.getString(4));
                e.setCorreo(rs.getString(5));
                e.setDireccion(rs.getString(6));
                e.setTelefono(rs.getString(7));
                e.setUsuraio(new User(rs.getInt(8),rs.getString(9), rs.getString(10), rs.getString(11), rs.getBoolean(12)));
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
        PreparedStatement pst = null;

        boolean actualizar = false;

        String sql = "UPDATE empleado SET nombre=?, apellido=?, cedulaIdentidad=?, correo=?, "
                + "direccion=?, telefono=? where id_empleado=?";
        try {
            con = conexion_mysql.conectar();
            pst = con.prepareStatement(sql);
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getApellido());
            pst.setString(3, empleado.getCedulaIdentidad());
            pst.setString(4, empleado.getCorreo());
            pst.setString(5, empleado.getDireccion());
            pst.setString(6, empleado.getTelefono());
            pst.setInt(7, empleado.getId_empleado());
            pst.execute();

            //actualizo rol, nick o password
            sql = "UPDATE user SET nick=?, password=?, rol=?, empleado_id_empleado=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, empleado.getUsuraio().getNick());
            pst.setString(2, empleado.getUsuraio().getPassword());
            pst.setString(3, empleado.getUsuraio().getRol());
            pst.setInt(4, empleado.getId_empleado());
            pst.execute();
            
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;

    }

    @Override
    public boolean deleteEmpleado(Empleado empleado) {
        Connection con = null;
        PreparedStatement pst = null;
        boolean eliminar = false;

        String sql = "UPDATE user SET activo=? where empleado_id_empleado=?";
        try {
            con = conexion_mysql.conectar();
            pst = con.prepareStatement(sql);
            pst.setBoolean(1, empleado.getUsuraio().isActivo());
            pst.setInt(2, empleado.getId_empleado());
            pst.execute();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

    @Override
    public List<Empleado> getEmpleadoAll() {
        List<Empleado> listaCliente = new ArrayList<>();
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql1="SELECT empleado.id_empleado, empleado.nombre, empleado.apellido, empleado.cedulaIdentidad, "
                + "empleado.correo, "+
                "empleado.direccion, empleado.telefono, "+
                "user.id_user, user.nick, user.password, user.rol, user.activo "+
                "from empleado empleado "+
                "INNER JOIN user user "+
                "on empleado.id_empleado = user.empleado_id_empleado ";

        try {
            con = conexion_mysql.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql1);
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setId_empleado(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApellido(rs.getString(3));
                e.setCedulaIdentidad(rs.getString(4));
                e.setCorreo(rs.getString(5));
                e.setDireccion(rs.getString(6));
                e.setTelefono(rs.getString(7));
                e.setUsuraio(new User(rs.getInt(8),rs.getString(9), rs.getString(10), rs.getString(11), rs.getBoolean(12)));
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
}
