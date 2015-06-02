/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.relatorios;

import br.com.mc.model.Midia;
import br.com.mc.util.ConnectionFactory;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.hsqldb.lib.HashMap;

/**
 *
 * @author Onismar
 */
public class RelatoriosMidia {

    private String local;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void relatorioMinhaColecao() throws JRException {

        JasperPrint print = JasperFillManager.fillReport(local, null, ConnectionFactory.getConnection());
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
        //JasperExportManager.exportReportToPdfFile(, "C:\\Users\\Onismar\\Desktop\\Relatorio_Minha_Colecao.pdf");
    
    }
    
    
    public void relatorioPorAno(String ano) throws JRException {
        
        java.util.HashMap  parametro = new java.util.HashMap ();
        parametro.put("ano", ano);
        JasperPrint print = JasperFillManager.fillReport(local, parametro, ConnectionFactory.getConnection());
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);

    }
    
    
    
    

}
