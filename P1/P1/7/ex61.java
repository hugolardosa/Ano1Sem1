/*
 * Exercício 6.1
 * 
 * Copyright 2018 Hmll <hugolardosa@ua.pt>
 * 
 * Escreva um programa que leia uma sequência de N números inteiros, sendo o valor N pedido
ao utilizador antes do início da introdução dos números. O programa deve depois imprimir
esses números pela ordem inversa com que foram inseridos.

 * 
 * 
 */

import java.util.Scanner; //matame
public class ex61 { // tipo deus
	
	public static void main (String[] args) {// e
	Scanner ler = new Scanner (System.in);//ewewew
	int n;
	System.out.print("Quantos valores vão ser introduzidos? ");
	n = ler.nextInt();
	int[] x = new int [n];
	for (int i=0;i<x.length;i++){
		System.out.printf("Valor para a posição %d", i);
		x[i] = ler.nextInt();
	}
	for (int i=x.length - 1;i>=0;i--){
	System.out.print(x[i]);
//kill me work please
	}
	}
}

