/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientes.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
 
    public static void main(String[] args) throws SQLException{
        
        String url = "jdbc:Mysql://localhost:3306/clientesweb";
        String usuario = "root";
        String senha = "4312";
        
        Connection con = DriverManager.getConnection(url, usuario, senha);
    
        System.out.println("Conectou! =)");
    }
}
