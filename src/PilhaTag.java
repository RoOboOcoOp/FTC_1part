/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufop.controller;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author UFOP
 */


public class PilhaTag extends Tag{
    private int size;
    private String[] elementos;
    private List<Tag> tag = new LinkedList<Tag>();
    
     public void insere(Tag tag) {
        this.tag.add(tag);
     }
  public Tag remove() {
    return this.tag.remove(this.tag.size() - 1);
  }

  public boolean vazia() {
    return this.tag.isEmpty();
  }
  public int getsize(){
      return size;
  }
  /*public String toString() {  
		StringBuilder sb = new StringBuilder("[");  
		for(int i = 0; i < size; i++) {  
			sb.append(elements[i]);  
			if(i < size - 1)  
			  sb.append(" | ");  
		}  
		sb.append(">");  
		return sb.toString();  
            }
    */
}
