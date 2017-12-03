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
        
<<<<<<< HEAD
=======
        PilhaTag pilha = new PilhaTag(); 
        Tag tag = new Tag();
        //Tag t new = tag(nome,expreg);
        int i;
      
        if(inicial.contains(": ")){
            String[] quebra = inicial.split(": ", 2);
            tag.nome = quebra[0].toUpperCase();
            tag.expreg = quebra[1];
            
            //teste para split 
            System.out.println("quebra"+quebra[0]+"quebra2"+quebra[1]);
            
            /*
            for(i=0; i<tag.expreg.length(); i++){
                      //pilha.insere(tag.expreg.toString());
            }
            */
        }
        else{
            System.out.println("A String Informada não é uma Tag");
        }
       
>>>>>>> 5e006fdb8b0c8e2f0ac1a186612ac2c0c4748648
    }

}
