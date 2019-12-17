/*
 *27
Pretende-se escrever um programa que dados três números inteiros introduzidos através do
teclado imprime no terminal o maior número.
 * 
 */

import java.util.Scanner;
public class Num27 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,y,z;
		System.out.println("Introduza o valor 1: ");
		x = ler.nextInt();
		System.out.println("Introduza o valor 2: ");
		y = ler.nextInt();
		System.out.println("Introduza o valor 3: ");
		z = ler.nextInt();
		if (x>y && x>z){
			System.out.printf("O valor %d é o maior", x);
		}
		if (y>x && y>z){
			System.out.printf("O valor %d é o maior", y);
		}
			
		else{
			System.out.printf("O valor %d é o maior", z);
		}
	
		
	}
}

