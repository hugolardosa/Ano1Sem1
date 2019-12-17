/*
 2.6
 * Pretende-se escrever um programa que dado um número inteiro introduzido através do
teclado escreve no terminal uma mensagem indicando se o número é par ou ímpar.
 */

import java.util.Scanner;
public class Num26 {
	
	public static void main (String[] args) {
	Scanner ler = new Scanner (System.in);
	int x;
	System.out.println("Introduza valores de X: ");
	x = ler.nextInt();
	if (x%2 == 0){
	System.out.printf("O valor %d é par", x);
	}
	else{
	System.out.printf("O valor "+ x + " é impar");
	}
	
		
	
		
	}
}

