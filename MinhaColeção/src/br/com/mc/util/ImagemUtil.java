/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.util;

import br.com.mc.facade.IFacade;
import br.com.mc.gui.CadastrarMidia;
import br.com.mc.gui.SelecionaArquivo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Onismar
 */
public class ImagemUtil {

    public void copiaImagem(File file) {

        try {
            FileInputStream origem;
            FileOutputStream destino;

            FileChannel fcOrigem;
            FileChannel fcDestino;

            origem = new FileInputStream(file.getAbsolutePath());
            destino = new FileOutputStream(ConfiguracoesUtil.getValor(ConfiguracoesUtil.DIRETORIO_DE_IMG) + file.getName()); //onde irá ficar a copia do aquivo

            fcOrigem = origem.getChannel();
            fcDestino = destino.getChannel();

            fcOrigem.transferTo(0, fcOrigem.size(), fcDestino); //copiando o arquivo e salvando no diretório escolhido

            origem.close();
            destino.close();

        } catch (Exception ex) {
            Logger.getLogger(ImagemUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    public String recuperaExtensao(File file) {
        String name;
        String fileName = file.getName();
        String ext[] = fileName.split("\\.");
        int i = ext.length;

        if (i > 1) {
            name = ext[i - 1];
            return name;
        }
        return "";
    }
    
    
    public File renomeiaImagem(File file, int idMidia){
        
        File file2 = new File(file.getParent()+"\\"+"capa_midia_"+idMidia+"."+recuperaExtensao(file));
        file.renameTo(file2);
        return file2;
        
    }
    

}
