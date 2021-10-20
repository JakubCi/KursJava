/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gra;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author 3ftg
 */
public class MyJPanel extends JPanel {
    int x=100;
    int y=100;

    public void paintComponent(Graphics g){
       
        super.paintComponent(g);
        
        g.fillOval(x,y,100,100);
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(700,700);
    }
    
}
