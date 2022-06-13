/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.factorymethod;

/**
 *
 * @author Felipe
 */
public abstract class Scene {
    
    private Integer colors; 

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Scene() {
        this.colors = 1;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
   
    public Integer getColors() {
        return colors;
    }

    public void setColors(Integer colors) {
        this.colors = colors;
    }
    //</editor-fold>
    
    public abstract Canvas createCanvas();
    
    public void render(){
        Canvas artCanvas = createCanvas();
        artCanvas.defineNumberColors();
        artCanvas.render();
    }   
}
