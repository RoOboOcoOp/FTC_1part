package br.ufop.controller;
import java.util.Stack;

/**
 *
 * @author UFOP
 */
public class Tag {
    private static String nome;
    private static String expreg;
        
    public Tag (String nome, String expreg){
        this.nome = nome;
        this.expreg = expreg;
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
    /**
     *
     * @param inicial
     */
    
    public static void identificaTag(String inicial){
        Stack pilha = new Stack(); 
        //Tag t new = tag(nome,expreg);
        
        int i;
        
        if(inicial.contains(": ")){
            String[] quebra = inicial.split(": ", 2);
            nome = quebra[0];
            expreg = quebra[1];
                for(i=0; i<expreg.length(); i++){
                        //pilha.push(tag
                }
        }
        else{
            System.out.println("A String Informada não é uma Tag");
        }
       
    }
    //public static String Encontra_Tag(String){
   //}
    
}
