package ProyectoGasolinera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente {

    private Gasolinera.Conexion conexion;

    public Cliente() {
        conexion = new Gasolinera.Conexion();
        conexion.conectar();
    }

    public ResultSet ejecutarSP(int operacion, String cedula, String nombre, String apellido, String telefono, String direccion) throws SQLException {
        String sql = "{CALL GestionClientes(?, ?, ?, ?, ?, ?)}";
        PreparedStatement ps = conexion.conn.prepareStatement(sql);
        ps.setInt(1, operacion);
        ps.setString(2, cedula);
        ps.setString(3, nombre);
        ps.setString(4, apellido);
        ps.setString(5, telefono);
        ps.setString(6, direccion);

        if (operacion == 1) { // Si es una consulta
            return ps.executeQuery();
        } else { // Si es una inserción, actualización o eliminación
            ps.executeUpdate();
            return null; // No hay resultado para devolver en estas operaciones
        }
    }

public ResultSet buscarClientePorCedula(String cedula) throws SQLException {
    String sql = "SELECT c.Nombre, c.Apellido, c.Cedula, c.Telefono, c.Direccion, "
            + "v.Marca, v.Placa, v.AnioFabricacion, v.Color "
            + "FROM Clientes c "
            + "JOIN Vehiculos v ON c.Cedula = v.Cedula "
            + "WHERE c.Cedula = ?";
    PreparedStatement ps = conexion.conn.prepareStatement(sql);
    ps.setString(1, cedula);
    return ps.executeQuery();
}

public ResultSet buscarClientePorPlaca(String placa) throws SQLException {
    String sql = "SELECT c.Nombre, c.Apellido, c.Cedula, c.Telefono, c.Direccion, "
            + "v.Marca, v.Placa, v.AnioFabricacion, v.Color "
            + "FROM Clientes c "
            + "JOIN Vehiculos v ON c.Cedula = v.Cedula "
            + "WHERE v.Placa = ?";
    PreparedStatement ps = conexion.conn.prepareStatement(sql);
    ps.setString(1, placa);
    return ps.executeQuery();
}


public ResultSet obtenerTodosClientes() throws SQLException {
    String sql = "SELECT c.Nombre, c.Apellido, c.Cedula, c.Telefono, c.Direccion, "
            + "v.Marca, v.Placa, v.AnioFabricacion, v.Color "
            + "FROM Clientes c "
            + "JOIN Vehiculos v ON c.Cedula = v.Cedula";

    PreparedStatement ps = conexion.conn.prepareStatement(sql);
    return ps.executeQuery();
}



    
}
