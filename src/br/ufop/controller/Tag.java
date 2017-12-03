package br.ufop.controller;
import java.lang.*;
/*Classe responsável pela estrutura de dados e metodos de uma tag quando identificada pela entrada do usuario
    *atributos e construtor da classe implementados
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839 / Leonardo Oliveira 12.2.8343
 * @version 1.0
 * @since 03/12/2017
 */

 public class Tag{
    //objeto tag fará a comparação com a pilha
     
    String nome;
    String expreg;
        
    public Tag (String nome, String expreg){
        this.nome = nome;
        this.expreg = expreg;
    }
    //public Tag() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
          this.nome = nome;
        }
        public String getExpreg() {
          return expreg;
        }
        public void setExpreg(String expreg) {
          this.expreg = expreg;
        }
}
