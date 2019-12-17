/*
 * ex6.2.java
 * 
 * Copyright 2018 Hmll <hugolardosa@ua.pt>
 * 
		Escreva um programa que leia uma sequência de números inteiros positivos e conte o número
	de vezes que um determinado número, pedido ao utilizador, aparece na sequência. A leitura
	deve terminar após a introdução de 100 números ou com o aparecimento de um número
	negativo.

 * 
 * 
 */

import java.util.Scanner;
public class ex62 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.printf("Intruduza o valor de contagem");
		int n = ler.nextInt();
		int[] x = new int [100];
		int cont=1; 
		for (int i = 0;i<100; i++) {
			do{
			System.out.printf("Intruduza o valor de posição %d", i);
			x[i] = ler.nextInt();
			if (x[i] == n){cont = cont + 1 ;}
			
		}while(x[i]>0);
		
		 System.out.printf("Escreveu %d %d vezes",n,cont);
		 break;
				
			
			
		}
		
	}
}

