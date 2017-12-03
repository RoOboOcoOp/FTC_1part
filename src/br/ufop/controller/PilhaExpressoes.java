package br.ufop.controller;

/*Classe responsável pela estrutura de dados e metodos de uma pilha que irá manipular expressões regulares

 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839 / Leonardo Oliveira 12.2.8343
 * @version 1.0
 * @since 03/12/2017
 */

//import java.util.LinkedList;
//import java.util.List;

public class PilhaExpressoes{
    private String[] elementos;
    private int size;
    
    //private final List<Tag> tag = new LinkedList<>();
    //PilhaTag pilha = new PilhaTag();
   
    public PilhaExpressoes(int capacity) {  
	/* 
	* Utilizamos o método abs da classe Math só pra evitar que se tente criar uma pilha "devedora"... 
	*/  
            elementos = new String[Math.abs(capacity)];  
            size = 0;  
	}
    
    public String push(String elemento) {  
	if(elemento == null)  
            throw new IllegalArgumentException("O elemento não pode ser nulo!");  
        if(size == elementos.length)  
            return null;  
	size++;  
	elementos[getTopPosition()] = elemento;  
	return elemento;  
    }
    
    public String peek() {  
	if(isEmpty())  
            return null;  
	return elementos[getTopPosition()];  
    }
    
    public String pop() {
	String result = peek();  
	/*Se havia um elemento no topo da pilha...*/  
	if(result != null) {  
            elementos[getTopPosition()] = null;  
            size--;  
	}  
	return result;  
    }
    
    /** 
     * Método utilizado para limpar todo o conteúdo da pilha. 
     */  
    public void clear() {  
        for(int i = 0; i < size; i++){  
            elementos[i] = null;
        }
        size = 0;  
    }  
    /**
     * Método utilizado para se obter o tamanho (número de elementos) da pilha 
     * @return 
     */  
    public int getSize() {  
        return size;  
    }  
    /** 
     * Método utilizado para se obter a capacidade da pilha 
     * @return 
     */  
    public int getCapacity() {  
        return elementos.length;  
    }
    /**
     * Método utilizado para verificar se a pilha está vazia. Se for o caso, 
     * será retornado true, caso contrário, será retornado false.
     * @return 
     */
    public boolean isEmpty() {
        return size <= 0;
    }
    
    private int getTopPosition() {
        if (isEmpty())
            return 0;
        return size - 1;  
    }
    /** 
     * Este método serve para representar textualmente esta pilha 
     * @see java.lang.Object#toString() 
     */  
    public String toString() {  
        StringBuilder sb = new StringBuilder("[");  
	for(int i = 0; i < size; i++) {  
            sb.append(elementos[i]);  
            if(i < size - 1)  
                sb.append(" | ");  
	}  
	sb.append(">");  
	return sb.toString();  
    }  
}
