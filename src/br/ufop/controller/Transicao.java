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
public class Transicao {
    private Estado origem, destino;
    private char transicao;

    public Estado getOrigem() {
        return origem;
    }

    public void setOrigem(Estado origem) {
        this.origem = origem;
    }

    public Estado getDestino() {
        return destino;
    }

    public void setDestino(Estado destino) {
        this.destino = destino;
    }

    public char getToken() {
        return transicao;
    }

    public void setToken(char transicao) {
        this.transicao = transicao;
    }
}