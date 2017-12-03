package br.ufop.view;
import java.lang.*;


import br.ufop.controller.PilhaExpressoes;
import br.ufop.controller.Tag;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author UFOP
 */
public class EntradaUsuario {
    public String[] identificaTag(String inicial) {
           //PilhaExpressoes pilha = new PilhaExpressoes(); 
            //Tag nova_tag = new Tag();
            //Tag t new = tag(nome,expreg);
            int i;

                if(inicial.contains(": ")){
                    String[] quebra = inicial.split(": ", 2);
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
                    return quebra;
                }
                else{
                    System.out.println("A String Informada não é uma Tag");
                }
        return null;        
    }
    
}
