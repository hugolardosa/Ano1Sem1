/*
 * ex1204.java
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
public class ex1204 {
	static Scanner kb = new Scanner(System.in);
	public static void main (String[] args) throws IOException {
		Aluno [] a = new Aluno [3];
		for (int i = 0; i < a.length; i++)
	 {
		 a[i] = new Aluno();
	 }
		 while(true){menu(a);}
	}
	public static void menu(Aluno a[])throws IOException{
	int op;
	  System.out.println("");
	  System.out.println("Serviços Académicos - Gestão de uma pauta:");
	  System.out.println("1 - Ler ficheiro com números mec. e pedir informação de notas");
	  System.out.println("2 - Imprimir no terminal a informação da disciplina");
	  System.out.println("3 - Calcular estatísticas das notas finais");
	  System.out.println("4 - Alterar as notas de um aluno");
	  System.out.println("5 - Imprimir um histograma de notas");
	  System.out.println("6 - Gravar num ficheiro a informação da disciplina (ordenada)");
	  System.out.println("7- Terminar o programa");
	  System.out.print("Opção ->  ");
	  op = kb.nextInt();
	  switch(op){
		case(1):
		printFile(a);
		break;
		case(2):
		 terminal(a);
		 break;
		case(3):
		conta(a);
		 break;
		case(4):
		changefile(a);
		 break;
		case(5):
		 break;
		case(6):
		 break;
	    case(7):
		 break;
		default:
		menu(a);
     }
	}
   
	public static Aluno[] printFile(Aluno a[]) throws IOException{
	 int mec,cont=0;//mec e contador para dim do array
	 int ef, ee; //nota final e a de recurso
	 String nomedoficheiro; 
	 String linhanota = ""; //String que guarda o mec e as notas
	 String [] notas_temp = new String [10000];  //string temporario
	 while(true){
	  System.out.println("Nome do file ");
	  nomedoficheiro = kb.next();
	  File ficheiro = new File (nomedoficheiro);
	  if (ficheiro.isFile() || ficheiro.canRead()){break;}
	  }
	 Aluno[] atemp= new Aluno [10000];
	 for (int i = 0; i < atemp.length; i++)
	 {
		 atemp[i] = new Aluno();
	 }
	 File ficheiro = new File (nomedoficheiro);
	 Scanner sf = new Scanner (ficheiro);
	 while (sf.hasNextLine()){ //erro Luisa
		 mec = sf.nextInt();
		 while(true){
		 System.out.printf("O aluno com numero mec. %d teve que nota de exame final escreva 77 se faltou o animal ",mec);
		 ef = kb.nextDouble();
		 if ((ef<=20 && ef>=0) || ef == 77){
			 if (ef == 77){ef = (int)77;}
			 linhanota = mec + " " + ef;
			 break;}  
		 }
		 
		 while(true){
		 System.out.printf("O aluno com numero mec. %d teve que nota de exame expecial se faltou escreva 77 se faltou o animal ",mec);
		 ee = kb.nextDouble();
		 if ((ee<=20 && ee>=0) || ee == 77){
			  if (ee == 77){ee = (int)77;}
			  linhanota = linhanota + " " + ee;
			 break;}  
		 }
		 notas_temp[cont] = linhanota;
		 atemp[cont].e = ee;
		 atemp[cont].f = ef; 
		 atemp[cont].mec = mec; 
		 cont++;
		 }
		 
		 
		 String [] notas = new String [cont];
		 System.arraycopy(notas_temp,0,notas,0,cont);
		 System.arraycopy(atemp,0,a,0,cont);
		 
		 
		//PrintWriter tem que ser depois se não ele apaga o ficheiro
		PrintWriter pf = new PrintWriter (ficheiro);
		
		
			for (int i = 0; i < notas.length; i++)
		 {
			pf.println (notas_temp [i]);
		 }
		 
		 
	sf.close();
	pf.close();
	return a;
	}
	
	public static void terminal(Aluno a[]) throws IOException{
		String efil ="", eexa = "";
		for (int i = 0; i < 22; i++)
		{
			System.out.print("-");
		}
		System.out.println("");
		for (int i = 0; i < a.length; i++)
		{
		
			if (a[i].f == 77.0){efil = "77";}
			else if (a[i].f != 77.0){efil ="" + a[i].f;}
			if (a[i].e == 77.0){eexa = "77";}
			else if (a[i].e != 77.0){eexa = "" + a[i].e;}
			
		System.out.printf("| %6d | %s | %s | \n",a[i].mec,efil,eexa);
		}
		for (int i = 0; i < 22; i++)
		{
			System.out.print("-");
		}
	}
	public static void conta(Aluno a[]) throws IOException{
		int reprovados, aprovados;
		double notaftmp , maxima = 0.,notaetmp ;
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i].f != 77 || a[i].e != 77){
				a[i].med = ((a[i].f + a[i].f) / 2);
			}
			if (a[i].f == 77){
				a[i].med = a[i].e;
		
			}
			if (a[i].e == 77){
				a[i].med = a[i].f;
			}

			System.out.printf("A media do aluno " +  a[i].mec + " é " + a[i].med);
		}
		
	}
	
	public static Aluno[] changefile (Aluno a[]) throws IOException{
	 int mec;
	 int mecp;
	 double ef, ee; 
	 String nomedoficheiro;
	 String linhanota ="" ;
	 while(true){
	  System.out.println("Nome do file ");
	  nomedoficheiro = kb.next();
	  File ficheiro = new File (nomedoficheiro);
	  if (ficheiro.isFile() || ficheiro.canRead()){break;}
	  }
	  File ficheiro = new File (nomedoficheiro);
	  Scanner sf = new Scanner (ficheiro);
	  System.out.print("Qual é o numero mecanográfico a alterar ? --> ");
	  mecp = kb.nextInt();
	  while (sf.hasNextLine()){
		mec = sf.nextInt();
		if (mec == mecp){
			while(true){
		 System.out.printf("O aluno com numero mec. %d teve que nota de exame final escreva 77 se faltou o animal ",mec);
		 ef = kb.nextDouble();
		 if ((ef<=20 && ef>=0) || ef == 77){
			 linhanota = mec + " " + ef;
			 break;}  
		 }
		 
		 while(true){
		 System.out.printf("O aluno com numero mec. %d teve que nota de exame expecial se faltou escreva 77 se faltou o animal ",mec);
		 ee = kb.nextDouble();
		 if ((ee<=20 && ee>=0) || ee == 77){
			  linhanota = linhanota + " " + ee;
			 break;}  
		 }
		}
     PrintWriter pf = new PrintWriter (ficheiro);
		else{System.out.println("O aluno não existe");break;}
	}
 return a;	
}	
}
class Aluno {
int mec;
int f, e, med;
}	


