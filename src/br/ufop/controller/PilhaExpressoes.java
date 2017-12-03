package br.ufop.controller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.util.LinkedList;
//import java.util.List;

/**
 *
 * @author UFOP
 */
public class PilhaExpressoes{
    private int size;
    private String[] elementos;
    //private final List<Tag> tag = new LinkedList<>();
    //PilhaTag pilha = new PilhaTag();
   
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the elementos
     */
    public String[] getElementos() {
        return elementos;
    }

    /**
     * @param elementos the elementos to set
     */
    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }
}
