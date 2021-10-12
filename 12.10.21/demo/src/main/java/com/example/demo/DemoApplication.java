package com.example.demo;

import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    //Piotr Wrona    piotrolot@gmail.com    tytul: [OK-3F]
    
        public static int polekwadratu(int a){
            
            
            int b=a*a;
            
           return b;
            
        }
        public static double poleProstokata(int a,int b){
            double suma=a*b;
           return suma;
            
            
        }
       //metoda ktora tworzy  tablice wielowymiarowa o losowych rozmiarach z zakresu 0-20
        
       public static int[][]  Tablice(){
           
           double randomowa=Math.random()*(20-0)+0;
           int randomowaINT=(int)randomowa;
           
           int[][] tablica=new int[randomowaINT][randomowaINT];
           
           
           return tablica;
           
       }
	public static void main(String[] args) {

           Samochod samochod = new Samochod("Porshe","Panamera",2018,370,15.6);
           
           samochod.setModel("Macann");
            System.out.println();
            
    }
        
    
        
}
