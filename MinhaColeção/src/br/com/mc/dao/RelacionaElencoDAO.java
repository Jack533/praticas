/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Artista;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface RelacionaElencoDAO {
    
   public void realacionaArtista(int midia, int artista, String nome);
   
   public List<Artista> retornaArtRelacionado (int idmidia, String profissao);
   
   public boolean estaRelacionado(int idmidia, int idartista);
   
   public void removeRelacionamento(int idmidia, int idartista);
    
}
