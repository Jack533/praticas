/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientes.servlet;

import clientes.dao.ClienteDAO;
import clientes.model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Onismar
 */
@WebServlet("/alterar")
public class AlterarClientesServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id")); 
        String nome = req.getParameter("nome");
        String endereco = req.getParameter("endereco");
        String telefone = req.getParameter("telefone");
        String email = req.getParameter("email");
        String nascimento = req.getParameter("nascimento");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            
            Cliente cliente = new Cliente();

            cliente.setId(id);
            cliente.setNome(nome);
            cliente.setEndereco(endereco);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);
            cliente.setNascimento(formatter.parse(nascimento));

            ClienteDAO dao = new ClienteDAO();
            
            dao.atualizar(cliente);
                    
            resp.getWriter().println("Contato atualizado com sucesso!");

        } catch (Exception e) {

            resp.getWriter().println("Formato de data inválido");
        }

    }
}
