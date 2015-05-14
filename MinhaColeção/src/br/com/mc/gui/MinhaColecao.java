/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mc.gui;

import br.com.mc.dao.MidiaDAO;
import br.com.mc.facade.IFacade;
import br.com.mc.model.Midia;
import br.com.mc.util.DaoFactory;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Onismar
 */
public class MinhaColecao extends javax.swing.JDialog {

    /**
     * Creates new form TelaColecao1
     */
    
    IFacade facade = DaoFactory.createFacade();
    MidiaDAO m = DaoFactory.createMidiaDAO();
    List<Midia> listaMidia, listaMidia2  = new ArrayList<>();
    ImageIcon icone;
    private int cont = 0;
    private int pagina = 1;
    private int tam = 14;
    TelaMidia tm;
    ListarMinhaColecao listarColecao;
    BuscarMidia buscar;
    public static final String URL = "img/";
    
    
    
    public MinhaColecao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }
        initComponents();
        setLocationRelativeTo(null);
        desativaLabels();
    }

    
    public void desativaLabels(){
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
    }
    
    
    public void preencheLabels(int limit, int cont){
        
        listaMidia = facade.listarPorDemandaMidia(limit, cont);
        
        if (listaMidia.size() >= 1) {
            icone = new ImageIcon(URL+listaMidia.get(0).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel1.setVisible(true);
            jLabel1.setIcon(icone);
            jLabel1.setToolTipText(listaMidia.get(0).getTituloPortugues());
        }
        
        
        
        if (listaMidia.size() >= 2) {
            icone = new ImageIcon(URL+listaMidia.get(1).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel2.setVisible(true);
            jLabel2.setIcon(icone);
            jLabel2.setToolTipText(listaMidia.get(1).getTituloPortugues());
        }
        
        
        
        if (listaMidia.size() >= 3) {
            icone = new ImageIcon(URL+listaMidia.get(2).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel3.setVisible(true);
            jLabel3.setIcon(icone);
            jLabel3.setToolTipText(listaMidia.get(2).getTituloPortugues());
        }
        
        
        
        if (listaMidia.size() >= 4) {
            icone = new ImageIcon(URL+listaMidia.get(3).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel4.setVisible(true);
            jLabel4.setIcon(icone);
            jLabel4.setToolTipText(listaMidia.get(3).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 5) {
            icone = new ImageIcon(URL+listaMidia.get(4).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel5.setVisible(true);
            jLabel5.setIcon(icone);
            jLabel5.setToolTipText(listaMidia.get(4).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 6) {
            icone = new ImageIcon(URL+listaMidia.get(5).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel6.setVisible(true);
            jLabel6.setIcon(icone);
            jLabel6.setToolTipText(listaMidia.get(5).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 7) {
            icone = new ImageIcon(URL+listaMidia.get(6).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel7.setVisible(true);
            jLabel7.setIcon(icone);
            jLabel7.setToolTipText(listaMidia.get(6).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 8) {
            icone = new ImageIcon(URL+listaMidia.get(7).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel8.setVisible(true);
            jLabel8.setIcon(icone);
            jLabel8.setToolTipText(listaMidia.get(7).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 9) {
            icone = new ImageIcon(URL+listaMidia.get(8).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel9.setVisible(true);
            jLabel9.setIcon(icone);
            jLabel9.setToolTipText(listaMidia.get(8).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 10) {
            icone = new ImageIcon(URL+listaMidia.get(9).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel10.setVisible(true);
            jLabel10.setIcon(icone);
            jLabel10.setToolTipText(listaMidia.get(9).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 11) {
            icone = new ImageIcon(URL+listaMidia.get(10).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel11.setVisible(true);
            jLabel11.setIcon(icone);
            jLabel11.setToolTipText(listaMidia.get(10).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 12) {
            icone = new ImageIcon(URL+listaMidia.get(11).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel12.setVisible(true);
            jLabel12.setIcon(icone);
            jLabel12.setToolTipText(listaMidia.get(11).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 13) {
            icone = new ImageIcon(URL+listaMidia.get(12).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel13.setVisible(true);
            jLabel13.setIcon(icone);
            jLabel13.setToolTipText(listaMidia.get(12).getTituloPortugues());
        }
        
        
        if (listaMidia.size() >= 14) {
            icone = new ImageIcon(URL+listaMidia.get(13).getImagem());
            icone.setImage(icone.getImage().getScaledInstance(130, 167, 100));
            jLabel14.setVisible(true);
            jLabel14.setIcon(icone);
            jLabel14.setToolTipText(listaMidia.get(13).getTituloPortugues());
        }
        
    }
    
    
    public void mostraTelaMidia(){
        tm = new TelaMidia(new javax.swing.JFrame(), true);
        tm.setVisible(true);
    }
    
    
    public void mostraTelaBuscar(){
        buscar = new BuscarMidia(new javax.swing.JFrame(), true);
        BuscarMidia.jComboBoxListar.setSelectedItem("Mídias que não estão na Coleção");
        buscar.setVisible(true);
    }
    
    
    public void mostraTelaListarColecao(){
        listarColecao = new ListarMinhaColecao(new javax.swing.JFrame(), true);
        listarColecao.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        numeroPagina = new javax.swing.JTextField();
        pagAnt = new javax.swing.JToggleButton();
        pagProx = new javax.swing.JToggleButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Minha Coleção");
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 100, 130, 167);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 100, 130, 167);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 100, 130, 167);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 100, 130, 167);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(700, 100, 130, 167);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(860, 100, 130, 167);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1020, 100, 130, 167);

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 340, 130, 167);

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 340, 130, 167);

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 340, 130, 167);

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(540, 340, 130, 167);

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(700, 340, 130, 167);

        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(860, 340, 130, 167);

        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1020, 340, 130, 167);

        numeroPagina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeroPagina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(numeroPagina);
        numeroPagina.setBounds(590, 550, 40, 30);

        pagAnt.setText("Página Anterior");
        pagAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagAntActionPerformed(evt);
            }
        });
        getContentPane().add(pagAnt);
        pagAnt.setBounds(450, 550, 130, 30);

        pagProx.setText("Próxima Página");
        pagProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagProxActionPerformed(evt);
            }
        });
        getContentPane().add(pagProx);
        pagProx.setBounds(640, 550, 130, 30);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/imagens/icone_coleção_p.png"))); // NOI18N
        jButton7.setText("Listar Coleção Completa");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(250, 610, 220, 40);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/imagens/icone_dados_da_coleção.png"))); // NOI18N
        jButton9.setText("Dados da Coleção");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(500, 610, 220, 40);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/imagens/icone_buscar_e add.png"))); // NOI18N
        jButton8.setText("Buscar e Adicionar");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(750, 610, 220, 40);

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/imagens/backgroud_coleção2.png"))); // NOI18N
        getContentPane().add(backgroud);
        backgroud.setBounds(0, 0, 1200, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        if(listaMidia.size() >= 1){
            TelaMidia.idMidia = listaMidia.get(0).getId();
            mostraTelaMidia();
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited

        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(listaMidia.size() >= 2){
            TelaMidia.idMidia = listaMidia.get(1).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(listaMidia.size() >= 3){
            TelaMidia.idMidia = listaMidia.get(2).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(listaMidia.size() >= 4){
            TelaMidia.idMidia = listaMidia.get(3).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(listaMidia.size() >= 5){
            TelaMidia.idMidia = listaMidia.get(4).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(listaMidia.size() >= 6){
            TelaMidia.idMidia = listaMidia.get(5).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(listaMidia.size() >= 9){
            TelaMidia.idMidia = listaMidia.get(8).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(listaMidia.size() >= 10){
            TelaMidia.idMidia = listaMidia.get(9).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(listaMidia.size() >= 11){
            TelaMidia.idMidia = listaMidia.get(10).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(listaMidia.size() >= 12){
            TelaMidia.idMidia = listaMidia.get(11).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(listaMidia.size() >= 13){
            TelaMidia.idMidia = listaMidia.get(12).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(listaMidia.size() >= 14){
            TelaMidia.idMidia = listaMidia.get(13).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel14MouseExited

    private void pagAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagAntActionPerformed

        if(!pagProx.isEnabled()){
            pagProx.setEnabled(true);
        }

        pagina--;
        numeroPagina.setText(String.valueOf(pagina));

        tam = tam-14;
        cont = cont-14;
        preencheLabels(14, cont);

        if(cont == 0){
            pagAnt.setEnabled(false);
        }

       // System.out.println("ant tam = " + tam);
       // System.out.println("cont = " + cont);
       // System.out.println("----------------");

    }//GEN-LAST:event_pagAntActionPerformed

    private void pagProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagProxActionPerformed

        desativaLabels();
        
        tam = tam+14;
        pagina++;
        numeroPagina.setText(String.valueOf(pagina));

        if(listaMidia2.size() <= tam){
            pagProx.setEnabled(false);
        }

        pagAnt.setEnabled(true);

        cont = cont+14;

        preencheLabels(14, cont);

       /** System.out.println("prox tam = " + tam);
        System.out.println("cont = " + cont);
        System.out.println("----------------");
        **/
    }//GEN-LAST:event_pagProxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        mostraTelaListarColecao();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        mostraTelaBuscar();
        
              
        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(listaMidia.size() >= 8){
            TelaMidia.idMidia = listaMidia.get(7).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(listaMidia.size() >= 7){
            TelaMidia.idMidia = listaMidia.get(6).getId();
            mostraTelaMidia();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel7MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        numeroPagina.setEditable(false);
        
        pagAnt.setEnabled(false);
                
        try {
            listaMidia2 = facade.listarColecao();
        } catch (Exception ex) {
            Logger.getLogger(MinhaColecao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(listaMidia2.size() <= tam){
            pagProx.setEnabled(false);
        }
        
        numeroPagina.setText(String.valueOf(pagina));
        
        preencheLabels(14, cont);
        
        
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MinhaColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinhaColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinhaColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhaColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MinhaColecao dialog = new MinhaColecao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numeroPagina;
    private javax.swing.JToggleButton pagAnt;
    private javax.swing.JToggleButton pagProx;
    // End of variables declaration//GEN-END:variables
}
