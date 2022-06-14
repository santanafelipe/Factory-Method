/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.factorymethod;

import java.awt.Color;

/**
 *
 * @author Felipe
 */
public class GameBoyCanvas implements Canvas {

    @Override
    public void render() {
        MainCanvas gameBoy = new MainCanvas(160, 144);
        gameBoy.setVisible(true);
    }

    @Override
    public Integer defineNumberColors() {
        return 4;
    }    
}
