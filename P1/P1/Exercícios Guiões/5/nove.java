/*
 * nove.java
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
public class nove {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int x;
		System.out.print("Indi	que po avlor : ");
		x = ler.nextInt();
		for (int i=1; i<=x;i++){
			if (isprime(i)==true){System.out.println(i);}
			}
	}
	public static boolean isprime(int x){
		boolean prime;
				if (x>0 && x%1==0 && x%x==0 && x%2!=0 || x==2){
					prime=true;
				}
	 else
	 {
		prime=false;
	 }
 
 if (x<0){prime=false;}
 return prime;
 }   
}


