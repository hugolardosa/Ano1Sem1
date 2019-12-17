/*
 * Num29.java
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
public class Num29 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double temp, far,cel;//temperatura
		int y;//valor 0 ou 1
		System.out.println("Introduza a temperatura:");
		temp = ler.nextInt();
		System.out.println("Indique o tipo de temperatura (0 se Celsios) ou (1 se Farenhiet): ");
		y = ler.nextInt();
		switch (y)
		{
		 case 0: 
			far=1.8*temp+32;
			System.out.printf("%f ºCelsius é euqivalente a %f ºFarenhiet" ,temp,far);
			break;
		case 1:
			cel=(((-32)+temp)/1.8);
			System.out.printf("%f ºCelsius é euqivalente a %f ºFarenhiet" ,cel,temp);
			break;
		}
		
	}
}
