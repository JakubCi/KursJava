/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gra;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author 3ftg
 */
public class MyJFrame extends JFrame implements KeyListener {
    MyJPanel zmienna = new MyJPanel();
    public MyJFrame() throws HeadlessException{
        addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent arg0) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
         
        if(e.getKeyChar()=='w'){
            System.out.println("XD");
            zmienna.x=+10;
            
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        
    }
    
}
