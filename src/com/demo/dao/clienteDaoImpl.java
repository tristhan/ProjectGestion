package com.demo.dao;

import com.demo.dominio.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.utileria.conexion_mysql;
import com.demo.interfaces.clienteInterface;
import java.sql.PreparedStatement;

/**
 * @author Jona
 */
public class clienteDaoImpl implements clienteInterface {

    @Override
    public boolean save(Cliente cliente) {
        boolean registrar = false;
        Connection con = null;
        PreparedStatement pst = null;

        String sql = "INSERT INTO cliente(nombre, apellido, correo, identificacion) values(?, ?, ?, ?) ";
        
        try {
            con = conexion_mysql.conectar();
            pst=con.prepareStatement(sql);
			pst.setString(1, cliente.getNombre());
			pst.setString(2, cliente.getApellido());
			pst.setString(3,cliente.getCorreo());
			pst.setString(4, cliente.getIdentificacion());
            
            pst.execute();
            registrar = true;
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Cliente> getClienteAll() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM cliente";

        List<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId_cliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setCorreo(rs.getString(4));
                c.setIdentificacion(rs.getString(5));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método getClienteAll");
            e.printStackTrace();
        }

        return listaCliente;
    }

    @Override
    public boolean updateCliente(Cliente cliente) {
        Connection con = null;

        boolean actualizar = false;

        String sql = "UPDATE CLIENTE SET cedula='" ;
        try {
            con = conexion_mysql.conectar();
            PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, cliente.getNombre());
			pst.setString(2, cliente.getApellido());
			pst.setString(3,cliente.getCorreo());
			pst.setString(4, cliente.getIdentificacion());
                        pst.setInt(5, cliente.getId_cliente());
            
            pst.execute();
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean deleteCliente(Cliente cliente) {
        Connection con = null;

        boolean eliminar = false;

        String sql = "DELETE FROM CLIENTE WHERE ID=";
        try {
            con = conexion_mysql.conectar();
            PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, cliente.getId_cliente());
                        pst.execute();
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
//
}
