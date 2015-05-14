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
@WebServlet("/cadastraCliente")
public class CadastraClienteServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("nome");
        String endereco = req.getParameter("endereco");
        String telefone = req.getParameter("telefone");
        String email = req.getParameter("email");
        String nascimento = req.getParameter("nascimento");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Servlet");
        try {
            System.out.println("Servlet 2");
            Cliente cliente = new Cliente();

            cliente.setNome(nome);
            cliente.setEndereco(endereco);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);
            cliente.setNascimento(formatter.parse(nascimento));

            ClienteDAO dao = new ClienteDAO();
            System.out.println("Servlet 3");
            dao.salvar(cliente);
                    
            resp.getWriter().println("Contato cadastrado com sucesso!");

        } catch (Exception e) {

            resp.getWriter().println("Formato de data inválido");
        }

    }
}
