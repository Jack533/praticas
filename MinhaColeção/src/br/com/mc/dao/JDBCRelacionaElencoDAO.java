/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Artista;
import br.com.mc.model.RelacionaElenco;
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
public class JDBCRelacionaElencoDAO implements RelacionaElencoDAO {

    private Connection con;

    @Override
    public void realacionaArtista(int midia, int artista, String nome) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "INSERT INTO relacaoequipe (artista_idartista, midia_idmidia, nomeNoFilme) VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, artista);
            st.setInt(2, midia);
            st.setString(3, nome);

            st.executeUpdate();

            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Artista> retornaArtRelacionado(int idmidia, String profissao) {

        List<Artista> listaArtista = new ArrayList<Artista>();

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT a.idartista, a.nome, a.sexo, a.profissao, a.nacionalidade, re.nomeNoFilme FROM artista a, midia m, relacaoequipe re WHERE a.idartista = re.artista_idartista AND m.idmidia = re.midia_idmidia AND m.idmidia =? AND a.profissao =?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idmidia);
            st.setString(2, profissao);
            ResultSet rs = st.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Artista a = new Artista();

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSexo(rs.getString(3));
                    a.setProfissao(rs.getString(4));
                    a.setNacionalidade(rs.getString(5));
                    a.setNomeNoFilme(rs.getString(6));

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
    public boolean estaRelacionado(int idmidia, int idartista) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT re.idrelacaoElenco, re.artista_idartista, re.midia_idmidia, re.nomeNoFilme FROM midia m, artista a, relacaoequipe re WHERE m.idmidia = re.midia_idmidia AND a.idartista = re.artista_idartista AND re.midia_idmidia =? AND re.artista_idartista =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idmidia);
            st.setInt(2, idartista);
            ResultSet rs = st.executeQuery();

            if (rs != null) {
                RelacionaElenco re = new RelacionaElenco();
                while (rs.next()) {

                    re.setIdRelacaoElenco(rs.getInt(1));
                    re.setIdArtista(rs.getInt(2));
                    re.setIdMidia(rs.getInt(3));
                    re.setNomeNoFilme(rs.getString(4));

                }

                rs.close();
                st.close();
                con.close();
                if (re.getIdArtista() != 0) {
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
    public void removeRelacionamento(int idmidia, int idartista) {

        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE from relacaoequipe WHERE midia_idmidia = ? AND artista_idartista = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idmidia);
            st.setInt(2, idartista);
            st.executeUpdate();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMidiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
