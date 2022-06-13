/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.factorymethod;

/**
 *
 * @author Felipe
 */
public class SuperNintendoCanvas implements Canvas {

    @Override
    public void render() {
        MainCanvas superNintendo = new MainCanvas();
        superNintendo.setSize(256, 192);
        superNintendo.setVisible(true);
    }

    @Override
    public Integer defineNumberColors() {
        return 256;
    }
}
