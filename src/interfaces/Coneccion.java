/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author windows
 */
public class Coneccion {
    Connection connect;
    
    public Connection conectar (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost/fisei","root","");
            //JOptionPane.showMessageDialog(null, "conectado ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connect;
    }
}
