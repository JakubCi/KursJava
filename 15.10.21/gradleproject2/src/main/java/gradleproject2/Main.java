/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradleproject2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 3ftg
 */
class MyJPanel extends JPanel{
    
    int x = 50;
    int y = 50;
    int dx = 5;
    int dy = 5;
    int dim = 100;
    
    int r = 0;
    int gg = 0;
    int b = 0;
    double randomowa1=Math.random()*(600-100)+100;
        int Kwx=(int)randomowa1;
        double randomowa2=Math.random()*(600-100)+100;
        int Kwy=(int)randomowa2;
    
        
    @Override
    protected void paintComponent(Graphics g){
       
        super.paintComponent(g);
        Color color = new Color(r,gg,b);
        g.fillRect(Kwx,Kwy,100,100);
        g.setColor(color);
        g.fillOval(x,y,dim,dim);
       
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(700,700);
    }
    public void zmianaKoloru(){
        
        r = (int)(Math.random()*255);
        gg = (int)(Math.random()*255);
        b = (int)(Math.random()*255);
        repaint();
    }
    public void animacja(){
        int srodek1=(Kwx-50);
        int srodek2=(Kwy-50);
        while(true){
            
            try{
                if(x + dx <=0 || x + dx >= getWidth()-100){
                    dx *= -1;
                    zmianaKoloru();
                }
                x+=dx;
                
                if(y + dy <=0 || y + dy >= getHeight()-100){
                    dy *= -1;
                    zmianaKoloru();
                }
                y+=dy;
                
                if(x+dx>=srodek1-50||x+dx>=(srodek1+srodek2)+50)
                {
                    dx*=-1;
                    zmianaKoloru();
                }
                x+=dx;
                if(y+dy>=srodek2-50||y+dy>=srodek2+50){
                    dy*=-1;
                    zmianaKoloru();
                    
                }
                y+=dy;
                
                repaint();
                Thread.sleep(25);
            }catch(Exception e){}
        }
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyJPanel okno = new MyJPanel();
        
        JFrame window = new JFrame("Animacja pi³ki");
        window.add(okno);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
        
        okno.animacja();
    }
}
