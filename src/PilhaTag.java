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
    private List<Tag> tags = new LinkedList<Tag>();
     public void insere(Tag tag) {
        this.tags.add(tag);
     }

  public Tag remove() {
    return this.tags.remove(this.tags.size() - 1);
  }

  public boolean vazia() {
    return this.tags.size() == 0;
  }
}
