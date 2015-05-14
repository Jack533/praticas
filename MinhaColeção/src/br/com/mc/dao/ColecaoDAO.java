/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;


import br.com.mc.model.Midia;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface ColecaoDAO {
    
    public void inserir(int idMidia) throws Exception;
    
    public void editar(int idMidia);
        
    public void remover(int idMidia) throws Exception;
    
    public List<Midia> listar() throws Exception;
    
    public boolean estarRelacionado(int idMidia);
    
    public List<Midia> naoEstaRelacionado();
    
   
    

}
