/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjektJacob;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 3ftg
 */
class Okno extends JPanel{
    
    public void paintComponent(Graphics g){
       
        super.paintComponent(g);
        
        
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(900,900);
    }
    
    JTextArea etykieta;
    public Okno(){
        setLayout(null);
        etykieta=new JTextArea("Wype³nij Formularz: ");
        etykieta.setBounds(600,150,300,600);
        add(etykieta);
        
        JLabel form1=new JLabel("Podaj swoje imie: ");
        form1.setBounds(0,150,150,20);
        add(form1);
        
        JTextField jtf=new JTextField();
        jtf.setBounds(50,200,80,20);
        add(jtf);
        
        JLabel form=new JLabel("Podaj swoje Nazwisko: ");
        form.setBounds(0,250,150,20);
        add(form);
        
        JTextField jtf1=new JTextField();
        jtf1.setBounds(50,300,80,20);
        add(jtf1);
        
        JLabel form2=new JLabel("Podaj ile masz lat: ");
        form2.setBounds(0,350,150,20);
        add(form2);
        
        JSpinner sp=new JSpinner();
        sp.setBounds(50,400,80,20);
        add(sp);
        
        JLabel form3=new JLabel("Podaj swoja historie wyszukiwania: ");
        form3.setBounds(0,450,200,20);
        add(form3);
        
        JTextField jtf2=new JTextField();
        jtf2.setBounds(50,500,80,20);
        add(jtf2);
        
        JLabel form4=new JLabel("Podaj Plec: ");
        form4.setBounds(0,550,150,20);
        add(form4);
        
        ButtonGroup grupa = new ButtonGroup();
        
        JRadioButton RB1=new JRadioButton();
        RB1.setBounds(50,600,20,20);
        add(RB1);
        
        JLabel form6=new JLabel("Mê¿czyzna");
        form6.setBounds(80,600,150,20);
        add(form6);
        
        JRadioButton RB2=new JRadioButton();
        RB2.setBounds(50,650,20,20);
        add(RB2);
        
        JLabel form7=new JLabel("Kobieta");
        form7.setBounds(80,650,150,20);
        add(form7);
        
        grupa.add(RB1);
        grupa.add(RB2);
        
        JLabel form8=new JLabel("Podaj Województwo");
        form8.setBounds(0,700,150,20);
        add(form8);
        
        String[] petStrings = { "Wielkopolskie","Pomorskie", "Mazowieckie", "Kujawsko-Pomorskie", "Œl¹skie", "dolnoœl¹skie","Lubelskie","Lubuskie","£ódzkie","Ma³opolskie","Opolskie","Podlaskie","Podkarpackie","Œwiêtokrzyskie","Warmiñsko-Mazurskie","Zachodniopomorskie" };
        
        JComboBox combob=new JComboBox(petStrings);
        combob.setBounds(50,750,150,20);
        add(combob);
        
        

        combob.setSelectedIndex(15);

        
        JLabel form5=new JLabel("zabezpieczenie captcha: ");
        form5.setBounds(0,800,300,20);
        add(form5);
        
        JCheckBox CB=new JCheckBox();
        CB.setBounds(50,850,20,20);
        add(CB);
        
        
        
        
        
        JButton klawisz=new JButton("Wyœlij!");
        klawisz.setBounds(500,750,150,50);
        klawisz.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               String woj = combob.getSelectedItem().toString();
               String Wybor;
               String historia=jtf2.getText();
               String nazwisko=jtf1.getText();
               String imie=jtf.getText();
               if(imie.equals("")){
                   imie="Brak Danych";
               }
               if(nazwisko.equals("")){
                   nazwisko="Brak Danych";
               }
               if(RB1.isSelected()==true){
                   Wybor="Mê¿czyzna";
               }
               else if(RB1.isSelected()==false&&RB2.isSelected()==false){
                   Wybor="Inne";
               }
               else{
                   Wybor="Kobieta";
               }
               
               
               
               if(jtf.getText()==""){
                   
               }
               else{
                jtf.setText(" ");
                etykieta.setText("imie - "+imie+"\n"+"nazwisko - "+nazwisko+"\n"+"Wiek - "+sp.getValue()+"\nHistoria Wyszukiwania - "+historia+"\nP³eæ - "+Wybor+"\nWojewództwo - "+woj);
               }
                
           }
        });
        add(klawisz);
    }
    
    
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Okno okno = new Okno();
        JFrame window=new JFrame();
        window.add(okno);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        
        
    }
    
}
