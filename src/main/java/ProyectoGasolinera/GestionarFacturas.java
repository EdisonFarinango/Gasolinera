package ProyectoGasolinera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarFacturas {

    private Conexion conexion;

    public GestionarFacturas() {
        conexion = new Conexion();
    }

    public boolean guardarFactura(String fecha, int estacionID, double total, String cedula, int combustibleID, double cantidadLitros) {
        boolean guardado = false;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = conexion.conn;
            if (con != null) {
                String query = "INSERT INTO facturas (Fecha, EstacionID, Total, Cedula, CombustibleID, CantidadLitros) VALUES (?, ?, ?, ?, ?, ?)";
                ps = con.prepareStatement(query);
                ps.setString(1, fecha);
                ps.setInt(2, estacionID);
                ps.setDouble(3, total);
                ps.setString(4, cedula);
                ps.setInt(5, combustibleID);
                ps.setDouble(6, cantidadLitros);

                int filasAfectadas = ps.executeUpdate();
                if (filasAfectadas > 0) {
                    guardado = true;
                }
            } else {
                System.out.println("Error: La conexión es nula.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                // No cerramos la conexión aquí para reutilizarla si es necesario
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return guardado;
    }

    public int obtenerUltimoEstacionID() {
        int ultimoEstacionID = -1;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = conexion.conn;
            if (con != null) {
                String query = "SELECT EstacionID FROM estaciones ORDER BY EstacionID DESC LIMIT 1";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();

                if (rs.next()) {
                    ultimoEstacionID = rs.getInt("EstacionID");
                }
            } else {
                System.out.println("Error: La conexión es nula.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                // No cerramos la conexión aquí para reutilizarla si es necesario
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return ultimoEstacionID;
    }
}
