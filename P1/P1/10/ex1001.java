
/*
 * ex63.java
 * 
 * Copyright 2018 Hmll <hmll@hmll-ThinkPad-T440s>
	percisa de correções
 * 
 * 
 */

import java.util.*;
public class ex1001 {
			static int dimensao;
			static int a[];
			static Scanner num = new Scanner(System.in);
	public static void main(String[] args) {

		menu();
	}

	public static void menu() {
		while(true){
		
		int op;
        System.out.println("");
		System.out.println("Análise de uma sequência de números inteiros");
		System.out.println("1 - Ler a sequência");
		System.out.println("2 - Escrever a sequência");
		System.out.println("3 - Calcular o máximo da sequência");
		System.out.println("4 - Calcular o mínimo da sequência");
		System.out.println("5 - Calcular a média da sequência");
		System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println("10 - Ordenar a sequência por ordem crescente utilizando ordenação sequencial");
		System.out.println("11 - Ordenar a sequência por ordem decrescente utilizando ordenação por flutuação");
		System.out.println("12 - Pesquisa de valor na sequência");
		System.out.println("13 - Terminar o programa");
		System.out.print("Opção -> ");
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
		System.out.println("");
		menu();
	}

	public static void max() {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("o valor maximo é " + max);
		System.out.println("");
		menu();
	}

	public static void min() {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("o valor minimo é " + min);
		System.out.println("");
		menu();
	}

	public static void med() {
		int soma = 0;
		for (int i = 0; i < a.length; i++) {
			soma += a[i];
		}
		int media = (soma / a.length);
		System.out.printf("A media é %d ",media);
		System.out.println("");
		menu();
	}

	public static void par(){
	boolean verf = true;
	for(int i = 1; i < a.length; i++){
	 if (a[i]%2 != 0){verf = false;}
	}
	
	if (verf == true){System.out.println("Os numeros são todos pares");}
	if (verf == false){System.out.println("Os numeros não são todos pares");}	
	System.out.println("");
	menu();
	}
	public static void ordp(){
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		int n = -1, i , j, tmp;
		
		for (int c = 0; c < a.length; c++)
		{
			if(a[c] < max){n = c;}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 2 ; j < n + 1; j++)
			{
				if (a[i] > a [j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
				
				
			}
			
		}
		
	}
	public static void ordf(){
			int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		
	}
	public static void search(){
		int [] pos = new int [a.length] 
		System.out.print("Qual é o valor de busca ->  ");
		int find = num.nextInt();
		int n = -1;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == find)
			{
				pos[i] = i;
			}
		}
		
		if (n == -1){System.out.printf("O Valor %d não existe na lista \n", find);}
		else {System.out.printf("O Valor %d existe na lista e encontra-se na posição %d \n", find, n+1);}
		System.out.println("");
	}
	

}
