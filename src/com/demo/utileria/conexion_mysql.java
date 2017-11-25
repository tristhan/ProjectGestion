package com.demo.utileria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jona
 */
public class conexion_mysql {

    private static String ACCESO_BASE = "jdbc:mysql://localhost:3306/center";
    private static String USERNAME = "root";
    private static String PASSWORD = "1234";

    public static Connection conectar() {
        Connection con = null;
        String url = "jdbc:mysql://localhost/center-techno?user=" + USERNAME
                + "&password=" + PASSWORD;
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
    //
}
