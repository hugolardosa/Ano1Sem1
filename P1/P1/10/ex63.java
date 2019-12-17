
/*
 * ex63.java
 * 
 * Copyright 2018 Hmll <hmll@hmll-ThinkPad-T440s>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;
public class ex1001 {
			static int dimensao;
			static int a[];

	public static void main(String[] args) {

		menu();
	}

	public static void menu() {
		while(true){
		Scanner num = new Scanner(System.in);
		int op;
        System.out.println("");
		System.out.println("An�lise de uma sequ�ncia de n�meros inteiros");
		System.out.println("1 - Ler a sequ�ncia");
		System.out.println("2 - Escrever a sequ�ncia");
		System.out.println("3 - Calcular o m�ximo da sequ�ncia");
		System.out.println("4 - Calcular o m�nimo da sequ�ncia");
		System.out.println("5 - Calcular a m�dia da sequ�ncia");
		System.out.println("6 - Detetar se � uma sequ�ncia s� constitu�da por n�meros pares");
		System.out.println("10 - Terminar o programa");
		System.out.print("Op��o -> ");
		op = num.nextInt();
		switch (op) {
		case (1):
			readArray();
			break;
		case (2):
			writeArray();
			break;
		case (3):
			max();
			break;
		case (4):
			min();
			break;
		case (5):
			med();
			break;
		case (6):
			par();
			break;
		case (10):
			ordp();
			break;
		case (11):
			ordf();
			break;
        case (12):
			search();
			break;

		case (13):
			break;
		default:
			menu();
		}
	}
	}

	public static void readArray() {
		Scanner ler = new Scanner(System.in);
		dimensao = 0;
		int atemp[] = new int[50];
		for (; dimensao < 50; dimensao++) {
			atemp[dimensao] = ler.nextInt();
			if (atemp[dimensao] == 0) {
				break;
			}
		}
		a= new int[dimensao];
		for (int b = 0; b < dimensao; b++) {
			a[b] = atemp[b];
		}
	}

	public static void writeArray() {
		System.out.println(Arrays.toString(a));
		menu();
	}

	public static void max() {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("o valor maximo � " + max);
		menu();
	}

	public static void min() {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("o valor minimo � " + min);
		menu();
	}

	public static void med() {
		int soma = 0;
		for (int i = 0; i < a.length; i++) {
			soma += a[i];
		}
		int media = (soma / a.length);
		System.out.printf("A media � %d ",media);
		menu();
	}

	public static void par(){
	boolean pa = false;
	for(int i = 1; i < a.length; i++){
	 if (a[i]%2 == 0){pa = true;}
	 else{pa = false;}
	}
	if (pa == true){System.out.println("Os numeros s�o pares");}
	menu();
	}
	public static void par(){
	boolean pa = false;
	for(int i = 1; i < a.length; i++){
	 if (a[i]%2 == 0){pa = true;}
	 else{pa = false;}
	}
	if (pa == true){System.out.println("Os numeros s�o pares");}
	menu();
	}
	public static void par(){
	boolean pa = false;
	for(int i = 1; i < a.length; i++){
	 if (a[i]%2 == 0){pa = true;}
	 else{pa = false;}
	}
	if (pa == true){System.out.println("Os numeros s�o pares");}
	menu();
	}

}
