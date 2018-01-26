/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufop.controller;
import java.awt.Container;

/**
 *
 * @author 
 */

public class Express {
    private final String nome;

    private final Container<Container<Estado>> ini = new Container<Container<Estado>>(this, 1){};

    private final Container<Container<Estado>> fi = new Container<Container<Estado>>(this, 1){};

    public Express() {
        this.nome = new String(this, 999);
        
    }
    public String getNome() {
        return nome;
    }

    public Container<Estado> getIni() {
        return ini.get();
    }

    public Container<Estado> setIni(Container<Estado> newIni) {
        return ini.set(newIni);
    }

    public Container<Estado> getFi() {
        return fi.get();
    }

    public Container<Estado> setFi(Container<Estado> newFi) {
        return fi.set(newFi);
    }
}
