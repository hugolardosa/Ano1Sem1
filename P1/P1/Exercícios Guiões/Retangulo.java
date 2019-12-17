//Retângulo com funcões

//Exercício 5.5 da ficha 5

import java.util.Scanner;

public class Retangulo {

    public static void main (String[] args) {
		
		int c;
		int l;
		
		Scanner ler = new Scanner (System.in);
		System.out.print("Comprimento: ");
		c = ler.nextInt();
		System.out.print("Largura: ");
		l = ler.nextInt();
		
		printNtimes(c, l);
	}
		
		
   public static void printNtimes (int c, int l) {
   
         for (int a = 0; a < c; a++)	 {
		 if(a==0 | a == c-1){
			for (int i = 0; i < l; i++) {
		      System.out.print("*"); 
				}
			System.out.println();
			}
		else {
			for (int i = 0; i < l; i++)	 {
			 if(i==0 | i==l-1) 
				 System.out.print("*");
			  else 
				 System.out.print(" ");
		 } 
		 System.out.println();	
	}
}
 
}
}
        
      
		
		
