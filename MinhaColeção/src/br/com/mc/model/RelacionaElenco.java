/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.model;

/**
 *
 * @author Onismar
 */
public class RelacionaElenco {
    
    
    private int idRelacaoElenco;
    private int idMidia;
    private int idArtista;
    private String nomeNoFilme;

    public int getIdRelacaoElenco() {
        return idRelacaoElenco;
    }

    public void setIdRelacaoElenco(int idRelacaoElenco) {
        this.idRelacaoElenco = idRelacaoElenco;
    }

    
    
    public int getIdMidia() {
        return idMidia;
    }

    public void setIdMidia(int idMidia) {
        this.idMidia = idMidia;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNomeNoFilme() {
        return nomeNoFilme;
    }

    public void setNomeNoFilme(String nomeNoFilme) {
        this.nomeNoFilme = nomeNoFilme;
    }
            
    
    
}
