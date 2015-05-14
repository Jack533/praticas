/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Midia;
import br.com.mc.model.Top10;
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
public class JDBCTop10DAO implements Top10DAO {

    private Connection con;

    @Override
    public void inserir(int idMidia, int posicao) throws Exception {
        try {
            con = ConnectionFactory.getConnection();
            String sql = "INSERT INTO top10 (midia_idmidia, posicao) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, idMidia);
            st.setInt(2, posicao);

            st.executeUpdate();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(int posicao, int idMidia) {
        try {
            con = ConnectionFactory.getConnection();

            String sql = " UPDATE top10  SET posicao=? WHERE midia_idmidia = ? ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, posicao);
            st.setInt(2, idMidia);
            
            st.executeUpdate();
            st.close();

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
    }

    @Override
    public void remover(int idMidia) throws Exception {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE from top10 WHERE midia_idmidia = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idMidia);
            st.executeUpdate();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Top10> listar(String tipoDeMidia) throws Exception {
        try {
            con = ConnectionFactory.getConnection();
            List<Top10> listaTop10 = new ArrayList<Top10>();
            String sql = "SELECT t.idtop10, t.midia_idmidia, t.posicao, m.tituloEmPortugues FROM midia m, top10 t WHERE t.midia_idmidia = m.idmidia AND m.tipoDeMidia = ? ORDER BY t.posicao";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, tipoDeMidia);

            ResultSet rs = st.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    
                    Top10 t10 = new Top10();
                   
                    t10.setIdTop10(rs.getInt(1));
                    t10.setIdMidia(rs.getInt(2));
                    t10.setPosicao(rs.getInt(3));
                    t10.setTitulo(rs.getString(4));

                    listaTop10.add(t10);

                }
                rs.close();
                st.close();
                con.close();
                return listaTop10;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public boolean estarRelacionado(int idMidia) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT m.idmidia FROM midia m, top10 t WHERE m.idmidia = t.midia_idmidia AND t.midia_idmidia =?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idMidia);
            ResultSet rs = st.executeQuery();

            if (rs != null) {
                Midia m = new Midia();
                while (rs.next()) {

                    m.setId(rs.getInt(1));

                }

                rs.close();
                st.close();
                con.close();
                if (m.getId() != 0) {
                    return true;
                }
                return false;

            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean totalDeMidias(String tipoDeMidia) {
        try {
            con = ConnectionFactory.getConnection();
            int total = 0;
            String sql = "SELECT COUNT(*) FROM top10 t, midia m WHERE m.idmidia = t.midia_idmidia AND m.tipoDeMidia = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, tipoDeMidia);
            
            
            ResultSet rs = st.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    total = rs.getInt("COUNT(*)");
                }

                rs.close();
                st.close();
                con.close();
                if (total < 10) {
                    return true;

                }
                return false;

            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
