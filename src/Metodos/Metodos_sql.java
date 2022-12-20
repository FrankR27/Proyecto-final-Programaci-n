package Metodos;

import Conexion.ConexionBD;
import java.sql.*;


public class Metodos_sql {

    public static ConexionBD conexion = new ConexionBD();

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    public int guardar(String nombres, String apellidos, String sexo, String cedula, String email, String telefono, double sueldo, String nusuario, String clave) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO empleado (Nombres, Apellidos, sexo, Cedula, Email, Telefono, sueldo, Usuario, clave) VALUES (?,?,?,?,?,?,?,?,?,)");

        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombres);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, sexo);
            sentencia_preparada.setString(4, cedula);
            sentencia_preparada.setString(5, email);
            sentencia_preparada.setString(6, telefono);
            sentencia_preparada.setDouble(7, sueldo);
            sentencia_preparada.setString(8, nusuario);
            sentencia_preparada.setString(9, clave);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String buscarNombre(String nusuario) {

        String busqueda_nombre = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT Nombres, Apellidos FROM empleado WHERE Usuario = '" + nusuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String nombres = resultado.getString("nombres");
                String apellidos = resultado.getString("apellidos");
                busqueda_nombre = (nombres + " " + apellidos);
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }
    
    public static String buscarEmpleado(String nusuario) {

        String busquedaUsuario = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT Nombres, Apellidos, Usuario FROM empleado WHERE Usuario = '" + nusuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String Usuario = resultado.getString("Usuario");
                busquedaUsuario = (Usuario);
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return busquedaUsuario;
    }
       
    public static String buscarId(String nusuario) {

        String busqueda_Id = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT Nombres, Apellidos, TipoEmpleado, idEmpleado FROM empleado WHERE Usuario = '" + nusuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String Id = resultado.getString("idEmpleado");
                busqueda_Id = (Id);
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_Id;
    }
    public static String buscarEmpleadoRegistrado(String nusuario, String clave) {
        String busqueda_empleado = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar_empleado = ("SELECT Nombres, Usuario, clave FROM empleado WHERE Usuario = '" + nusuario + "' AND clave = '" + clave + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_empleado);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_empleado = "USUARIO ENCONTRADO";
            } else {
                busqueda_empleado = "USUARIO NO ENCONTRADO";

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_empleado;
    }
}

