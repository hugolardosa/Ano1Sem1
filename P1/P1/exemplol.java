/*
 * exemploluisa.java
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
import java.io.*;
import java.util.*;
public class exemploluisa {
	
	public static void main (String[] args) throws IOException {
		String linhavalor = "";
		File ficheiro = new File ("teste.txt");
		Scanner sf = new Scanner (ficheiro);
		while (sf.hasNextLine()){
			linhavalor += sf.next();
			linhavalor += " ";		
		}
		
		String [] valores;
		valores=linhavalor.split(" ");
		// não percisas de um contador pq esse é o valor do valores.length
		for (int i = 0; i < valores.length; i++)
		{
			System.out.println(valores[i]);
		}
		
		
	}
}

