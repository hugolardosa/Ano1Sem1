/*
 * ex1002.java
Escreva um programa que leia do teclado uma chave de Totoloto e que a imprima na forma de
matriz (ver abaixo). O Totoloto é uma forma de lotaria em que a chave premiada é obtida pela
escolha de 6 bolas de um conjunto de 49 bolas numeradas de 1 a 49.
Implemente uma função que gere aleatoriamente (use a função Math.random()) a chave
(gerarChave), devolvendo um array de 6 inteiros com os valores gerados. Note que os
números devem ser validados para evitar números repetidos.
Sugestões: Faça uma função de pesquisa (pertenceChave) que indique se um número
pertence à chave já introduzida.
Crie uma função para escrita da aposta (mostraChave), que deve obedecer ao formato
seguinte (para o exemplo de uma chave 2, 12, 17, 27, 30, 43).
Sugestão: Para decidir se tem de escrever X, recorra à função pertenceChave que criou
anteriormente.
 */
import java.util.*;
import java.io.*;
public class ex1002 {
	
	public static void main (String[] args) {
		int [] chavewin =  new int [6];
		chavewin = geraChave(chavewin);
		mostraChave (chavewin);
		imprimetab(chavewin);
			
		}
		

	public static int [] geraChave(int chave[]){
	int a=1, a_temp=1;
	
		for (int i=0; i<chave.length;i++){     
			do{
				a = (int)((Math.random() * (49-1)) + 1);
			}while(a == 0);
			if ( rep(chave, a,i) == false ){chave[i] = a;}
			if ( rep(chave, a,i) == true ){i--;}
		}
	return chave;
	}
	
	public static boolean rep(int chave[], int a, int i){
		boolean rep = false;
		for (int b = 0; b < i ; b++)
		{
			if (chave[b] ==  a) {rep = true;}
		}
		return rep;
	}
	
	public static boolean pertenceChave(int chave[], int a){
		boolean rep = false;
		for (int i = 0; i < chave.length; i++)
		{
			if (chave[i] ==  a) {rep = true;}
		}
		return rep;
	}
	
	public static void mostraChave(int chave[]){
		System.out.print("Chave: ");
		String key=" ";
		for (int i=0; i<chave.length;i++){
		  key += "" + chave[i] + ", "; 
		}
		for (int i=0; i<key.length() - 2;i++){
		  System.out.print(key.charAt(i)); 
		}
		
	
	}
	public static void imprimetab(int chave[]){
	System.out.println("");
	System.out.println("");
	for (int i = 1; i <= 7; i++)
		{
		if (pertenceChave(chave, i) == false ){
			System.out.printf(" %2d ", i);
		 }
		 			
		 if (pertenceChave(chave, i) == true ){
			System.out.printf("  %c ", 'x');
		 }
		}
	System.out.println("");
	for (int i = 8; i <= 14; i++)
		{
		if (pertenceChave(chave, i) == false ){
			System.out.printf(" %2d ", i);
		 }
		 			
		 if (pertenceChave(chave, i) == true ){
			System.out.printf("  %c ", 'x');
		 }
		}
				System.out.println("");
				for (int i = 15; i <= 21; i++)
		{
		if (pertenceChave(chave, i) == false ){
			System.out.printf(" %2d ", i);
		 }
		 			
		 if (pertenceChave(chave, i) == true ){
			System.out.printf("  %c ", 'x');
		 }
		}
	System.out.println("");
	for (int i = 22; i <= 28; i++)
		{
		if (pertenceChave(chave, i) == false ){
			System.out.printf(" %2d ", i);
		 }
		 			
		 if (pertenceChave(chave, i) == true ){
			System.out.printf("  %c ", 'x');
		 }
		}
	System.out.println("");
	for (int i = 29; i <= 35; i++)
		{
		if (pertenceChave(chave, i) == false ){
			System.out.printf(" %2d ", i);
		 }
		 			
		 if (pertenceChave(chave, i) == true ){
			System.out.printf("  %c ", 'x');
		 }
		}
	System.out.println("");
	for (int i = 36; i <= 42; i++)
		{
		if (pertenceChave(chave, i) == false ){
			System.out.printf(" %2d ", i);
		 }
		 			
		 if (pertenceChave(chave, i) == true ){
			System.out.printf("  %c ", 'x');
		 }
		}
	System.out.println("");
	for (int i = 43; i <= 49; i++)
		{
		if (pertenceChave(chave, i) == false ){
			System.out.printf(" %2d ", i);
		 }
		 			
		 if (pertenceChave(chave, i) == true ){
			System.out.printf("  %c ", 'x');
		 }
		}
	}
}

