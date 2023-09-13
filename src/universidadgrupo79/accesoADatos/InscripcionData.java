/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo79.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo79.entidades.Alumnos;
import universidadgrupo79.entidades.Inscripcion;
import universidadgrupo79.entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (? ,? ,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Inscripcion guardada");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripcion");
        }
    }

    public void borrarInscripcion(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripcion");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota=? WHERE idMateria=? AND idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idMateria);
            ps.setInt(3, idAlumno);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nota modificada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripcion");
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT idInscripto, idMateria, idAlumno, nota FROM inscripcion ";
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                Materia m = new Materia();
                Alumnos a = new Alumnos();
                m.setIdMateria(rs.getInt("idMateria"));
                a.setIdAlumno(rs.getInt("idAlumno"));
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setMateria(m);
                inscripcion.setAlumno(a);
                //PARA QUE ALUDATA Y MATDATA.
//                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
//                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripciones");
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT idInscripto, idMateria, nota FROM inscripcion WHERE inscripcion.idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            Alumnos alumno=new Alumnos();
            alumno.setIdAlumno(idAlumno);
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                insc.setAlumno(alumno);
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                insc.setMateria(materia);
                insc.setNota(rs.getDouble("nota"));
                inscripciones.add(insc);
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripciones");
        }
        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        ArrayList<Materia> materias=new ArrayList<>();
        try {
            String sql="SELECT inscripcion.idMateria, nombre, anio FROM inscripcion JOIN materia "
                    + "WHERE inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripciones");
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno){
        ArrayList<Materia> materias=new ArrayList<>();
        try {
            String sql="SELECT materia.idMateria FROM materia WHERE materia.idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno=?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripciones");
        }
        return materias;
    }
    
    public List<Alumnos> obtenerAlumnosPorMateria(int idMateria){
        ArrayList<Alumnos> alumnos=new ArrayList<>();
        try {
            String sql="SELECT inscripcion.idAlumno, apellido, nombre FROM inscripcion JOIN alumno "
                    + "WHERE inscripcion.idAlumno=alumno.idAlumno AND inscripcion.idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            Alumnos alumno;
            while(rs.next()){
                alumno=new Alumnos();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Inscripciones");
        }
        return alumnos;
    }
}
