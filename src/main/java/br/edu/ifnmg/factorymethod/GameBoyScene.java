/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.factorymethod;

/**
 *
 * @author Felipe
 */
public class GameBoyScene extends Scene {

    @Override
    public Canvas createCanvas() {
        return new GameBoyCanvas();
    }
    
}
