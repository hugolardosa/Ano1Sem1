/*
 * 313.java
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

import java.util.Scanner;
public class ex313 {
	
	public static void main (String[] args) {
	Scanner ler = new Scanner (System.in);
	int mes,ano,dia;
	String mesescrita="mes";
	System.out.println("Qual é o dia do més");
	mes = ler.nextInt();
	System.out.println("Qual é o ano");
	ano = ler.nextInt();
	System.out.println("Qual é o dia da em que começa a semana");
	dia = ler.nextInt();	
	switch(mes){
		case (1):
			mesescrita = "Janeiro";
			break;
		case (2):
			mesescrita = "Fevereio";
			break;
		case (3):
			mesescrita = "Março";
			break;
		case (4):
			mesescrita = "Abril";
			break;
		case (5):
			mesescrita = "Maio";
			break;
		case (6):
			mesescrita = "Junho";
			break;
		case (7):
			mesescrita = "Julho";
			break;
		case (8):
			mesescrita = "Agosto";
			break;
		case (9):
			mesescrita = "Setembro";
			break;
		case (10):
			mesescrita = "Outubro";
			break;
		case (11):
			mesescrita = "Novembro";
			break;
		case (12):
			mesescrita = "Dezembro";
			break;
		}
		switch(calendario){
			case(1):
System.out.println("              1 2 3 4|");
System.out.println("|5   6  7  8  9 10 11|");
System.out.println("|12 13 14 15 16 17 18|");
System.out.println("|19 20 21 22 23 24 25|");
System.out.println("|26 27 28 29         |");
			break;
		}
		
			
System.out.println("---------------------------------");		
System.out.println("     " + mesescrita +"  "+ano+"   ");
System.out.println("---------------------------------");
System.out.println("   Sun Mon Tue Wen Thu Fri Sat   ");
System.out.println("---------------------------------");

		
	}
	
	}


