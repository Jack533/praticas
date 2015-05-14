/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.mc.model;

import java.util.Date;

/**
 *
 * @author Onismar
 */


public class Midia {
    
    
    private int id;
    private String tituloOriginal;
    private String tituloPortugues;
    private String anoDeLancamento;
    private String duracao;
    private String paisDeOrigem;
    private String tipoDeEdicao;
    private String tipoDeEmbalagem;
    private int qtdeBD;
    private int qtdeDvd;
    private int qtdeBD3d;
    private String genero;
    private String anoDeCompra;
    private String descricao;
    private Double valorDeCompra;
    private String tipoDeMidia; //Filme, Série de TV, Música/Shows, Documentarios e Outros
    private String codigoDeBarras;
    private String imagem;

    
    
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
        
    public int getQtdeBD3d() {
        return qtdeBD3d;
    }

    public void setQtdeBD3d(int qtdeBD3d) {
        this.qtdeBD3d = qtdeBD3d;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public String getAnoDeCompra() {
        return anoDeCompra;
    }

    public void setAnoDeCompra(String anoDeCompra) {
        this.anoDeCompra = anoDeCompra;
    }

    public Double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(Double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloPortugues() {
        return tituloPortugues;
    }

    public void setTituloPortugues(String tituloPortugues) {
        this.tituloPortugues = tituloPortugues;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getTipoDeEdicao() {
        return tipoDeEdicao;
    }

    public void setTipoDeEdicao(String tipoDeEdicao) {
        this.tipoDeEdicao = tipoDeEdicao;
    }

    public String getTipoDeEmbalagem() {
        return tipoDeEmbalagem;
    }

    public void setTipoDeEmbalagem(String tipoDeEmbalagem) {
        this.tipoDeEmbalagem = tipoDeEmbalagem;
    }

    public String getTipoDeMidia() {
        return tipoDeMidia;
    }

    public void setTipoDeMidia(String tipoDeMidia) {
        this.tipoDeMidia = tipoDeMidia;
    }

    public int getQtdeBD() {
        return qtdeBD;
    }

    public void setQtdeBD(int qtdeBD) {
        this.qtdeBD = qtdeBD;
    }

    public int getQtdeDvd() {
        return qtdeDvd;
    }

    public void setQtdeDvd(int qtdeDvd) {
        this.qtdeDvd = qtdeDvd;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    

}
