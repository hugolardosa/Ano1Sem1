
/*
 * ex91.java
 * 
 * Copyright 2018 Hmll <hugolardosa@ua.pt>
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

public class ex91 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String frase = new String();
		int contu = 0, contl = 0, contd = 0, contv = 0, contc = 0;
		char c;
		System.out.println("Analise de uma frase");
		System.out.println("Frase de entrada -->");
		frase = ler.nextLine(); // le a frase
		for (int i = 0; i < frase.length(); i++) { // calcula o numero de maiusculas minusculas e digitos na frase
			c = frase.charAt(i);
			if (Character.isUpperCase(c)) {

				contu++;
			}
			if (Character.isLowerCase(c)) {

				contl++;
			}
			if (Character.isDigit(c)) {

				contd++;
			}
			if (isVowel(c) == true) {
				contv++;
			}
			

		}
		System.out.println("Número de caracteres maiúsculos -> " + contu); // imprime os valores
		System.out.println("Número de caracteres minúsculos -> " + contl);
		System.out.println("Número de caracteres numéricos  -> " + contd);
		System.out.println("Número de caracteres vogais     -> " + contv);
		System.out.println("Número de caracteres consuantes -> " + ((contu + contl)-contv));
	}

	public static boolean isVowel(char c) { // Guarda de é verdade
		boolean teste = false;
		char c1 = Character.toLowerCase(c);
		if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' ) {
			teste = true;
		} 

		return teste;
	}
}
