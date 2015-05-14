/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.util;

import br.com.mc.dao.ArtistaDAO;
import br.com.mc.dao.ColecaoDAO;
import br.com.mc.dao.CompraFuturaDAO;
import br.com.mc.dao.EmpresaDAO;
import br.com.mc.dao.JDBCArtistaDAO;
import br.com.mc.dao.JDBCColecaoDAO;
import br.com.mc.dao.JDBCCompraFuturaDAO;
import br.com.mc.dao.JDBCEmpresaDAO;
import br.com.mc.dao.JDBCMidiaDAO;
import br.com.mc.dao.JDBCRelacionaElencoDAO;
import br.com.mc.dao.JDBCRelacionaEmpresaDAO;
import br.com.mc.dao.JDBCTop10DAO;
import br.com.mc.dao.JDBCUsuarioDAO;
import br.com.mc.dao.MidiaDAO;
import br.com.mc.dao.RelacionaElencoDAO;
import br.com.mc.dao.RelacionaEmpresaDAO;
import br.com.mc.dao.Top10DAO;
import br.com.mc.dao.UsuarioDAO;
import br.com.mc.facade.IFacade;
import br.com.mc.facade.Facade;
import br.com.mc.model.RelacionaElenco;
import br.com.mc.model.RelacionaEmpresa;

/**
 *
 * @author Onismar
 */
public class DaoFactory {
    
    public static MidiaDAO createMidiaDAO(){
        return new JDBCMidiaDAO();
    }
    
    
     public static ArtistaDAO createArtistaDAO(){
        return new JDBCArtistaDAO();
    }
     
     
    public static ColecaoDAO createColecaoDAO(){
        return new JDBCColecaoDAO();
    }
     
    
    public static EmpresaDAO createEmpresaDAO(){
        return new JDBCEmpresaDAO();
    } 
    
    
     public static UsuarioDAO createUsuarioDAO(){
        return new JDBCUsuarioDAO();
    } 
     
    public static RelacionaEmpresaDAO createRelacionaEmpresa(){
        return new JDBCRelacionaEmpresaDAO();
    }
    
    public static RelacionaElencoDAO createRealacionaElenco(){
        return new JDBCRelacionaElencoDAO();
      }
    
    
    public static IFacade createFacade(){
        return new Facade();
      }
    
    
    public static Top10DAO createTop10DAO(){
        return new JDBCTop10DAO();
    }
    
      public static CompraFuturaDAO createCompraFuturaDAO(){
        return new JDBCCompraFuturaDAO();
    }
    
    
}
