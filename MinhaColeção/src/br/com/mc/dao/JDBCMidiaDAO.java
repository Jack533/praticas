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
public class JDBCMidiaDAO implements MidiaDAO {

    private Connection con;

    @Override
    public void inserir(Midia m) throws Exception {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "INSERT INTO midia (tituloOriginal,tituloEmPortugues,anoDelancamento,duracao,paisDeOrigem,tipoDeEdicao,tipoDeEmbalagem,qtdBluray,qtdDvd,qtdBluRay3d,genero,descricao,valorDeCompra,anoDeCompra,tipoDeMidia,codDebarras,imagem) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, m.getTituloOriginal());
            st.setString(2, m.getTituloPortugues());
            st.setString(3, m.getAnoDeLancamento());
            st.setString(4, m.getDuracao());
            st.setString(5, m.getPaisDeOrigem());
            st.setString(6, m.getTipoDeEdicao());
            st.setString(7, m.getTipoDeEmbalagem());
            st.setInt(8, m.getQtdeBD());
            st.setInt(9, m.getQtdeDvd());
            st.setInt(10, m.getQtdeBD3d());
            st.setString(11, m.getGenero());
            st.setString(12, m.getDescricao());
            st.setDouble(13, m.getValorDeCompra());
            st.setString(14, m.getAnoDeCompra());
            st.setString(15, m.getTipoDeMidia());
            st.setString(16, m.getCodigoDeBarras());
            st.setString(17, m.getImagem());

            st.executeUpdate();

            st.close();

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Erro ao inserir registro");
        }

    }

    @Override
    public void editar(Midia m, int id) throws Exception {

        try {
            con = ConnectionFactory.getConnection();
            String sql = " UPDATE bd_colecao.midia SET tituloOriginal=?,tituloEmPortugues=?,anoDeLancamento=?,duracao=?,paisDeOrigem=?,tipoDeEdicao=?,tipoDeEmbalagem=?,qtdBluray=?,qtdDvd=?,qtdBluRay3d=?,genero=?,descricao=?,valorDeCompra=?,anoDeCompra=?,tipoDeMidia=?,codDebarras=?,imagem =? WHERE idmidia=? ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, m.getTituloOriginal());
            st.setString(2, m.getTituloPortugues());
            st.setString(3, m.getAnoDeLancamento());
            st.setString(4, m.getDuracao());
            st.setString(5, m.getPaisDeOrigem());
            st.setString(6, m.getTipoDeEdicao());
            st.setString(7, m.getTipoDeEmbalagem());
            st.setInt(8, m.getQtdeBD());
            st.setInt(9, m.getQtdeDvd());
            st.setInt(10, m.getQtdeBD3d());
            st.setString(11, m.getGenero());
            st.setString(12, m.getDescricao());
            st.setDouble(13, m.getValorDeCompra());
            st.setString(14, m.getAnoDeCompra());
            st.setString(15, m.getTipoDeMidia());
            st.setString(16, m.getCodigoDeBarras());
            st.setString(17, m.getImagem());
            st.setInt(18, id);

            st.executeUpdate();

            st.close();

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Erro ao inserir registro");
        }

    }

    @Override
    public void remover(int idmidia) throws Exception {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE from midia WHERE idmidia = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idmidia);

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

            String sql = "SELECT * FROM midia ORDER BY tituloEmPortugues";

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
    public int retornaMaxId() {

        int id = 0;

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT MAX(idmidia) FROM midia";
            PreparedStatement st;
            st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

    @Override
    public int retornaIdMidia(String nome) {

        int id;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT idmidia FROM midia WHERE tituloEmportugues = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nome);
            ResultSet rs = st.executeQuery();
            rs.next();
            id = rs.getInt("idmidia");
            rs.close();
            st.close();
            con.close();
            return id;

        } catch (SQLException e) {
            return 0;
        }

    }

    @Override
    public Midia retornaMidia(int id) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM midia WHERE idmidia=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);

            ResultSet rs = st.executeQuery();

            if (rs != null) {
                Midia m = new Midia();
                while (rs.next()) {

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
                }
                rs.close();
                st.close();
                con.close();
                return m;
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    @Override
    public List<Midia> listarPorTipo(String tipoDeMidia) {
        try {
            con = ConnectionFactory.getConnection();
            List<Midia> listaMidia = new ArrayList<Midia>();

            String sql = "SELECT * FROM midia m WHERE m.tipoDeMidia = ? ORDER BY tituloEmPortugues";

            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, tipoDeMidia);
            
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
    public List<Midia> listarPorDemanda(int limit, int offset) {
         try {
            con = ConnectionFactory.getConnection();
            List<Midia> listaMidia = new ArrayList<Midia>();

            String sql = "SELECT * FROM midia m, colecao c WHERE m.idmidia = c.midia_idmidia LIMIT ? OFFSET ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, limit);
            st.setInt(2, offset);
            
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

}
