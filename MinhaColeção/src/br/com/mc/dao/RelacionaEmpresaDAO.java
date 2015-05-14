/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Empresa;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface RelacionaEmpresaDAO {
    
       
    public void relacionaEmpresa(int midia, int empresa);
    
    public Empresa listaEmpRelacionada(int idmidia, String tipo);
    
    public void editaRelacao(int idmidia, int empAnt, int novaEmp);
    
     public void removeRelacionamento(int idmidia, int idempresa);
    
}
