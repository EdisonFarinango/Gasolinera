package Gasolinera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Empleado {

    private Conexion conexion;

    public Empleado() {
        conexion = new Conexion();
        conexion.conectar();
    }

    public ResultSet ejecutarSP(int operacion, String nombre, String apellido, String cedula, String telefono, String direccion, String usuario, String clave) throws SQLException {
        String sql = "{CALL Empleados(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        PreparedStatement ps = conexion.conn.prepareStatement(sql);
        ps.setInt(1, operacion);
        ps.setInt(2, obtenerEmpleadoID(cedula));
        ps.setString(3, nombre);
        ps.setString(4, apellido);
        ps.setString(5, cedula);
        ps.setString(6, telefono);
        ps.setString(7, direccion);
        ps.setString(8, usuario);
        ps.setString(9, clave);

        if (operacion == 1) { // Si es una consulta
            return ps.executeQuery();
        } else { // Si es una inserción, actualización o eliminación
            ps.executeUpdate();
            return null; // No hay resultado para devolver en estas operaciones
        }
    }

    private int obtenerEmpleadoID(String cedula) throws SQLException {
        String sql = "SELECT EmpleadoID FROM Empleados WHERE Cedula = ?";
        PreparedStatement ps = conexion.conn.prepareStatement(sql);
        ps.setString(1, cedula);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("EmpleadoID");
        }
        return -1;
    }
}
