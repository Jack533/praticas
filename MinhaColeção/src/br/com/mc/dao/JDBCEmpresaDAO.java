/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Artista;
import br.com.mc.model.Empresa;
import br.com.mc.util.ConnectionFactory;
import java.sql.Connection;
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
public class JDBCEmpresaDAO implements EmpresaDAO {

    private Connection con;

    @Override
    public void inserir(Empresa e) throws Exception {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "INSERT INTO empresa (nome,tipo,paisDeOrigem) VALUES (?,?,?)";

            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, e.getNome());
            st.setString(2, e.getTipo());
            st.setString(3, e.getPais());

            st.executeUpdate();

            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Erro ao inserir registro");
        }

    }

    @Override
    public void editar(Empresa e, int id) throws Exception {

        con = ConnectionFactory.getConnection();
        String sql = " UPDATE bd_colecao.empresa  SET nome=?,tipo=?,paisDeOrigem=? WHERE idempresa=? ";
        PreparedStatement st = con.prepareStatement(sql);

        st.setString(1, e.getNome());
        st.setString(2, e.getTipo());
        st.setString(3, e.getPais());
        st.setInt(4, id);

        st.executeUpdate();

        st.close();
        con.close();
    }

    @Override
    public void remover(int idempresa) throws Exception {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE from empresa WHERE idempresa = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idempresa);

            st.executeUpdate();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Empresa> listar() throws Exception {

        List<Empresa> listaEmpresa = new ArrayList<Empresa>();

        String sql = "SELECT * FROM empresa ORDER BY nome";

        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Empresa e = new Empresa();

                    e.setId(rs.getInt(1));
                    e.setNome(rs.getString(2));
                    e.setTipo(rs.getString(3));
                    e.setPais(rs.getString(4));

                    listaEmpresa.add(e);

                }

                rs.close();
                st.close();
                con.close();
                return listaEmpresa;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public int retornaIdEmpresa(String nome) {

        String sql = "SELECT idempresa FROM empresa WHERE nome = ?";

        int id;
        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nome);
            ResultSet rs = st.executeQuery();
            rs.next();
            id = rs.getInt("idempresa");
            rs.close();
            st.close();
            con.close();
            return id;

        } catch (SQLException e) {
            return 0;
        }

    }

    @Override
    public List<Empresa> listarPorTipo(String tipo) {

        List<Empresa> listaEmpresa = new ArrayList<Empresa>();

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM empresa e WHERE e.tipo = ? or e.tipo = 'Outra' ORDER BY e.nome";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, tipo);
            ResultSet rs = st.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Empresa e = new Empresa();

                    e.setId(rs.getInt(1));
                    e.setNome(rs.getString(2));
                    e.setTipo(rs.getString(3));
                    e.setPais(rs.getString(4));

                    listaEmpresa.add(e);

                }
                rs.close();
                st.close();
                con.close();
                return listaEmpresa;

            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;

    }

    @Override
    public Empresa retornaEmpresa(int id) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM empresa WHERE idempresa=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
           
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
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

}
