/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author 3ftg
 */
public class Samochod {
    
    public String marka;                        //Atrybuty naszej klasy samochod
    public String model;
    public int rokProdukcji;
    public int mocSilnika;
    public double srednieSpalanie;
    
    public Samochod(){                          //konstruktor domyslny(pusty)
        
        
        
    }
    public Samochod(String marka){              //konstruktor z jednym atrybutem
        
        this.marka=marka;
    }
    public Samochod(String marka,String model, int rokProdukcji, int mocSilnika,double srednieSpalanie){
        this.marka=marka;
        this.model=model;
        this.mocSilnika=mocSilnika;
        this.rokProdukcji=rokProdukcji;
        this.srednieSpalanie=srednieSpalanie;
        
        
        
    }
    public String getMarka(){
        return marka;
        
    }
    public void setMarka(String marka){
        this.marka=marka;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getRokProdukcji(){
        return rokProdukcji;
        
    }
    public void setRokProdukcji(int rokProdukcji){
        
        this.rokProdukcji=rokProdukcji;
    }
    public int getMocSilnika(){
        return mocSilnika;
        
    }
    public void setMocSilnika(int mocSilnika){
        if(mocSilnika<0){
            System.out.println("Moc Silnika nie moze byc mniejsza niz 0");
        }
        this.mocSilnika=mocSilnika;
    }
    public double getSrednieSpalanie(){
        return srednieSpalanie;
    }
    public void setSrednieSpalanie(double srednieSpalanie){
        this.srednieSpalanie=srednieSpalanie;
    }
    @Override           //metoda nadpisana
    public String toString(){
        return "Marka: "+marka+", model: "+model+", Rok produkcji: "+rokProdukcji+", moc silnika: "+mocSilnika+", srednie spalanie: "+srednieSpalanie;
    }
}
