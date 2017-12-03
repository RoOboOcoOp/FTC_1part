package br.ufop.controller;
import java.util.Stack;

/**
 *
 * @author UFOP
 */
 public class Tag {
    //objeto tag fará a comparação com a pilha
    private  String nome;
    private  String expreg;
        
    /*public Tag (String nome, String expreg){
        this.nome = nome;
        this.expreg = expreg;
    }*/
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
        PilhaTag pilha = new PilhaTag(); 
        Tag tag = new Tag();
        //Tag t new = tag(nome,expreg);
        int i;
      
        if(inicial.contains(": ")){
            String[] quebra = inicial.split(": ", 2);
            tag.nome = quebra[0];
            tag.expreg = quebra[1];
            
            
            System.out.println("quebra"+quebra[0]+"quebra2"+quebra[1]);
                
            for(i=0; i<tag.expreg.length(); i++){
                      //pilha.insere();
                }
        }
        else{
            System.out.println("A String Informada não é uma Tag");
        }
       
    }
    //public static String Encontra_Tag(String){
   //}
    
}
