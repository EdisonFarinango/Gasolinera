/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGasolinera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Combustible {

    private Conexion conexion;

    public Combustible() {
        conexion = new Conexion();
        conexion.conectar();
    }

    public ResultSet ejecutarSP(int CombustibleID, String Tipo, int PrecioPorLitro, int opcion) throws SQLException {
        String sql = "{CALL Combustible(?, ?, ?, ?)}";
        PreparedStatement ps = conexion.conn.prepareStatement(sql);
        ps.setInt(1, CombustibleID);
        ps.setString(2, Tipo);
        ps.setInt(3, PrecioPorLitro);
        ps.setInt(4, opcion);

        if (opcion == 1) { // Si es una consulta
            return ps.executeQuery();
        } else { // Si es una inserción, actualización o eliminación
            ps.executeUpdate();
            return null; // No hay resultado para devolver en estas operaciones
        }
    }

    public ResultSet obtenerTodosCombustibles() throws SQLException {
        String sql = "SELECT * FROM Combustible";
        PreparedStatement ps = conexion.conn.prepareStatement(sql);
        return ps.executeQuery();
    }


}
