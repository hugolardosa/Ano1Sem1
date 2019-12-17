/*
 * aula.java
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

public class aula {
	
	public static void main (String[] args) throws IOException{
	File ficheiro = new File ("out.txt");
	Scanner fich = new Scanner (ficheiro);
	int [] mec = new int[tamanho(ficheiro)];
	String [] nome = new String[tamanho(ficheiro)];
	double [] nota1 = new double [tamanho(ficheiro)];
	double [] nota2 = new double [tamanho(ficheiro)];
	String mecano = "";
	while (fich.hasNextLine()){
		String linha = fich.nextLine();
		for (int i=0; i<linha.length(); i++){
			if (!(linha.charAt(i) == ' ')){
				mecano = mecano + linha.charAt(i);
				}
			int mecanografico = Integer.parseInt(mecano);
		}
	}
	}
	public static int tamanho(File ficheiro) throws IOException{
	int i = 0;
	Scanner fich = new Scanner (ficheiro);
	while (fich.hasNextLine()){
		i++;
		}
	return i;
	}
	public static double media(Aluno a){
		double media;
		media = ((a.nota1 + a.nota2)/2);
		return media;
	}
}
class Aluno{
	int mec;
	double nota1,nota2;
	String nome,aplido;
	
}

