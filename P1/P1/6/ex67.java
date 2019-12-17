/*
 * ex67.java
 * 
 * Copyright 2018 user <user@DESKTOP-CG8FLAA>
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
import java.io.*;
import java.util.*;
public class ex67 {
	
	static Scanner ler = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Qual é o numero de valores introduzidos");
	int dim = ler.nextInt();
	System.out.print("Qual é o minimo");
	int inicio = ler.nextInt();
	System.out.print("Qual é o maximo");
	int fim = ler.nextInt();
	int x[] = new int [dim];
	for (int i = 0; i<dim; i++){
		for 
		
	}
	}
	public static int[] random(int inicio, int fim, int x[],int dim){
	
	 for (int i = 0; i<dim ; i++){
	 x[i] = (int)((Math.random() * (fim - inicio)) + inicio);
	 } 
	return x;
	}
	public static int nvezes (int x[], int dim){
		int n = 0 ;
		int cont = 1;
		for(int i = 0; i<dim; i++){
			x[i] = n;
			if (n == n){
				cont++;
			}
		}
	return cont;
	}
} 

