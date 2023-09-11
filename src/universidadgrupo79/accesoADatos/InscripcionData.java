/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universidadgrupo79.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;
import universidadgrupo79.entidades.Inscripcion;


public class InscripcionData {
    private Connection con=null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con=Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nombre, anio, estado) VALUES (? ,? ,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Materia guardado");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Materia");
        } 
    }
}
