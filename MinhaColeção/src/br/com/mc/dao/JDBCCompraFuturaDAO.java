/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Midia;
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
public class JDBCCompraFuturaDAO implements CompraFuturaDAO {

    private Connection con;

    @Override
    public void inserir(int idMidia) throws Exception {
        try {
            con = ConnectionFactory.getConnection();
            String sql = "INSERT INTO compraFutura (midia_idmidia) VALUES (?)";
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
    public void editar(int idMidia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(int idMidia) throws Exception {
        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE from compraFutura WHERE midia_idmidia = ?";
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
    public List<Midia> listar() throws Exception {
        try {
            con = ConnectionFactory.getConnection();
            List<Midia> listaMidia = new ArrayList<Midia>();
            String sql = "SELECT * FROM midia m, compraFutura c WHERE c.midia_idmidia = m.idmidia";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Midia m = new Midia();

                    m.setId(rs.getInt(1));
                    m.setTituloOriginal(rs.getString(2));
                    m.setTituloPortugues(rs.getString(3));
                    m.setAnoDeLancamento(rs.getString(4));
                    m.setDuracao(rs.getString(5));
                    m.setPaisDeOrigem(rs.getString(6));
                    m.setTipoDeEdicao(rs.getString(7));
                    m.setTipoDeEmbalagem(rs.getString(8));
                    m.setQtdeBD(rs.getInt(9));
                    m.setQtdeDvd(rs.getInt(10));
                    m.setQtdeBD3d(rs.getInt(11));
                    m.setGenero(rs.getString(12));
                    m.setDescricao(rs.getString(13));
                    m.setValorDeCompra(rs.getDouble(14));
                    m.setAnoDeCompra(rs.getString(15));
                    m.setTipoDeMidia(rs.getString(16));
                    m.setCodigoDeBarras(rs.getString(17));

                    listaMidia.add(m);

                }
                rs.close();
                st.close();
                con.close();
                return listaMidia;
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
            String sql = "SELECT m.idmidia FROM midia m, compraFutura c WHERE m.idmidia = c.midia_idmidia AND c.midia_idmidia =?";
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
    public List<Midia> naoEstaRealacionado() {
        try {
            con = ConnectionFactory.getConnection();
            List<Midia> listaMidia = new ArrayList<Midia>();
            String sql = "SELECT * FROM midia m WHERE m.idmidia not in (SELECT cf.midia_idmidia FROM comprafutura cf) ORDER BY m.tituloEmPortugues";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Midia m = new Midia();

                    m.setId(rs.getInt(1));
                    m.setTituloOriginal(rs.getString(2));
                    m.setTituloPortugues(rs.getString(3));
                    m.setAnoDeLancamento(rs.getString(4));
                    m.setDuracao(rs.getString(5));
                    m.setPaisDeOrigem(rs.getString(6));
                    m.setTipoDeEdicao(rs.getString(7));
                    m.setTipoDeEmbalagem(rs.getString(8));
                    m.setQtdeBD(rs.getInt(9));
                    m.setQtdeDvd(rs.getInt(10));
                    m.setQtdeBD3d(rs.getInt(11));
                    m.setGenero(rs.getString(12));
                    m.setDescricao(rs.getString(13));
                    m.setValorDeCompra(rs.getDouble(14));
                    m.setAnoDeCompra(rs.getString(15));
                    m.setTipoDeMidia(rs.getString(16));
                    m.setCodigoDeBarras(rs.getString(17));
                    m.setImagem(rs.getString(18));
                    listaMidia.add(m);

                }
                rs.close();
                st.close();
                con.close();
                return listaMidia;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public List<Midia> listarPorNome(String titulo) throws Exception {
         try {
            con = ConnectionFactory.getConnection();
            List<Midia> listaMidia = new ArrayList<Midia>();
            String sql = "SELECT * FROM midia m, compraFutura c WHERE c.midia_idmidia = m.idmidia and m.tituloEmPortuques=?";
            PreparedStatement st = con.prepareStatement(sql);
             st.setString(1, titulo);

            ResultSet rs = st.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Midia m = new Midia();

                    m.setId(rs.getInt(1));
                    m.setTituloOriginal(rs.getString(2));
                    m.setTituloPortugues(rs.getString(3));
                    m.setAnoDeLancamento(rs.getString(4));
                    m.setDuracao(rs.getString(5));
                    m.setPaisDeOrigem(rs.getString(6));
                    m.setTipoDeEdicao(rs.getString(7));
                    m.setTipoDeEmbalagem(rs.getString(8));
                    m.setQtdeBD(rs.getInt(9));
                    m.setQtdeDvd(rs.getInt(10));
                    m.setQtdeBD3d(rs.getInt(11));
                    m.setGenero(rs.getString(12));
                    m.setDescricao(rs.getString(13));
                    m.setValorDeCompra(rs.getDouble(14));
                    m.setAnoDeCompra(rs.getString(15));
                    m.setTipoDeMidia(rs.getString(16));
                    m.setCodigoDeBarras(rs.getString(17));

                    listaMidia.add(m);

                }
                rs.close();
                st.close();
                con.close();
                return listaMidia;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }
    }

}
