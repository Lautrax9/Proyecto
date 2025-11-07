package CapaPersistencia;

import CapaException.PersonaException;
import CapaException.BDException;
import CapaLogica.BitacoraCero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Persistencia {
    private static final String SQL_GUARDAR_PERSONA = 
        "INSERT INTO faltas.licencia(cedula, nombre, licencia, fecha, materia, grupos, turno) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    private static final String SQL_CONSULTA_PERSONA = 
        "SELECT * FROM faltas.licencia WHERE cedula = ?";
    
    private static final String SQL_ELIMINAR_PERSONA = 
        "DELETE FROM faltas.licencia WHERE cedula = ?";

    private final Conexion cone = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;

    // Guardar registro desde BitacoraCero
    public void guardarRegistro(BitacoraCero bitacora) throws BDException {
        try (Connection con = Conexion.getConnection()) {
            ps = con.prepareStatement(SQL_GUARDAR_PERSONA);
            ps.setString(1, bitacora.getNombre());
            ps.setString(2, bitacora.getMateria());
            ps.setString(3, bitacora.getFecha());
            ps.setString(4, bitacora.getLicencia());
            ps.setString(5, bitacora.getGrupo());
            ps.setString(6, bitacora.getCedula());
            ps.setString(7, bitacora.getTurno());
            
            int resultado = ps.executeUpdate();
            if (resultado <= 0) {
                throw new BDException("No se pudo guardar el registro.");
            }
        } catch (SQLException e) {
            throw new BDException("Error al guardar en la base de datos: " + e.getMessage());
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    // Buscar persona por cédula
    public BitacoraCero buscarPorCedula(String cedula) throws PersonaException, BDException {
        BitacoraCero persona = new BitacoraCero();
        try (Connection con = cone.getConnection()) {
            ps = con.prepareStatement(SQL_CONSULTA_PERSONA);
            ps.setString(1, cedula);
            rs = ps.executeQuery();

            if (rs.next()) {
                persona.setNombre(rs.getString("nombre"));
                persona.setMateria(rs.getString("materia"));
                persona.setFecha(rs.getString("fecha"));
                persona.setLicencia(rs.getString("licencia"));
                persona.setGrupo(rs.getString("grupos"));
                persona.setCedula(rs.getString("cedula"));
                 persona.setCedula(rs.getString("turno"));
            } else {
                throw new PersonaException("La persona no está ingresada.");
            }
        } catch (SQLException e) {
            throw new BDException("Error al buscar en la base de datos.");
        }
        return persona;
    }

    // Eliminar persona por cédula
    public void eliminarPorCedula(String cedula) throws PersonaException, BDException {
        try (Connection con = Conexion.getConnection()) {
            ps = con.prepareStatement(SQL_ELIMINAR_PERSONA);
            ps.setString(1, cedula);
            int resultado = ps.executeUpdate();

            if (resultado <= 0) {
                throw new PersonaException("La persona que desea eliminar no se encuentra.");
            }
        } catch (SQLException e) {
            throw new BDException("Error al eliminar en la base de datos.");
        }
    }
}
