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
@WebServlet("/excluir")
public class ExcluirClienteServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id")); 
                
        try {
            
            Cliente cliente = new Cliente();

            cliente.setId(id);
            

            ClienteDAO dao = new ClienteDAO();
            
            dao.excluir(cliente);
                    
            resp.getWriter().println("Contato removido com sucesso!");

        } catch (Exception e) {

            resp.getWriter().println("ID não encontrado");
        }

    }
}
