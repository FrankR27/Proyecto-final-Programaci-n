package Metodos;

import Conexion.ConexionBD;
import static Metodos.Metodos_Empleados.GP;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos_Empleados {

    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement GP;

    //MOSTRAR DATOS DE LA TABLA PRODUCTO DE LA BASE DE DATOS
    //--------------------------------------------------------------------------
    private DefaultTableModel DT;
    private ResultSet RS;
    private static PreparedStatement PS;
    Connection CN = null;

    private DefaultTableModel setTitulos() {
        DT = new DefaultTableModel();
        DT.addColumn("Id");
        DT.addColumn("Nombres");
        DT.addColumn("Apellidos");
        DT.addColumn("Sexo");
        DT.addColumn("Cedula");
        DT.addColumn("Email");
        DT.addColumn("Telefono");
        DT.addColumn("Sueldo");
        DT.addColumn("Usuario");
        DT.addColumn("Clave");
        return DT;
    }
    //----------------------------------------------------------------------------

    //ACTUALIZAR DATOS DE LAS TABLAS DE LA BASE DE DATOS
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public int ActualizarEmpleado(String Id, String Nombres, String Apellidos, String Sexo, String Cedula, String Email, String Telefono, float Sueldo, String Usuario, String Clave) {
        String SQL = "UPDATE empleado SET Nombres = '" + Nombres + "', Apellidos = '" + Apellidos + "', sexo = '" + Sexo + "', Cedula = '" + Cedula + "', Telefono = '" + Telefono + "',  sueldo = '" + Sueldo + "', Usuario = '" + Usuario + "',  clave = '" + Clave + "' WHERE idEmpleado = " + Id;
        int resultado = 0;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            GP = conexion.prepareStatement(SQL);
            resultado = GP.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado con éxito");
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Metodos_Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //ELIMINAR REGISTROS
    //????????????????????????????????????????????????????????????????????????????????
    public int EliminarEmpleado(String Bor) {
        String SQL = "DELETE FROM empleado WHERE idEmpleado =" + Bor;
        int res = 0;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            GP = conexion.prepareStatement(SQL);
            res = GP.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Metodos_Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }
    //????????????????????????????????????????????????????????????????????????????????

    //INSERTAR DATOS EN LA TABLA DE LA BASE DE DATOS
    //********************************************************************************************
    public int guardarEmpleado(String Nombres, String Apellidos, String Sexo, String Cedula, String Email, String Telefono, float Sueldo, String Usuario, String Clave) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = "INSERT INTO empleado (Nombres, Apellidos, sexo, Cedula, Email, Telefono, sueldo, Usuario, clave) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            conexion = ConexionBD.conectar();
            GP = conexion.prepareStatement(sentencia_guardar);

            GP.setString(1, Nombres);
            GP.setString(2, Apellidos);
            GP.setString(3, Sexo);
            GP.setString(4, Cedula);
            GP.setString(5, Email);
            GP.setString(6, Telefono);
            GP.setFloat(7, Sueldo);
            GP.setString(8, Usuario);
            GP.setString(9, Clave);

            resultado = GP.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Metodos_Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return resultado;
    }
    //************************************************************************************

    //-------------------------------------------------------------------------------------
    public DefaultTableModel getDatos() {

        String sqliteQuery = "SELECT * FROM empleado";

        try {
            setTitulos();
            CN = ConexionBD.conectar();
            PS = CN.prepareStatement(sqliteQuery);
            RS = PS.executeQuery();
            Object[] fila = new Object[10];
            while (RS.next()) {
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getString(6);
                fila[6] = RS.getString(7);
                fila[7] = RS.getFloat(8);
                fila[8] = RS.getString(9);
                fila[9] = RS.getString(10);
                DT.addRow(fila);

            }
        } catch (SQLException e) {
            System.out.println(e);

        } finally {
            PS = null;
            RS = null;

        }
        return DT;
    }

//--------------------------------------------------------------------------------
    public int EmpleadoExistente(String Cedula) {
        Connection conexion = null;
        ResultSet rs = null;
        String sql = "SELECT COUNT(idEmpleado) FROM empleado WHERE Cedula = ?";

        try {
            conexion = ConexionBD.conectar();
            GP = conexion.prepareStatement(sql);

            GP.setString(1, Cedula);
            rs = GP.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Metodos_Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 1;
    }

    public boolean Email(String correo) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }
}
