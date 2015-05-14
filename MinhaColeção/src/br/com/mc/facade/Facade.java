/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.facade;

import br.com.mc.dao.ArtistaDAO;
import br.com.mc.dao.ColecaoDAO;
import br.com.mc.dao.CompraFuturaDAO;
import br.com.mc.dao.EmpresaDAO;
import br.com.mc.dao.MidiaDAO;
import br.com.mc.dao.RelacionaElencoDAO;
import br.com.mc.dao.RelacionaEmpresaDAO;
import br.com.mc.dao.Top10DAO;
import br.com.mc.model.Artista;
import br.com.mc.model.Empresa;
import br.com.mc.model.Midia;
import br.com.mc.model.Top10;
import br.com.mc.util.DaoFactory;
import java.util.List;

/**
 *
 * @author Onismar
 */
public class Facade implements IFacade{
    
    private ArtistaDAO artistaDao;
    private MidiaDAO midiaDao;
    private EmpresaDAO empresaDao;
    private RelacionaElencoDAO relacionaElencoDao;
    private RelacionaEmpresaDAO relacionaEmpresaDao;
    private ColecaoDAO colecaoDao;
    private Top10DAO top10Dao;
    private CompraFuturaDAO compraFuturaDao;
    
    
    
    
    public Facade (){
        artistaDao = DaoFactory.createArtistaDAO();
        midiaDao = DaoFactory.createMidiaDAO();
        empresaDao = DaoFactory.createEmpresaDAO();
        relacionaElencoDao = DaoFactory.createRealacionaElenco();
        relacionaEmpresaDao = DaoFactory.createRelacionaEmpresa();
        colecaoDao =  DaoFactory.createColecaoDAO();
        top10Dao = DaoFactory.createTop10DAO();
        compraFuturaDao = DaoFactory.createCompraFuturaDAO();
    }
    
    
    
    
    
    //----------Midia------------------------------------------------------------------------------------------
    @Override
    public void inserirMidia(Midia m) throws Exception {
        midiaDao.inserir(m);
    }

    @Override
    public void editarMidia(Midia m, int id) throws Exception {
        midiaDao.editar(m, id);
    }

    @Override
    public void removerMidia(int idmidia) throws Exception {
       midiaDao.remover(idmidia);
    }

    @Override
    public List<Midia> listarMidia() throws Exception {
       return midiaDao.listar();
       
    }

    @Override
    public int retornaMaxIdMidia() {
       return midiaDao.retornaMaxId();
    }

    @Override
    public int retornaIdMidia(String nome) {
        return midiaDao.retornaIdMidia(nome);
    }

    @Override
    public Midia retornaMidia(int id) {
        return midiaDao.retornaMidia(id);
    }

    @Override
    public List<Midia> listarPorTipoMidia(String tipoDeMidia) throws Exception {
        return midiaDao.listarPorTipo(tipoDeMidia);
    }

    @Override
    public List<Midia> listarPorDemandaMidia(int limit, int offset) {
        return midiaDao.listarPorDemanda(limit, offset);
    }
    
    
    
    //----------Empresa------------------------------------------------------------------------------------------
    @Override
    public void inserirEmpresa(Empresa e) throws Exception {
        empresaDao.inserir(e);
    }

    @Override
    public void editarEmpresa(Empresa e,int id ) throws Exception {
      empresaDao.editar(e, id);
    }

    @Override
    public void removerEmpresa(int idempresa) throws Exception {
        empresaDao.remover(idempresa);
    }

    @Override
    public List<Empresa> listarEmpresa() throws Exception {
        return empresaDao.listar();
    }

    @Override
    public int retornaIdEmpresa(String nome) {
       return  empresaDao.retornaIdEmpresa(nome);
    }

    @Override
    public List<Empresa> listarPorTipoEmpresa(String tipo) {
      return empresaDao.listarPorTipo(tipo);
    }

      @Override
    public Empresa retornaEmpresa(int id) {
        return empresaDao.retornaEmpresa(id);
    }

    
    
    
    //----------Artista------------------------------------------------------------------------------------------
    @Override
    public void inserirArtisma(Artista a) throws Exception {
        artistaDao.inserir(a);
    }

    @Override
    public void editarArtista(Artista a, int id ) throws Exception {
          artistaDao.editar(a, id);
    }

    @Override
    public void removerArtista(int idartista) throws Exception {
        artistaDao.remover(idartista);
    }

    @Override
    public List<Artista> listarArtista() throws Exception {
        return artistaDao.listar();
    }

    @Override
    public int retornaIdArtisra(String nome, String profissao) {
         return artistaDao.retornaIdArtisra(nome, profissao);
    }

    @Override
    public List<Artista> listaPorProfissaoArtista(String profissao) {
       return artistaDao.listaPorProfissao(profissao);
    }

    @Override
    public Artista retornaArtista(int id) {
       return artistaDao.retornaArtista(id);
    }
    
    
    //----------Relaciona Artista------------------------------------------------------------------------------------------
    @Override
    public void realacionaArtista( int artista,int midia, String nome) {
        relacionaElencoDao.realacionaArtista( artista,midia, nome);
    }

    @Override
    public List<Artista> retornaArtRelacionado(int idmidia, String profissao) {
       return relacionaElencoDao.retornaArtRelacionado(idmidia, profissao);
    }

    @Override
    public boolean estaRelacionado(int idmidia, int idartista) {
       return relacionaElencoDao.estaRelacionado(idmidia, idartista);
    }

    @Override
    public void removeRelacionamentoArtista(int idmidia, int idartista) {
       relacionaElencoDao.removeRelacionamento(idmidia, idartista);
    }

    
    
    
    
    
    //----------Relaciona Empresa------------------------------------------------------------------------------------------
    @Override
    public void relacionaEmpresa(int midia, int empresa) {
         relacionaEmpresaDao.relacionaEmpresa(midia, empresa);
    }

    @Override
    public Empresa listaEmpRelacionada(int idmidia, String tipo) {
       return  relacionaEmpresaDao.listaEmpRelacionada(idmidia, tipo);
    }

    @Override
    public void editaRelacaoEmp(int idmidia, int empAnt, int novaEmp) {
         relacionaEmpresaDao.editaRelacao(idmidia, empAnt, novaEmp);
    }

    @Override
     public void removeRelacionamentoEmpresa(int idmidia,int idempresa){
         relacionaEmpresaDao.removeRelacionamento(idmidia, idempresa);
         
     }

    
     
     
      //----------Coleção------------------------------------------------------------------------------------------
     
     
     
     
    @Override
    public void inserirColecao(int idMidia) throws Exception {
         colecaoDao.inserir(idMidia);
    }
    
     @Override
    public void editarColecao(int idMidia) {
       colecaoDao.editar(idMidia);
    }


    @Override
    public void removeColecao(int idMidia) throws Exception {
         colecaoDao.remover(idMidia);
    }

    @Override
    public List<Midia> listarColecao() throws Exception {
        return colecaoDao.listar();
    }
    
    
    @Override
    public boolean estarRelacionadoColecao(int idMidia) {
       return colecaoDao.estarRelacionado(idMidia);
    }

    
     @Override
    public List<Midia> naoEstaRealacionadoColecao() {
        return colecaoDao.naoEstaRelacionado();
    }
    
    
    
      //----------Top10------------------------------------------------------------------------------------------
    
    
    
    
    
    @Override
    public void inserirTop10(int idMidia, int posicao) throws Exception {
        top10Dao.inserir(idMidia, posicao);
    }
    
      @Override
    public void editarTop10(int posicao, int idMidia) {
        top10Dao.editar(posicao, idMidia);
    }

    @Override
    public void removeTop10(int idMidia) throws Exception {
         top10Dao.remover(idMidia);
    }

    @Override
    public List<Top10> listarTop10(String tipoDeMidia) throws Exception {
       return  top10Dao.listar(tipoDeMidia);
    }
 
    @Override
    public boolean estarRelacionadoTop10(int idMidia) {
       return  top10Dao.estarRelacionado(idMidia);
    }

    @Override
    public boolean totalDeMidiasTop10(String tipoDeMidia) {
        return top10Dao.totalDeMidias(tipoDeMidia);
    }

    
    
 //----------Compra Futura------------------------------------------------------------------------------------------

    
    
    
    @Override
    public void inserirCompraFutura(int idMidia) throws Exception {
      compraFuturaDao.inserir(idMidia);
    }

     @Override
    public void editarCompraFutura(int idMidia) {
        compraFuturaDao.editar(idMidia);
    }
    
    @Override
    public void removeCompraFutura(int idMidia) throws Exception {
        compraFuturaDao.remover(idMidia);
    }

    @Override
    public List<Midia> listarCompraFutura() throws Exception {
        return compraFuturaDao.listar();
    }
    
    @Override
    public boolean estarRelacionadoCompraFutura(int idMidia) {
        return compraFuturaDao.estarRelacionado(idMidia);
    }

   
    @Override
    public List<Midia> naoEstaRealacionadoCompraFutura() {
        return compraFuturaDao.naoEstaRealacionado();
    }

    

  
    
   
   
    
    
}
