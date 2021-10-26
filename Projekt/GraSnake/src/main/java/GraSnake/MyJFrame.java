/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraSnake;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author ciero
 */
public class MyJFrame extends JFrame implements KeyListener {
    MyJPanel okno1 = new MyJPanel();
    public MyJFrame() throws HeadlessException{
        addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent arg0) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
         
        int key = e.getKeyCode();
        
        if ((key == KeyEvent.VK_LEFT) && (!okno1.prawo)) {
                okno1.lewo = true;
                okno1.gora = false;
                okno1.dol = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!okno1.lewo)) {
                okno1.prawo = true;
                okno1.gora = false;
                okno1.dol = false;
            }

            if ((key == KeyEvent.VK_UP) && (!okno1.dol)) {
                okno1.gora = true;
                okno1.prawo = false;
                okno1.lewo = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!okno1.gora)) {
                okno1.dol = true;
                okno1.prawo = false;
                okno1.lewo = false;
            }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        
    }
    
}