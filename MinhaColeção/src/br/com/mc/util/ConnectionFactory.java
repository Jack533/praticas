package br.com.mc.util;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {

            return DriverManager.getConnection(
                    ConfiguracoesUtil.getValor(ConfiguracoesUtil.URL),
                    ConfiguracoesUtil.getValor(ConfiguracoesUtil.LOGIN),
                    ConfiguracoesUtil.getValor(ConfiguracoesUtil.SENHA));

        } catch (SQLException excecao) {

            throw new RuntimeException(excecao);

        }
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
