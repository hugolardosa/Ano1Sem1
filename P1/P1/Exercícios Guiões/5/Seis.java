/*
 * Seis.java
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
public class Seis {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		calctab(100);
		calctab(3);
		calctab(15);
		calctab(99);
	}

public static void calctab(int x){
	if (x>0 && x<100){
		tab(x);
	}
	else{
		System.out.println("Introduzio um valor errado");
	}
}

public static void tab(int x){
	System.out.println("-----------------");
	System.out.printf("|tabuada do  %3d|",x);
	System.out.println();
	System.out.println("-----------------");
	for (int i=1;i<=10;i++){
		int tabu;
		tabu=x*i;
		System.out.printf("|%3d X %3d = %3d|",x,i,tabu);
		System.out.println();
	}
	System.out.println("-----------------");
}



}

