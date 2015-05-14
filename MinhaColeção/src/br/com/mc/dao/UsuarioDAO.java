/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;


import br.com.mc.model.Usuario;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface UsuarioDAO {
    
    public void inserir(Usuario u) throws Exception;
    
    public void editar(Usuario u) throws Exception;
    
    public void remover(Usuario u) throws Exception;
    
    public List<Usuario> listar() throws Exception;
    
}
