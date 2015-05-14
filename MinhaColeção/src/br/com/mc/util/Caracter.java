/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.util;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Onismar
 */
public class Caracter extends PlainDocument{
    
    
    @Override
    public void insertString (int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
        //super.insertString(offset, str.replaceAll("[^0-9]",""), attr);
       String texto = getText(0, getLength());
        if(texto.length() < 7) {
            remove(0, getLength());
            StringBuffer strBuf = new StringBuffer(texto.replaceAll("[^0-9]","")
                    + str);
            if(strBuf.length() < 3) strBuf.insert(0, ",  ");
            else strBuf.insert(strBuf.length() - 2, ",");
            super.insertString(0, strBuf.toString(),attr);
        }
    }
    
    public void replace (int offset, String str, javax.swing.text.AttributeSet attr)throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^0-9]",""), attr);
    }
    
}
