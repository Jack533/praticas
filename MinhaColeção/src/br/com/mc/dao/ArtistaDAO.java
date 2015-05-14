/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.dao;

import br.com.mc.model.Artista;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface ArtistaDAO {

    public void inserir(Artista a) throws Exception;

    public void editar(Artista a, int id) throws Exception;

    public void remover(int idartista) throws Exception;

    public List<Artista> listar() throws Exception;

    public int retornaIdArtisra(String nome, String profissao);

    public List<Artista> listaPorProfissao(String profissao);

    public Artista retornaArtista(int id);

}
