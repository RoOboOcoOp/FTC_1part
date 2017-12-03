package br.ufop.view;
import java.lang.*;
 /*Classe responsável pela pela identificação de uma expressão regular na entrada de um usuario
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839 / Leonardo Oliveira 12.2.8343
 * @version 1.0
 * @since 03/12/2017
 */

//Libs
import br.ufop.controller.PilhaExpressoes;
import br.ufop.controller.Tag;

public class EntradaUsuario {
    public String[] identificaTag(String inicial) {
           //PilhaExpressoes pilha = new PilhaExpressoes(); 
            //Tag nova_tag = new Tag();
            //Tag t new = tag(nome,expreg);
            int i;
            int conter = inicial.length();
            String[] resultado = null;
                    String[] quebra;
                    if(inicial.contains(": ")){
                        
                        quebra = inicial.split(": ", 2);
                        //nova_tag.setNome(quebra[0].toUpperCase());
                        //nova_tag.setExpreg(quebra[1]);
                        //tag.nome = quebra[0].toUpperCase();
                        //tag.expreg = quebra[1];
                   
                        //teste para split 
                        System.out.println("nome "+quebra[0]+"\nexp "+quebra[1]);

                        /*
                        for(i=0; i<tag.expreg.length(); i++){
                              //pilha.insere(tag.expreg.toString());
                        }
                        */
                    resultado = quebra;
                    
                    //resultado += new String[quebra.length resultado.length];
                    /*StringBuilder medicamento = new StringBuilder();
                    ItemContratacao item = new ItemContratacao();
                        for (ItemContratacao item: contrato) {
                            medicamento.apend(item.getDs_material());
                        medicamento.append(";");
                    }*/
                    
                    } 
                    return resultado;
    }
}
