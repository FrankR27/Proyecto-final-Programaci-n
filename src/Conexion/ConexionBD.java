package Conexion;

import java.sql.*;


public class ConexionBD {

    public static String url = "jdbc:sqlite:DB/tiendaMascota.db";
    public static String clase = "org.sqlite.JDBC";
    
    
    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url);
//            System.out.println("Conexion Establecida");
            //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } 
        return conexion;
    }
}
