/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.User;
import com.demo.interfaces.loginInterface;
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
public class loginDaoImpl implements loginInterface {

    // hacer metodo de tipo User
    // solo verifico con el query y si vota diferente hace el logeo
    @Override
    public List<User> login(User usuario) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String sql = "select u.nick, u.password, u.empleado_id_empleado "
                + "from user u inner join empleado e on u.empleado_id_empleado = e.id_empleado "
                + "where u.nick=? and u.password=? and u.activo=true";
        List<User> listaUsuario = new ArrayList<>();
        try {
            con = conexion_mysql.conectar();
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNick());
            pst.setString(2, usuario.getPassword());
            rs = pst.executeQuery();

            while (rs.next()) {
                //Encuesta temp = new Encuesta(rs.getInt(1), rs.getString(2));
                //opcionese.add(temp);
            }
            pst.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase LoginDaoImple, método getlogin");
            e.printStackTrace();
        }
        return listaUsuario;
    }

}
