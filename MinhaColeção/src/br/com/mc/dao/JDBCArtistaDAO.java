/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Artista;
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
public class JDBCArtistaDAO implements ArtistaDAO {

    private Connection con;

    

    @Override
    public void inserir(Artista a) throws Exception {
        try {

            con = ConnectionFactory.getConnection();
            
            String sql = "INSERT INTO artista (nome,sexo,profissao,nacionalidade) VALUES (?,?,?,?)";

            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, a.getNome());
            st.setString(2, a.getSexo());
            st.setString(3, a.getProfissao());
            st.setString(4, a.getNacionalidade());

            st.executeUpdate();

            st.close();
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Erro ao inserir registro");
        }

    }

    @Override
    public void editar(Artista a, int id) throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            String sql = " UPDATE bd_colecao.artista  SET nome=?,sexo=?,profissao=?,nacionalidade=? WHERE idartista=? ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, a.getNome());
            st.setString(2, a.getSexo());
            st.setString(3, a.getProfissao());
            st.setString(4, a.getNacionalidade());
            st.setInt(5, id);

            st.executeUpdate();

            st.close();

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Erro ao inserir registro");
        }
    }

    @Override
    public void remover(int idartista) throws Exception {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE from artista WHERE idartista = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idartista);

            st.executeUpdate();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Artista> listar() throws Exception {

        List<Artista> listaArtista = new ArrayList<Artista>();

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM artista ORDER BY nome";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    Artista a = new Artista();

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSexo(rs.getString(3));
                    a.setProfissao(rs.getString(4));
                    a.setNacionalidade(rs.getString(5));

                    listaArtista.add(a);

                }
                rs.close();

                st.close();
                con.close();

                return listaArtista;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public int retornaIdArtisra(String nome, String profissao) {

        int id;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT idartista FROM artista WHERE nome = ? AND profissao = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nome);
            st.setString(2, profissao);
            ResultSet rs = st.executeQuery();
            rs.next();
            id = rs.getInt("idartista");
            rs.close();
            st.close();
            con.close();
            return id;

        } catch (SQLException e) {
            return 0;
        }

    }

    @Override
    public List<Artista> listaPorProfissao(String profissao) {

        List<Artista> listaArtista = new ArrayList<Artista>();

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM artista a WHERE a.profissao = ? ORDER BY a.nome"; 
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, profissao);
            ResultSet rs = st.executeQuery();

            if (rs != null) {

                
                while (rs.next()) {

                    Artista a = new Artista();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSexo(rs.getString(3));
                    a.setProfissao(rs.getString(4));
                    a.setNacionalidade(rs.getString(5));

                    listaArtista.add(a);

                }
                
                             
                
                rs.close();
                st.close();
                con.close();

                return listaArtista;

            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    @Override
    public Artista retornaArtista(int id) {
        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM artista WHERE idartista=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            System.out.println(id);
            ResultSet rs = st.executeQuery();

            if (rs != null) {
                Artista a = new Artista();
                while (rs.next()) {

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSexo(rs.getString(3));
                    a.setProfissao(rs.getString(4));
                    a.setNacionalidade(rs.getString(5));

                }
                rs.close();
                st.close();
                con.close();

                return a;
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

}
