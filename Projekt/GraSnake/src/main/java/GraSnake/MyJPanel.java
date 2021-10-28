/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraSnake;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MyJPanel extends JPanel implements ActionListener {

    
    //WSZYSTKIE ZMIENNE 
    private final int Szerokosc = 200;
    private final int Wysokosc = 200;
    private final int Wielkosc_Weza = 10;
    private final int cala_dlugosc = Szerokosc*Wysokosc;
    private final int rando = ((Szerokosc+Wysokosc)/10)-20;
    private final int opoznienie = 80;

    private final int x[] = new int[cala_dlugosc];
    private final int y[] = new int[cala_dlugosc];

    private int dlugosc_weza;
    private int owocX;
    private int owocY;

    private boolean lewo = false;
    private boolean prawo = true;
    private boolean gora = false;
    private boolean dol = false;
    private boolean gra = true;

    private Timer czas;
    private Image Tulow;
    private Image owoc;
    private Image glowa;

    private Graphics2D g2d;
//    private Graphics2D tulow;
//    private Graphics2D glowa;
//    private Graphics2D owoc;
    public MyJPanel() {
        
        MyJPanel1();
    }
     @Override
     
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        Rysowanie(g);
        
        for(int i=10;i<Szerokosc;i+=10){
            g2d.drawLine(i, 0, i, Wysokosc);
        }
        for(int i=10;i<Wysokosc;i+=10){
            g2d.drawLine(0, i, Szerokosc, i);
        }
//        glowa.fillOval(100, 100, Wielkosc_Weza, Wielkosc_Weza);
        
    }
    //     OKNO
    private void MyJPanel1() {

        addKeyListener(new TAdapter());
        setBackground(Color.white);
        setFocusable(true);

        
        
        setPreferredSize(new Dimension(Szerokosc, Wysokosc));
        Zdjecia();
        gra1();
    }
//      ZDJECIA UZYWANE W GRZE
    
    private void Zdjecia() {

        ImageIcon iid = new ImageIcon("src/resources/dot.png");
        Tulow = iid.getImage();

        ImageIcon iia = new ImageIcon("src/resources/apple.png");
        owoc = iia.getImage();

        ImageIcon iih = new ImageIcon("src/resources/head.png");
        glowa = iih.getImage();
    }
    
//        W TRAKCIE GRY
    private void gra1() {

        dlugosc_weza = 3;

        for (int z = 0; z < dlugosc_weza; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }
        
        szukanie_Owocow();

        czas = new Timer(opoznienie, this);
        czas.start();
    }

   
//       RYSOWANIE WEZA WEZA
    private void Rysowanie(Graphics g) {
        
        if (gra) {

            g.drawImage(owoc, owocX, owocY, this);

            for (int z = 0; z < dlugosc_weza; z++) {
                if (z == 0) {
                    g.drawImage(glowa, x[z], y[z], this);
                } else {
                    g.drawImage(Tulow, x[z], y[z], this);
                }
            }

            Toolkit.getDefaultToolkit().sync();

        } else {

            Przegrana(g);
        }        
    }

    private void szukanie_Owocow() {
//         LOSOWANIE OWOCOW
        int rand = (int) (Math.random() * rando);
        owocX = ((rand * Wielkosc_Weza));

        rand = (int) (Math.random() * rando);
        owocY = ((rand * Wielkosc_Weza));
    }
//     DODAWANIE OWOCOW DO DLUGOSCI WEZA
    private void Owoce() {

        if ((x[0] == owocX) && (y[0] == owocY)) {

            dlugosc_weza++;
            szukanie_Owocow();
        }
    }
//      PORUSZANIE SIE WEZA
    private void Poruszanie() {

        for (int z = dlugosc_weza; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (lewo) {
            x[0] -= Wielkosc_Weza;
        }

        if (prawo) {
            x[0] += Wielkosc_Weza;
        }

        if (gora) {
            y[0] -= Wielkosc_Weza;
        }

        if (dol) {
            y[0] += Wielkosc_Weza;
        }
    }
//          KOLIZJE ZE SCIANA I WEZEM
    private void Kolizje() {

        for (int z = dlugosc_weza; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                gra = false;
            }
        }

        if (y[0] >= Wysokosc) {
            gra = false;
        }

        if (y[0] < 0) {
            gra = false;
        }

        if (x[0] >= Szerokosc) {
            gra = false;
        }

        if (x[0] < 0) {
            gra = false;
        }
        
        if (!gra) {
            czas.stop();
        }
    }
    // PRZEGRANA W GRZE
    
    private void Przegrana(Graphics g) {
//        for(int i=10;i<300;i+=10){
//            g2d.dispose();
//        }
//        for(int i=10;i<300;i+=10){
//            g.drawLine(0, i, 300, i);
//        }
        
        String msg = "Przegrales!";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.black);
        g.setFont(small);
        g.drawString(msg, (Szerokosc - metr.stringWidth(msg)) / 2, Wysokosc / 2);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (gra) {

            Owoce();
            Kolizje();
            Poruszanie();
        }

        repaint();
    }
//        TU SA PRZYCISKI
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!prawo)) {
                lewo = true;
                gora = false;
                dol = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!lewo)) {
                prawo = true;
                gora = false;
                dol = false;
            }

            if ((key == KeyEvent.VK_UP) && (!dol)) {
                gora = true;
                prawo = false;
                lewo = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!gora)) {
                dol = true;
                prawo = false;
                lewo = false;
            }
        }
    }
}