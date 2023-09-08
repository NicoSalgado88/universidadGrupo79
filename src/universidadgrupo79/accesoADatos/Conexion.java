/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadgrupo79.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicol
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="universidadgrupo79";
    private static final String USUARIO="root";
    private static String PASSWORD="";
    private static Connection conec;

    public Conexion() {
    }
    
    public static Connection getConexion(){
        if(conec==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conec=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            } catch (ClassNotFoundException | SQLException x) {
                JOptionPane.showMessageDialog(null, "error al conectar");
            }
        }
        return conec;
    }
    
}
