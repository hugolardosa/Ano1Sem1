/*
 * tipoA.java
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
public class tipoA {
	static Scanner ler = new Scanner (System.in);
	public static void main (String[] args) {
		
		System.out.println("Qual a modalidade a frequentar (1 para Iniciação e 2 para Aperfeiçoamento).");
		int modl = ler.nextInt() ; //Variavel da modalidade
		System.out.println("O número de horas semanais (de 1 a 10) de prática");
			int horas;
			do{
				horas = ler.nextInt();
			}while(!(horas < 1 && horas >10));
		System.out.println("Se o utente tem familiares a frequentar o clube (0 para indicar que não tem)");
		int fam = ler.nextInt();
		System.out.println("Se é a primeira vez que se inscreve neste clube (Sim/Não) e o número de mensalidades que pretende pagar.");
		String primeiro = ler.nextLine();
		int mensalidades = ler.nextInt();
		
		
		//impressão 
		System.out.println("Nova Inscrição para o Clube de Natação");
	    System.out.println(pvez(primeiro));
	    
		}
		public static String pvez(String primeiro){
			String resposta = "";
			if (primeiro == "Sim"){resposta = "Primeira Vez";}
			if (primeiro == "Não"){resposta = "Já se inscrveu";}
			return resposta;
		}
		public static double (int modl, int horas, int fam, int mensalidades){
			
		}
	}


