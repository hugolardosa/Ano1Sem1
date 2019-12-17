/*
 * ex71.java
 * 
 * Copyright 2018 Hmll <hugolardosa@ua.pt>
 * 
 * Exercício 7.1
Escreva um programa que mostre o conteúdo de um ficheiro de texto no terminal. O nome do
ficheiro deve ser pedido ao utilizador e introduzido através do teclado. Valide o nome do
ficheiro: tem de ser um ficheiro normal (método .isFile()), com permissão de leitura (método
.canRead()). Se isso não se verificar, deve indicar a razão e voltar a pedir o nome.
 * 
 * 
 */

import java.io.*;
import java.util.Scanner;
public class ex71 {
	
	public static void main (String[] args) throws IOException{
	Scanner ler = new Scanner (System.in);
	
		System.out.print("Introduza o nome do ficheiro a ser mostrado no terminal"); //lê o nome do ficheiro
		String nome =  ler.nextLine(); //lê o nome do ficheiro
		boolean eficheiro;
		boolean consread;
		File fin = new File(nome);
		do{
		Scanner fich = new Scanner (fin);
			while(fich.hasNextLine()){
			System.out.println(fich.nextLine());
			}
		}while ((fin.isFile() && fin.canRead()));
		//validação do ficheiro
		if (fin.isFile()){eficheiro = true;}
		else {eficheiro = false;}
		if (fin.canRead()){consread = true;}
		else {consread = false;}
		if (eficheiro == false){System.out.println("O ficheiro não é valido");}
		if (consRead == false){System.out.println("Não é possivel ler o ficheirpo");}
		
		}
		
		
	
  }
  



