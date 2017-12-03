package br.ufop.controller;
//package br.ufop.view;
import java.lang.*;
/**
 *
 * @author Fabio , Wuldson e Leonardo
 */
 public class Tag{
    //objeto tag fará a comparação com a pilha
     
    String nome;
    String expreg;
        
    public Tag (String nome, String expreg){
        this.nome = nome;
        this.expreg = expreg;
    }
    

    public Tag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
          this.nome = nome;
        }
        public String getExpreg(String expreg) {
          return expreg;
        }

        public void setExpreg(String expreg) {
          this.expreg = expreg;
        }
         public static void indentificaExpressao(String inicial){
        
    }

}
