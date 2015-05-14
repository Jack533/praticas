/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.mc.facade.Facade;
import br.com.mc.model.Artista;
import br.com.mc.model.Empresa;
import br.com.mc.model.Midia;
import br.com.mc.model.RelacionaElenco;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Onismar
 */
public class JUnitTest {
    
    private Facade facade = new Facade();
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     //@Test
    // public void hello() {}
     
     
    
    //--------------MIDIA-------------------------------------------------------
 
    
   /**@Test
     public void inserirMidia(){
         Midia m = new Midia();
         
                    m.setTituloOriginal("teste3");
                    m.setTituloPortugues("teste3");
                    m.setAnoDeLancamento("ano3");
                    m.setDuracao("123");
                    m.setPaisDeOrigem("teste1");
                    m.setTipoDeEdicao("teste1");
                    m.setTipoDeEmbalagem("teste1");
                    m.setQtdeBD(1);
                    m.setQtdeDvd(1);
                    m.setQtdeBD3d(1);
                    m.setGenero("teste1");
                    m.setDescricao("teste1");
                    m.setValorDeCompra(1.00);
                    m.setAnoDeCompra("ano1");
                    m.setTipoDeMidia("teste1");
                    m.setCodigoDeBarras("9999999999991");
                    
                    
                    
                    
        try {
            facade.inserirMidia(m);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     }**/
    
    
    //------------------------------------------------------------------
    
    
    /**@Test
    public void listarMidia(){
        
        List<Midia> lista;
        try {
            lista = facade.listarMidia();
            
            for(Midia m : lista){
            System.out.println("-------------------------");
            System.out.print("|  idmidia ");System.out.print(m.getId());System.out.println("|");
            System.out.println("-------------------------");
            System.out.println(m.getTituloOriginal());
            System.out.println(m.getTituloPortugues());
            System.out.println(m.getAnoDeLancamento());
            }
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }**/
    
    
    //------------------------------------------------------------------
    
    
    /**@Test
    public void editarMidia(){
        //Informe o id da midia
        int id = 1;
         Midia m = new Midia();
         
                    m.setTituloOriginal("teste11");
                    m.setTituloPortugues("teste11");
                    m.setAnoDeLancamento("ano3");
                    m.setDuracao("123");
                    m.setPaisDeOrigem("teste1");
                    m.setTipoDeEdicao("teste1");
                    m.setTipoDeEmbalagem("teste1");
                    m.setQtdeBD(1);
                    m.setQtdeDvd(1);
                    m.setQtdeBD3d(1);
                    m.setGenero("teste1");
                    m.setDescricao("teste1");
                    m.setValorDeCompra(1.00);
                    m.setAnoDeCompra("ano1");
                    m.setTipoDeMidia("teste1");
                    m.setCodigoDeBarras("9999999999991");
        
                    
        try {
            facade.editarMidia(m, id);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }**/
   
    
    //------------------------------------------------------------------
    
    
   /**@Test
    public void removerMidia(){
       //Informe o id da midia
       int id = 3;
       
        try {
            facade.removerMidia(id);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    
    
    
    
    
    
    //--------------ARTISTA-------------------------------------------------------
    
    
    
  /**  @Test
    public void inserirArtista(){
        
        Artista a  = new Artista();
        
        a.setNome("nometeste");
        a.setSexo("sexo");
        a.setNacionalidade("nacionalidadeTeste");
        a.setProfissao("profissaoteste");
        
        try {
            facade.inserirArtisma(a);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }**/
    
    
    
     //------------------------------------------------------------------
    
    
    /**@Test
    public void listarArtista(){
        
        List<Artista> lista;
        
        
        try {
            lista = facade.listarArtista();
            for (Artista a : lista){
             System.out.println("-------------------------");
            System.out.print("|  idartista ");System.out.print(a.getId());System.out.println("|");
                System.out.println(a.getNome());
                System.out.println(a.getSexo());
                System.out.println(a.getNacionalidade());
                System.out.println(a.getProfissao());
        }
        
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }**/
    
    
    
      //------------------------------------------------------------------
    
    
    
   /** @Test
    public void editarArtista(){
        
         //Informe o id do Artita
         int id = 17;
          Artista a  = new Artista();
          a.setNome("aaaaaaaaa");
          a.setSexo("M");
          a.setNacionalidade("nacionalidadeteste");
          a.setProfissao("desenpragado");
          
        try {
            facade.editarArtista(a, id);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    
    //------------------------------------------------------------------
    
    
    /**@Test
    public void removerArtista(){
    //informe o id do Artista
        int id = 17;
         
        try {
            facade.removerArtista(id);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    
    
    
     //--------------EMPRESA-------------------------------------------------------
        /* @Test
     public void inserirEmpresa(){
         
         Empresa e = new Empresa();
          
                    e.setNome("Testenome");
                    e.setPais("TestePaisOrigem");
                    e.setTipo("TesteTipo");
                    
        try {
            facade.inserirEmpresa(e);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
         
     }**/
    
    
    
     //------------------------------------------------------------------
    
     
    /**@Test
    public void listarEmpresa(){
        List<Empresa> lista;
        try {
            lista = facade.listarEmpresa();
             for(Empresa e:lista){
                 System.out.println("-------------------------");
                 System.out.print("|  idempresa ");System.out.print(e.getId());System.out.println("|");
                 System.out.println(e.getNome());
                  System.out.println(e.getPais());
                  System.out.println(e.getTipo());
            
        }
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }**/
    
    
    //------------------------------------------------------------------
    
    /**@Test
    public void removerEmpresa(){
        //informe o id da Empresa
        int id = 13;
        
        try {
            facade.removerEmpresa(id);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }**/
    
    
    
    
     //--------------RELAÇÃOARTISTA-------------------------------------------------------
    
    
    /**@Test
    public void inserirRelacaoArtista(){
    * //Informe o id da midia e do artista
        int idmidia = 19;
        int idartista = 16;
        String nomePersonagem = "personagem";
        RelacionaElenco re = new RelacionaElenco();
        re.setIdMidia(idmidia);
        re.setIdArtista(idartista);
        re.setNomeNoFilme(nomePersonagem);
        
       facade.realacionaArtista(re.getIdArtista(), re.getIdMidia(), re.getNomeNoFilme());
    }**/
    
    
     //------------------------------------------------------------------
    
    
    /**@Test
    public void removerRelacionamentoArtista(){
    * //Informe o id da midia e do artista
        int idmidia=19;
        int idartista=16;
         
        facade.removeRelacionamento(idmidia, idartista);
    }**/
    
    
    
    
    //--------------RELAÇÃOELENCO-------------------------------------------------------
    
    /**@Test
     public void inserirRelacaoEmpresa(){
         //Informe o id da midia e empresa
         int midia= 19;
          int empresa = 12;
          
          facade.relacionaEmpresa(midia, empresa);
     }**/
    
    
    //------------------------------------------------------------------
    
    
     /**@Test
     public void removerRelacionamentoEmpresa(){
     * //Informe qual relacionamento executar
         int idmidia=19;
         int idempresa = 12;
         
         facade.removeRelacionamentoEmpresa(idmidia, idempresa);
         
     }**/
    
    
    
    
    //--------------COLEÇÃO-------------------------------------------------------
    
    /**@Test
    public void inserirColecao(){
        
        
        try {
            facade.inserirColecao(2);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    //------------------------------------------------------------------
    
    /**@Test
    public void removerDaColecao(){
        try {
            facade.removeColecao(1);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }**/
    
    
     /**@Test
    public void listarColecao(){
        try {
            facade.listarColecao();
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    
    
    
   //--------------Top10-------------------------------------------------------
    
    /**@Test
    public void inserirTop10(){
        
        
        try {
            facade.inserirTop10(1);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    //------------------------------------------------------------------
    
    /**@Test
    public void removerDoTop10(){
        try {
            facade.removeTop10(1);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }**/
    
    
     /**@Test
    public void listarTop10(){
        try {
            facade.listarTop10();
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    
     //--------------Compra Futura-------------------------------------------------------
    
    /**@Test
    public void inserirCompraFutura(){
        
        
        try {
            facade.inserirCompraFutura(1);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
    
    
    //------------------------------------------------------------------
    
    /**@Test
    public void removerCompraFutura(){
        try {
            facade.removeCompraFutura(1);
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }**/
    
    
     /**@Test
    public void listarCompraFutura(){
        try {
            facade.listarCompraFutura();
        } catch (Exception ex) {
            Logger.getLogger(JUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }**/
}
