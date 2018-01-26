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
public class StackNode extends NativeClass {
    private final String8 elemento = new String8(this, 999);

    private final Container<Container<StackNode>> next = new Container<Container<StackNode>>(this, 1){};

    public String8 getElemento() {
        return elemento;
    }

    public Container<StackNode> getNext() {
        return next.get();
    }

    public Container<StackNode> setNext(Container<StackNode> newNext) {
        return next.set(newNext);
    }
}
