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
import static sun.nio.ch.IOStatus.EOF;

public class EntradaUsuario {
    public String[] identificaTag(String inicial) {
           //PilhaExpressoes pilha = new PilhaExpressoes(); 
            //Tag nova_tag = new Tag();
            //Tag t new = tag(nome,expreg);
            int i;
            String[] resultado = null;
                    String[] quebra;
                    if(inicial.contains(": ")){
                        
                        quebra = inicial.split(": ", 2);
                        
                   
                        //teste para split ,saida da entrada com nome e expressão se valida
                        System.out.println("nome "+quebra[0]+"\n expressao "+quebra[1]);

                        /*
                        for(i=0; i<tag.expreg.length(); i++){
                              //pilha.insere(tag.expreg.toString());
                        }
                        */
                    resultado = quebra;
                    
                                 
                    }else{
                        System.out.println("A String informada não é uma TAG.");
                    } 
                    return resultado;
    }
    public String[] identificaTag_Arqivo(String arq) {
           //PilhaExpressoes pilha = new PilhaExpressoes(); 
            //Tag nova_tag = new Tag();
            //Tag t new = tag(nome,expreg);
            int i;
            String[] resultado = null;
                    String[] quebra = null;
                    
                        if(arq.contains(": ")){
                        
                            quebra = arq.split(": ", 2);
                            
                   
                            //teste para split 
                            System.out.println("nome "+quebra[0]+"\nexp "+quebra[1]);

                            /*
                            for(i=0; i<tag.expreg.length(); i++){
                                //pilha.insere(tag.expreg.toString());
                            }
                            */
                        }
                        else{
                            System.out.println("A String informada não é uma TAG.");
                        }
                    resultado = quebra;
                    
                    return resultado;
    }
}
