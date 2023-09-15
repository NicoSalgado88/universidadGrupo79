/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadgrupo79.entidades;

/**
 *
 * @author Nicol
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int año;
    private boolean activo;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int año, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.activo = activo;
    }

    public Materia(String nombre, int año, boolean activo) {
        this.nombre = nombre;
        this.año = año;
        this.activo = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idMateria+"-"+nombre+", "+año+"°";
    }
    
    
    
}
