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
public class MensagensUtil {

    private static final String FILE_NAME = "mc.config/mensagens";
    public static final String MSG_ERRO_SALVAR = "msg_erro_salvar";
    public static final String MSG_SUCESSO_SALVAR = "msg_sucesso_salvar";
    public static final String MSG_SELECIONE = "msg_selecione";
    public static final String MSG_REMOVER = "msg_remover";
    public static final String MSG_EDITADO = "msg_editado";
    public static final String MSG_ALTERAR = "msg_alterar";
    public static final String MSG_ADD_MIDIA = "msg_add_midia";
    public static final String MSG_MIDIA_ESTA_EM_COMPRAS_FUTURAS = "msg_midia_esta_em_compras_futuras";
    public static final String MSG_MIDIA_ESTA = "msg_midia_esta";
    public static final String MSG_MIDIA_JA_FOI_SALVA = "msg_midia_ja_foi_salva";
    public static final String MSG_MIDIA_EDITAR_EQUIPE_E_EMPRESA = "msg_midia_editar_equipe_e_empresa";
    public static final String MSG_ADD_ELENCO = "msg_add_elenco";
    public static final String MSG_ERRO_ADD_ELENCO = "msg_erro_add_elenco";
    public static final String MSG_ERRO_REMOVER_TOP10 = "msg_erro_remover_top10";
    public static final String MSG_REMOVER_TOP10 = "msg_remover_top10";
    public static final String MSG_ADD_TOP10 = "msg_add_top10";
    public static final String MSG_ERRO_ADD_TOP10 = "msg_erro_add_top10";
    public static final String MSG_TOP10_COMPLETO = "msg_top10_completo";
    public static final String MSG_ERRO_TOP10 = "msg_erro_top10";
    
    private static ResourceBundle bundle;
    
    static {
        bundle = ResourceBundle.getBundle(FILE_NAME);
    }
    
    public static String getValor(String chave){
        return bundle.getString(chave);
    }
    
    public static String getValor(String chave, String valor){
        return String.format(bundle.getString(chave), valor);
    }
    
    
}
