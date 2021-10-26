/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraSnake;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ciero
 */
public class MyJPanel extends JPanel {
    public int Wysokosc=500;
    public int Szerokosc=600;
    
    boolean gora=true;
    boolean dol=false;
    boolean prawo=false;
   boolean lewo=false;
    
    int zebrane;

    public void paintComponent(Graphics g){
       
        super.paintComponent(g);
        
      
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(Szerokosc,Wysokosc);
    }
    
}