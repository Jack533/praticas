/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Pessoa;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface PessoaDAO {
    
    public void inserir(Pessoa p) throws Exception;
    
    public void editar(Pessoa p) throws Exception;
    
    public void remover(Pessoa p) throws Exception;
    
    public List<Pessoa> listar() throws Exception;
    
    
}
