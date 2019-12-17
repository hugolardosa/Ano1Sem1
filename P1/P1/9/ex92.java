
/*
 * ex92.java
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

import java.util.Scanner;

public class ex92 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String frase = new String();
		//System.out.println(acronimo("A Maria qualquer Coisa"));
		//System.out.println(acronimo("A MariS qualquer Coisa"));
		do{
			System.out.println("Introduza uma frase");
			frase = ler.nextLine();
			System.out.println(acronimo(frase));
		}while(!frase.equals(""));	
	}

	public static String acronimo(String frase) {
		char c;
		String acronim = "";
		for (int i = 0; i < frase.length(); i++) {
			c = frase.charAt(i);
			if (Character.isUpperCase(c)) {
				acronim = acronim + c;
			}
		
		}
		return acronim;
	}

}
