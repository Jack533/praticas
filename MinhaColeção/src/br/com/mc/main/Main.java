/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.main;

import br.com.mc.dao.ArtistaDAO;
import br.com.mc.dao.EmpresaDAO;
import br.com.mc.dao.MidiaDAO;
import br.com.mc.dao.Top10DAO;
import br.com.mc.facade.Facade;
import br.com.mc.facade.IFacade;
import br.com.mc.gui.TelaPrincipal;
import br.com.mc.model.Artista;
import br.com.mc.util.DaoFactory;
import br.com.mc.util.ImagemUtil;
import br.com.mc.util.MensagensUtil;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




/**
 *
 * @author Onismar
 */
public class Main {
    
    
    
    public static void main(String[] args) throws IOException  {
       
       new TelaPrincipal().setVisible(true);
        
        
      
     }
 
    
    
     
        
        
    
    
    
}
