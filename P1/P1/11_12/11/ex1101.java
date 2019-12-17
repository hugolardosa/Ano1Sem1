/*
 * ex1101.java
 * 
 * Copyright 2019 Hmll <hmll@hmll-ThinkPad-T440s>
 * 

 */
import java.util.*;
import java.io.*;
public class ex1101 {
	static Scanner kb = new Scanner (System.in);
	public static void main (String[] args) {
		int l,c,l2,c2;
		int sm;
		while (true){
		System.out.println("Quas são é as dimensões da matriz 1 ");
		System.out.print("linhas -> ");
		l = kb.nextInt();
		System.out.print("colunas -> ");	
		c = kb.nextInt();
		System.out.println("Quas são é as dimensões da matriz 2 ");
		System.out.print("linhas -> ");
		l2 = kb.nextInt();
		System.out.print("colunas -> ");
		c2 = kb.nextInt();
		if (c == l2){break;}
		if (c != l2){System.out.println("As matrizes não são multiplicaveis, inrtoduza os valores outra vez");}
		}
		int [] [] m1 = new int [l][c];
		int [] [] m2 = new int [l2][c2];
		int [] [] produto = new int [l] [c2];
		System.out.println("Quas são é os valores da matriz 1 ");
		for (int i = 0; i < l; i++)
		{
			for (int a = 0; a < c; a++)
			{
				System.out.printf("Na linha %d ,a coluna %d tem valor? -> ",i,a);
				 m1 [i] [a] = kb.nextInt(); 
			}
			
		}
		System.out.println("Quas são é os valores da matriz 2 ");
		for (int i = 0; i < l2; i++)
		{
			for (int a = 0; a < c2; a++)
			{
				System.out.printf("Na linha %d ,a coluna %d tem valor? -> ",i,a);
				 m2 [i] [a] = kb.nextInt(); 
			}
			
		}
		System.out.println("Multiplicando a matriz 1 pela matriz 2 ... ");
		for (int i=0; i<l; i++) {
			for (int j=0; j<c2; j++) {
			  sm = 0;
				for (int k=0; k<c2; k++) {
					sm = sm + (m1[i][k] * m2[k][j]);
				}
				produto[i][j] = sm;
			}
		}
		System.out.println("matriz 1 ");
		impM(m1);
		System.out.println("matriz 2 ");
		impM(m2);
		System.out.println("p");
		impM(produto);
		
	
	}
	public static void impM(int matriz [] []){
		 for (int l = 0; l < matriz.length; l++)  {  
			for (int c = 0; c < matriz[l].length; c++)     { 
				System.out.print(matriz[l][c] + " "); //imprime caracter a caracter
			}  
			System.out.println(" "); //muda de linha
		}
		
	}
	
}

