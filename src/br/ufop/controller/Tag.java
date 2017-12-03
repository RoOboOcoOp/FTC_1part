/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufop.controller;

import java.util.Stack;

/**
 *
 * @author UFOP
 */
public class Tag {
    String nome;
    String expreg;
    //Expressão regular com pilha
    //private List<Tag> tags = new LinkedList<Tag>();
    Stack pilha = new Stack(); 
    
    public void String Identifica_Tag(String inicial){
        int i;
        if(inicial.contains(":")){
            String[] quebra = inicial.split(":", 2);
            nome = quebra[0];
            expreg = quebra[1];
        }
        else{
            System.out.println("A String Informada ão é uma Tag");
        }
        for(i=0; i<expreg.length(); i++){
            pilha.push(expreg.toString(i));
        }
    }
    
    public static String Encontra_Tag(String){
        
    }
    
}
