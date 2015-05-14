/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.facade;

import br.com.mc.dao.MidiaDAO;
import br.com.mc.model.Artista;
import br.com.mc.model.Empresa;
import br.com.mc.model.Midia;
import br.com.mc.model.Top10;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface IFacade {

    //----------Midia----------
    public void inserirMidia(Midia m) throws Exception;

    public void editarMidia(Midia m, int id) throws Exception;

    public void removerMidia(int idmidia) throws Exception;

    public List<Midia> listarMidia() throws Exception;

    public int retornaMaxIdMidia();

    public int retornaIdMidia(String nome);

    public Midia retornaMidia(int id);
    
    public List<Midia> listarPorTipoMidia(String tipoDeMidia) throws Exception;
    
    public List<Midia> listarPorDemandaMidia(int limit, int offset);
    
    

    //----------Empresa----------
    
    
    public void inserirEmpresa(Empresa e) throws Exception;

    public void editarEmpresa(Empresa e, int id) throws Exception;

    public void removerEmpresa(int idempresa) throws Exception;

    public List<Empresa> listarEmpresa() throws Exception;

    public int retornaIdEmpresa(String nome);

    public List<Empresa> listarPorTipoEmpresa(String tipo);

    public Empresa retornaEmpresa(int id);
    
    

    //----------Artista----------
    
    
    
    public void inserirArtisma(Artista a) throws Exception;

    public void editarArtista(Artista a, int id) throws Exception;

    public void removerArtista(int idartista) throws Exception;

    public List<Artista> listarArtista() throws Exception;

    public int retornaIdArtisra(String nome, String profissao);

    public List<Artista> listaPorProfissaoArtista(String profissao);

    public Artista retornaArtista(int id);

    
    
    //----------Relaciona Artista----------
    
    
    
    public void realacionaArtista(int artista,int midia, String nome);

    public List<Artista> retornaArtRelacionado(int idmidia, String profissao);

    public boolean estaRelacionado(int idmidia, int idartista);

    public void removeRelacionamentoArtista(int idmidia, int idartista);
    
    

    //----------Relaciona Empresa----------
    
    
    
    public void relacionaEmpresa(int midia, int empresa);

    public Empresa listaEmpRelacionada(int idmidia, String tipo);

    public void editaRelacaoEmp(int idmidia, int empAnt, int novaEmp);
    
    public void removeRelacionamentoEmpresa(int idmidia,int idempresa);

    
    
    //----------Coleção----------
    
    public void inserirColecao(int idMidia) throws Exception;
      
    public void editarColecao(int idMidia);
     
    public void removeColecao(int idMidia) throws Exception;
    
    public List<Midia> listarColecao() throws Exception;
    
    public boolean estarRelacionadoColecao(int idMidia);
    
    public List<Midia> naoEstaRealacionadoColecao();
    
    
    
    
    //----------Top10----------
    
    
    public void inserirTop10(int idMidia, int posicao) throws Exception;
    
    public void editarTop10(int posicao, int idMidia);
        
    public void removeTop10(int idMidia) throws Exception;
    
    public List<Top10> listarTop10(String tipoDeMidia) throws Exception;
    
    public boolean estarRelacionadoTop10(int idMidia);
    
    public boolean totalDeMidiasTop10(String tipoDeMidia);
    
    
    
       
    //----------Compras Futuras----------
    
    
    public void inserirCompraFutura(int idMidia) throws Exception;
    
    public void editarCompraFutura(int idMidia);
     
    public void removeCompraFutura (int idMidia) throws Exception;
    
    public List<Midia> listarCompraFutura() throws Exception;
      
    public boolean estarRelacionadoCompraFutura(int idMidia);
    
    public List<Midia> naoEstaRealacionadoCompraFutura();
    
    
}
