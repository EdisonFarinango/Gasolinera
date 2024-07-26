package ProyectoGasolinera;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasSQL {

    public static int obtenerUltimoEstacionID(Conexion conexion) throws SQLException {
        int ultimoEstacionID = -1;
        String sql = "SELECT MAX(EstacionID) AS UltimoEstacionID FROM gasolinera.estaciones";

        try (ResultSet rs = conexion.ejecutaSQL(sql)) {
            if (rs.next()) {
                ultimoEstacionID = rs.getInt("UltimoEstacionID");
            }
        }

        return ultimoEstacionID;
    }

    public static int obtenerIDCombustible(Conexion conexion, String tipoCombustible) throws SQLException {
        int combustibleID = -1;
        String sql = "SELECT CombustibleID FROM gasolinera.combustible WHERE Tipo = '" + tipoCombustible + "'";

        try (ResultSet rs = conexion.ejecutaSQL(sql)) {
            if (rs.next()) {
                combustibleID = rs.getInt("CombustibleID");
            }
        }

        return combustibleID;
    }

    // Puedes agregar más métodos para consultas adicionales según sea necesario
}
