package Metodos;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos_Mascotas {

    private Connection connection = new ConexionBD().conectar();
    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement GP;

    //MOSTRAR DATOS DE LA TABLA PRODUCTO DE LA BASE DE DATOS
    //--------------------------------------------------------------------------
    private DefaultTableModel DT;
    private ResultSet RS;
    private static PreparedStatement PS;
    Connection CN = null;

    private DefaultTableModel ponerTitulos() {
        DT = new DefaultTableModel();
        DT.addColumn("ID");
        DT.addColumn("Tipo Animal");
        DT.addColumn("Raza Animal");
        DT.addColumn("Edad");
        DT.addColumn("Tipo Sangre");
        DT.addColumn("Alergias");
        DT.addColumn("Cantidad");
        DT.addColumn("Precio");
        return DT;
    }
    //----------------------------------------------------------------------------

    //ACTUALIZAR DATOS DE LAS TABLAS DE LA BASE DE DATOS
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public int actualizarMascotas(String ID, String tipoAnimal, String razaAnimal, int edad, String tipoSangre, String alergias, int cantidad, Double precio) {
        String SQL = "UPDATE mascota SET tipoAnimal = '" + tipoAnimal + "',razaAnimal = '" + razaAnimal + "', edad = '" + edad + "', tipoSangre = '" + tipoSangre + "', alergias = '" + alergias + "', cantidad = '" + cantidad + "', precio = '" + precio + "' WHERE idMascota = " + ID;
        int resultado = 0;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            GP = conexion.prepareStatement(SQL);
            resultado = GP.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO");
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);

        }
        return resultado;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //ELIMINAR REGISTROS
    //????????????????????????????????????????????????????????????????????????????????
    public int eliminarMascotas(String ID) {
        String SQL = "DELETE FROM mascota WHERE idMascota =" + ID;
        int res = 0;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            GP = conexion.prepareStatement(SQL);
            res = GP.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);

        }
        return res;
    }
    

    //INSERTAR DATOS EN LA TABLA DE LA BASE DE DATOS
    //********************************************************************************************
    public int guardarMascotas(String tipoAnimal, String razaAnimal, int edad, String tipoSangre, String alergias, int cantidad, Double precio) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = "INSERT INTO mascota (tipoAnimal, razaAnimal, edad, tipoSangre, alergias, cantidad, precio) VALUES (?,?,?,?,?,?,?)";

        try {
            conexion = ConexionBD.conectar();
            GP = conexion.prepareStatement(sentencia_guardar);
            GP.setString(1, tipoAnimal);
            GP.setString(2, razaAnimal);
            GP.setInt(3, edad);
            GP.setString(4, tipoSangre);
            GP.setString(5, alergias);
            GP.setInt(6, cantidad);
            GP.setDouble(7, precio);
            resultado = GP.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    //************************************************************************************

    //-------------------------------------------------------------------------------------
    public DefaultTableModel getDatos() {

        String sqliteQuery = "SELECT * FROM mascota";

        try {
            ponerTitulos();
            CN = ConexionBD.conectar();
            PS = CN.prepareStatement(sqliteQuery);
            RS = PS.executeQuery();
            Object[] mascotas = new Object[9];
            while (RS.next()) {
                mascotas[0] = RS.getInt(1);
                mascotas[1] = RS.getString(2);
                mascotas[2] = RS.getString(3);
                mascotas[3] = RS.getInt(4);
                mascotas[4] = RS.getString(5);
                mascotas[5] = RS.getString(6);
                mascotas[6] = RS.getInt(7);
                mascotas[7] = RS.getInt(8);
                DT.addRow(mascotas);

            }
        } catch (SQLException e) {
            System.out.println(e);

        } finally {
            PS = null;
            RS = null;
            //CN.close();

        }
        return DT;
    }

}
