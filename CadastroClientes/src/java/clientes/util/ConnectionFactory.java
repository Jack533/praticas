/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientes.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Onismar
 */
public class ConnectionFactory {
    
    
      // private static final String URL = "jdbc:mysql://localhost:3306/contatos";
    //private static final String USER = "root";
    //private static final String PASSWORD = "4312";

    public static Connection getConnection() {

      try {
            //return DriverManager.getConnection(URL, USER, PASSWORD);
          
         // Class.forName("com.mysql.jdbc.Driver");
          System.out.println("conectando");
          String url = "jdbc:mysql://localhost:3306/clientesweb";
          Connection con =  DriverManager.getConnection(url,"root","4312");
          System.out.println("Conectado");
          return con;
          
          
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
              

      
    }
}
    
