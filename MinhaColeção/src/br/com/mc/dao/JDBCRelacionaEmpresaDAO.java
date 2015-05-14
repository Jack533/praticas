/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Empresa;
import br.com.mc.util.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Onismar
 */
public class JDBCRelacionaEmpresaDAO implements RelacionaEmpresaDAO {

    private java.sql.Connection con;

    @Override
    public void relacionaEmpresa(int midia, int empresa) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "INSERT INTO relacaoempresa (midia_idmidia, empresa_idempresa) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, midia);
            st.setInt(2, empresa);

            st.executeUpdate();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Empresa listaEmpRelacionada(int idmidia, String tipo) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT e.idempresa, e.nome, e.tipo, e.paisDeOrigem FROM empresa e, midia m, relacaoempresa re WHERE e.idempresa = re.empresa_idempresa AND re.midia_idmidia = m.idmidia AND e.tipo =? AND m.idmidia=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, tipo);
            st.setInt(2, idmidia);
            ResultSet rs = st.executeQuery();

            if (rs != null) {
                Empresa e = new Empresa();
                while (rs.next()) {

                    e.setId(rs.getInt(1));
                    e.setNome(rs.getString(2));
                    e.setTipo(rs.getString(3));
                    e.setPais(rs.getString(4));

                }

                rs.close();
                st.close();
                con.close();
                return e;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public void editaRelacao(int idmidia, int empAnt, int novaEmp) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = " UPDATE bd_colecao.relacaoempresa SET empresa_idempresa =? WHERE midia_idmidia=? AND empresa_idempresa =? ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, novaEmp);
            st.setInt(2, idmidia);
            st.setInt(3, empAnt);

            st.executeUpdate();
            st.close();

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

    @Override
    public void removeRelacionamento(int idmidia, int idempresa) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE from relacaoempresa WHERE midia_idmidia = ? AND empresa_idempresa = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idmidia);
            st.setInt(2, idempresa);
            st.executeUpdate();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
