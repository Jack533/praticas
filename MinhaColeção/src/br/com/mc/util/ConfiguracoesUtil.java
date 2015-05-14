/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.util;

import java.util.ResourceBundle;

/**
 *
 * @author Onismar
 */
public class ConfiguracoesUtil {
    
    
    public static final String FILE_NAME = "mc.config/configuracao";
    public static final String URL = "url";
    public static final String LOGIN = "login";
    public static final String SENHA = "senha";
    public static final String DIRETORIO_DE_IMG = "diretorio_de_img";
    public static ResourceBundle bundle;
    
    
    static{
        bundle = ResourceBundle.getBundle(FILE_NAME);
                
    }
    
    
    
    public static String getValor(String chave){
        return bundle.getString(chave);
    }
    
    
    
    
}
