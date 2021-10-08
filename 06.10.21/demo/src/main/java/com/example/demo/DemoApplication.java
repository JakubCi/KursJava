package com.example.demo;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    //Piotr Wrona    piotrolot@gmail.com    tytul: [OK-3F]
    
    
	public static void main(String[] args) {
	
            SpringApplication.run(DemoApplication.class, args);
            
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
   //ZAD DOMOWE 3(Zrobione For'em)
// 		int liczba = 3;
		
// 		boolean Czy_pierwsza= true; 
		
// 		for(int i=2; i<Math.sqrt(liczba); i++){ 
		    
// 		    if((liczba % i == 0)){
		        
		    
// 			    Czy_pierwsza = false; 
// 		}
		
// 		}
// 		if(Czy_pierwsza==true)
// 		    System.out.println("Liczba Jest liczba pierwsza");
		    
// 			else 
// 			    System.out.println("Liczba Nie jest liczba pierwsza");
		
    }
}

