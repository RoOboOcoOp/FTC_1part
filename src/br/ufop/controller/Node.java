/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufop.controller;

/**
 *
 * @author UFOP
 */
public class Node extends NativeClass {
    private final String8 tag = new String8(this, 999);

    private final String8 nome = new String8(this, 999);

    private final Container<Container<Node>> prox = new Container<Container<Node>>(this, 1){};

    private final Container<Container<Node>> ant = new Container<Container<Node>>(this, 1){};

    public String8 getTag() {
        return tag;
    }

    public String8 getNome() {
        return nome;
    }

    public Container<Node> getProx() {
        return prox.get();
    }

    public Container<Node> setProx(Container<Node> newProx) {
        return prox.set(newProx);
    }

    public Container<Node> getAnt() {
        return ant.get();
    }

    public Container<Node> setAnt(Container<Node> newAnt) {
        return ant.set(newAnt);
    }
}
