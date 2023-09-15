/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universidadgrupo79.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo79.entidades.Materia;


public class MateriaData {
    private Connection con=null;

    public MateriaData() {
        con=Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
       String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (? ,? ,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Materia guardada");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Materia");
        } 
    }
    
    public Materia buscarMateria(int id){
        String sql="SELECT  nombre, anio, estado FROM materia WHERE idMateria=? AND estado=1";
        Materia materia=null;
        PreparedStatement ps=null;
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                materia=new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("anio"));
                materia.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Materia");
        }
        return materia;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre=?, anio=? WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Materia");
        }
    }
    
    public void eliminarMateria(int id){
        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Materia");
        }
    }
    
    public List<Materia> listarMaterias(){
        String sql="SELECT  idMateria, nombre, anio, estado FROM materia WHERE estado=1";
        ArrayList <Materia> materias=new ArrayList<>();
        PreparedStatement ps=null;
        try {
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("anio"));
                materia.setActivo(true);
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Materia");
        }
        return materias;
    }
}
