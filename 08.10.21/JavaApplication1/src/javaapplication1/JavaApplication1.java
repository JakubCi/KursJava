/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 3ftg
 */
public class JavaApplication1 {

    // Piotr Wrona piotrolot1@gmail.com tytuł: [OK-3F]
    // Java Podstawy - Horstmana (niebieska)
    public static void main(String[] args) {
                        //zmienne ca³kowitego: byte 1B, short 2B, int 4B, long 8B
            //zmienne zmiennoprzecinkowe: float 4B, double 8B
            //zmienna typu znakowego: char 1B
            //zmienna logiczna: boolean
            
            //deklaracja i inicjalizacja
            
            //deklaracja:
            //char znak;
            
            //inicjalizacja
            //char znak1='z';
           
            //operatory matematyczne: + = * / %
            //operatory arytmetyczne: += -= /= %= ++ --
            //operatory logiczne: || && !
            //operatory bitowe:<< >> & | ^ ~
            //operatory porównania: < > <= >= != ==
//            
//            int liczba1=54;
//            int liczba2=78;
//            if(liczba1<liczba2){
//                
//                System.out.printf("Liczba %d jest mniejsza ",liczba1);
//                
//            }
//            else{
//                System.out.println("");
//            }
//            int liczba=100;
//            while(liczba>=0){
//                System.out.println(liczba);
//                liczba=liczba-1;
//                
            //}
//            int N=6;
//            int j=0;
//            int n1=6;
//            while(j<n1){
//                 int i=0;
//                 while(i<N){
//                     if((i+j)<N){
//                    System.out.print("O ");
//                    i++;
//                    
//                     }
//                }
//                 System.out.println();
//                 j++;
//                
//            }
            //zad 2 jaka jest suma cyfr danej liczby
//            int liczba=7264;
//            
//            int i=0;
//            while(liczba>0){
//            i+=liczba%10;
//            liczba/=10;
//                System.out.println(i);
//            }
//            for(int i=-100;i<=100;i++){
//                System.out.println(i);
//            }
//          zad 3 zamien zad 1 i zad while na for

//zad 2:
//        int i=0;
//        int liczba=0;
//        for(liczba=234;liczba>0;liczba=liczba/=10)
//            i+=liczba%10;
//            System.out.println(i);
//            
//	}
//zad 1:
//int N=6;
//
//        for(int i=0;i<6;i++){
//            
//            for(int j=0;j<N;j++){
//                if((i+j)<N){
//                    System.out.print("O ");
//                    j++;
//                }
//            }
//                System.out.println();
//                 i++;
//            
//        }

//
//    char znak1='a';
//    
//    switch(znak1){
//        case'a':
//            System.out.println("to jest A");
//            break;
//        case 'z':
//            System.out.println("to jest z");
//        
//        
//    }
//int[] tab=new int[10];
//for(int i=0;i<tab.length;i++){
//    System.out.println(tab[i]+" ");
//}
    //lub
    
//            System.out.println(Arrays.toString(tab));
//     int[] tab={2,13,42,23,15,64,-6,1};
//     int suma=0;
//     for(int i=0;i<tab.length;i++){
//         suma+=tab[i];
//     }
//             System.out.println(suma);
   //ZAD DOMOWE 1         
// 	int[] tab={1,2,3,4,6,7,8,34,45,56,67};
// 		for(int i=tab.length-1;i>=0;i--){
// 			System.out.println(tab[i]+" ");
// 		}
   //ZAD DOMOWE 2
// int[] tab={1,2,3,50,6,7,87,34,45,56,67};
//         int max=tab[0];
// 		for(int i=1;i<tab.length;i++){
//              if(max<tab[i]){
// 		         max=tab[i];
//              }
// 		}
		        
		        
// 			System.out.println(max);
   //ZAD DOMOWE 3
// int liczba = 8;

//     	boolean Czy_pierwsza= true; 
//         int i=2;
//         while(i<Math.sqrt(liczba)){ 

//  		    if((liczba % i == 0)){

//  			    Czy_pierwsza = false; 
//  		}
//  		        i++;

//  		}
//  		if(Czy_pierwsza==true)
//  		    System.out.println("Liczba Jest liczba pierwsza");

//  			else 
//  			    System.out.println("Liczba Nie jest liczba pierwsza");
    //ZAD DOMOWE 4
// 		int liczby;
// 		int liczba = 3;
// 		for(int j=0;j<20;j++){
// 		boolean Czy_pierwsza= true; 
		
// 		for(int i=2; i<Math.sqrt(j); i++){ 
		    
// 		    if((j % i == 0)){
		        
		    
// 			    Czy_pierwsza = false; 
// 		}
		
// 		}
// 		if(Czy_pierwsza==true){
// 		    System.out.println(j);
		    
// 		}
		    
			    
// 		}


            //Tablica to zbiór elementów o tym samym typie, 
            //tablica ma rozmiar określony, jeden atrybut-length
//            int[] tab={4,5,2,1,5,8};
//            System.out.println(tab.length);
//            
//            for(int i=0;i<tab.length;i++){
//                System.out.println(tab[i]);
//                
//                
//                
//                
//                
//            }
//            System.out.println(Arrays.toString(tab));

            //zad 1 
            //skorzystaj z petli i wyswietl wszystkie elementy tablicy od tylu
            
//            int[] tablica={2,5,7,23,5,1,2,6,25};
//            
//            for(int i=(tablica.length-1);i>=0;i--)
//            {
//                System.out.println(tablica[i]);
//            }

//                int[][] tabW={
//                    {2,3,1,4,67,2},
//                    {6,2,5,2,1,5,8,9}
//                };
//                
//                for(int i=0;i<tabW.length;i++){
//                    
//                    for(int j=0;j<tabW[i].length;j++){
//                        
//                        System.out.print(tabW[i][j]+" ");
//                        
//                        
//                    }
//                    System.out.println();
//                    
//                }
//                


        //suma elementow w wierszu
        
//        int[][] tabW = {
//             {2, 3, -98, 8, 7,2},       
//             {1, 2, 3, 2, 5, 6}
//         };
//        int wynik1=0;
//        int wynik2=0;
//            for(int i=0;i<tabW[0].length;i++){
//                wynik1+=tabW[0][i];
//                
//            }
//            for(int i=0;i<tabW[1].length;i++)
//                wynik2+=tabW[1][i];
//        System.out.println(wynik1);
//        System.out.println(wynik2);

        //String-Typ złożony, ciągi znakowe
        //charAt, substring, indexOf, startsWidth, endsWidth, length, contains, equals
        //Java Doc String
        
//        String zmienna="siema";
//        System.out.println(zmienna);

//        int[] tablica=new int[10];
//    for(int j=0;j<tablica.length;j++){         
//            double random=Math.random()*11-50;
//            
//            tablica[j]+=(int)Math.round(random);
//            
//        
//    }
//        
//        System.out.println(Arrays.toString(tablica));
//        

//
//      int[][] tablicaWW=new int[4][4];
//      
//      for(int i=0;i<tablicaWW.length;i++){
//          
//          for(int j=0;j<tablicaWW[i].length;j++){
//              
//              double random=Math.random()*1;
//              
//              tablicaWW[i][j]+=(int)Math.round(random);
//              
//          }
//          
//          
//      }
//            int max=0;
//             int Jedynki=0;
//       for(int i=0;i<tablicaWW.length;i++){
//           System.out.println();
//          for(int j=0;j<tablicaWW[i].length;j++){
//              
//             
//              if(tablicaWW[i][j]==1){
//                  Jedynki++;
//                  if(Jedynki>max){
//                      max=Jedynki;
//                  }
//                  else
//                   Jedynki=0;
//              }
//              
//              
//               
//          }
//           
//           
//      }
//       
//       
//       System.out.println(max);
//
//wypiszElementy(3,8);
//        System.out.println();
//        wypiszElementy(3,10);
//
//zad6 Napisz metode ktora wyswietli silnie dla danej liczby
//


//
//
//        int[] tablica1={1,6,4,8,9,2,32,63,1};
//        int[] tablica2={4,41,53,32,8,4,31,5};
//        int[] wspolne=new int[10];
//        for(int z=0;z<tablica2.length;z++){
//        for(int i=0;i<tablica1.length;i++){
//            for(int j=0;j<tablica2.length;j++){
//                if(tablica1[i]==tablica2[j]){
//                     wspolne[j]=tablica1[i];
//                }
//                
//            }
//            
//            
//        }
//        }
//        System.out.println(Arrays.toString(wspolne));
 Scanner scan= new Scanner(System.in);
int wybor=scan.nextInt();
ZgadnijLiczbe(wybor);


    }
    
    

    public static void wypiszElementy(int start,int koniec){
    
        while(start<=koniec){
            System.out.println(start);
            start++;
            
            
        }
   
        
        
        
}
    public static void ZgadnijLiczbe(int wybor){
        
        double random=Math.random()*(100+100)-100;
        int random1=(int)Math.round(random);
        
        Scanner scan= new Scanner(System.in);
 
        while(wybor!=random1){
       wybor=scan.nextInt();
        System.out.println(random1);
            
        if(wybor>random1){
            System.out.println("Niżej");

        }
        else{
           
            System.out.println("Wyżej");
        }
        
        }
        System.out.println("Zgadles!");
    }
     public static void silnia(int n){
        int z=1;
        for(int i=1;i<(n+1);i++){
            z*=i;
        }
        
         System.out.println(z);
        
    }
    public static void ldoskonala(int z){
    int suma=0;
        for(int i=1;i<=(z/2);i++){
            if(z%i==0)
                suma=suma+i;
        }
        if(suma==z&&z>0)
            System.out.println("Liczba doskonala");
        else
            System.out.println("Liczba nie doskonala");
        
}
    
}
