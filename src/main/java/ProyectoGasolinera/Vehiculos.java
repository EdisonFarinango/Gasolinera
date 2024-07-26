/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGasolinera;

/**
 *
 * @author USER
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Vehiculos {

    private Gasolinera.Conexion conexion;

    public Vehiculos() {
        conexion = new Gasolinera.Conexion();
        conexion.conectar();
    }

    public ResultSet ejecutarSPVehiculo(int operacion, String placa, String cedula, String marca, String anio_fabricacion, String color) throws SQLException {
        String sql = "{CALL GestionarVehiculos(?, ?, ?, ?, ?, ?)}";
        PreparedStatement ps = conexion.conn.prepareStatement(sql);
        ps.setInt(1, operacion);
        ps.setString(2, placa);
        ps.setString(3, cedula);
        ps.setString(4, marca);
        ps.setString(5, anio_fabricacion);
        ps.setString(6, color);

        if (operacion == 1) { // Si es una consulta
            return ps.executeQuery();
        } else { // Si es una inserción, actualización o eliminación
            ps.executeUpdate();
            return null; // No hay resultado para devolver en estas operaciones
        }
    }




    
}

