/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gasolinera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/Gasolinera?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root";
    private static final String CLAVE = "0980790317";
    public Connection conn = null;

    public void conectar() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("Conexión Exitosa");
            }
        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }

    public void desconectar() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión Cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al cerrar Conexión", ex);
            }
        }
    }

    public ResultSet ejecutaSQL(String SQL) throws SQLException {
        conectar();
        Statement st = null;
        ResultSet r = null;
        try {
            st = conn.createStatement();
            r = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar SQL: " + ex.getMessage());
        } finally {
            if (st != null) {
                st.close();
            }
        }
        return r;
    }

}
