/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientes.dao;

import clientes.model.Cliente;
import clientes.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Onismar
 */
public class ClienteDAO {
    
    
    private Connection con;

    public ClienteDAO() {
        con = ConnectionFactory.getConnection();
    }

    public void salvar(Cliente c) throws Exception {

        try {

            String sql = "INSERT INTO clientes (nome, endereco, telefone, email, nascimento) VALUES (?,?,?,?,?)";
            System.out.println("inserindo");
            // a partir da conexao, criar o statement
            PreparedStatement st = con.prepareStatement(sql);

            // preenche o statement (as '?')
            Date dataDB = new Date(c.getNascimento().getTime());

            st.setString(1, c.getNome());
            st.setString(2, c.getEndereco());
            st.setString(3, c.getTelefone());
            st.setString(4, c.getEmail());
            st.setDate(5, dataDB);
            System.out.println("inserido");
            // executa
            st.executeUpdate();
            
            System.out.println("inserido 2");
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir");
            throw new Exception(e);
        }

    }
    
        
    public void atualizar(Cliente c) throws Exception {

        try {

            String sql = "UPDATE clientes SET nome = ?, endereco = ?, telefone = ?, email = ?, nascimento = ? WHERE id = ?";

            PreparedStatement st = con.prepareStatement(sql);

            Date dataDB = new Date(c.getNascimento().getTime());

            st.setString(1, c.getNome());
            st.setString(2, c.getEndereco());
            st.setString(3, c.getTelefone());
            st.setString(4, c.getEmail());
            st.setDate(5, dataDB);
            st.setInt(6, c.getId());

            st.executeUpdate();

            con.close();

        } catch (SQLException e) {
            throw new Exception(e);
        }

    }

    public void excluir(Cliente c) throws Exception {
        try {

            String sql = "DELETE FROM clientes WHERE id = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, (int) c.getId());
            st.executeUpdate();
            con.close();

        } catch (SQLException e) {
            throw new Exception(e);
        }
    }

    public List<Cliente> listar() throws Exception {
        try {

            List<Cliente> lista = new ArrayList<Cliente>();

            String sql = "SELECT * FROM clientes";

            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                Date dataNas = new Date(rs.getDate("nascimento").getTime());
                
                Cliente c = new Cliente();
                c.setId(id);
                c.setNome(nome);
                c.setEndereco(endereco);
                c.setTelefone(telefone);
                c.setEmail(email);
                c.setNascimento(dataNas);
                
                lista.add(c);
            }

            con.close();

            return lista;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    
    
    
    
    }
    
}
