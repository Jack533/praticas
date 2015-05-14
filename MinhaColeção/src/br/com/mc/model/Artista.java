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
public class Artista extends Pessoa {
    
    private String profissao; // Diretor, Autor, Ator/Atriz, Roteirista
    private String nacionalidade;
    private String nomeNoFilme;

    public String getNomeNoFilme() {
        return nomeNoFilme;
    }

    public void setNomeNoFilme(String nomeNoFilme) {
        this.nomeNoFilme = nomeNoFilme;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
  
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

   
    
    
    
}
