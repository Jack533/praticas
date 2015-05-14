/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Midia;
import br.com.mc.model.Top10;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface Top10DAO {
    
    
    public void inserir(int idMidia, int posicao) throws Exception;
    
    public void remover(int idMidia) throws Exception;
    
    public List<Top10> listar(String tipoDeMidia) throws Exception;
    
    public void editar(int posicao, int idMidia);
    
    public boolean estarRelacionado(int idMidia);
    
    public boolean totalDeMidias(String tipoDeMidia);
    
}
