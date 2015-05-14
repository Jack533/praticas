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
public interface EmpresaDAO {

    public void inserir(Empresa e) throws Exception;

    public void editar(Empresa e, int id) throws Exception;

    public void remover(int idempresa) throws Exception;

    public List<Empresa> listar() throws Exception;

    public int retornaIdEmpresa(String nome);

    public List<Empresa> listarPorTipo(String tipo);

    public Empresa retornaEmpresa(int id);

}
