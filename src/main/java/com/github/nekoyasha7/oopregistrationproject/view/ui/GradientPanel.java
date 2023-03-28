package com.github.nekoyasha7.oopregistrationproject.view.ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author GiovaneNeves
 */
public class GradientPanel extends javax.swing.JPanel{
    
    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//
    
    private Color startColor;
    private Color endColor;
    
    //----------------------------------------------{ GETTERS AND SETTERS }----------------------------------------------//

    public Color getStartColor() {
        return startColor;
    }

    public void setStartColor(Color startColor) {
        this.startColor = startColor;
    }

    public Color getEndColor() {
        return endColor;
    }

    public void setEndColor(Color endColor) {
        this.endColor = endColor;
    }
    
    //----------------------------------------------{ CONSTRUCTOR }----------------------------------------------//

    /**
    *
    * @param startColor of the gradient
    * @param endColor of the gradient
    */
    public GradientPanel(Color startColor, Color endColor) {
      
        this.setStartColor(startColor);
        this.setEndColor(endColor);
        
    }
    
    //----------------------------------------------{ METHODS }----------------------------------------------//
    
    public void paintComponents(Graphics graphics){
        
        super.paintComponent(graphics);
        
        Graphics2D graphics2d = (Graphics2D) graphics;
        
        int width = this.getWidth();
        int height = this.getHeight();
        
        GradientPaint gradient = new GradientPaint(0, 0, this.getStartColor(), 0, height, this.getEndColor());
        
        graphics2d.setPaint(gradient);
        graphics2d.fillRect(0, 0 , width, height);
        
    }
    
    
}
