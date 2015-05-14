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
public class Empresa {
    
    private int id;
    private String nome;
    private String tipo; //Loja Virtual, Loja Física, Estúdio, Canal de TV Aberto, Canal de TV Flechada, Produtora e Outra.
    private String pais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    
    
}
