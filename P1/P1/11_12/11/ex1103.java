/*
 * ex1103.class
 * 
 * Copyright 2019 Hmll <hmll@hmll-ThinkPad-T440s>
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
import java.io.*;
public class ex1103 {
	static Scanner kb =  new Scanner (System.in);
	public static void main (String[] args) {
		String [] frases = new String [1];
		frases = lerfrases();
		frases = trocaste(frases);
		for (int i = frases.lenght -1; i >= 0; i--)
		{
			System.out.println(frases)
		}
		
	}
	public static String[] lerfrases(){
		int cont=0;
		String frase = "";
		String [] frases_temp = new String [10];
		while(true){
			Sytem.out.println("A frase ", )
			frase = kb.nextLine();
			if(frase == "fim"){break;}
			if (cont == 11){break;}
			frases_temp[cont] = frase;
			cont++;
		}
		String [] frases = new String [cont];
		for (int i = 0; i < frases.length; i++)
		{
			frases[i] = frases_temp[i];
		}
		
	
	 return frases;
	}
    public static String[] trocaste (String s[]){
		String temp="";
		String frases [] = new String [s.length];
		for (int i = 0; i < s.length; i++)
		{
			for (int c = s[i].length(); c >= 0; c--)
			{
				temp += s[i].charAt(c);
			}
			frases[i] = temp;
			
		}
		
		return frases;
	}

}

