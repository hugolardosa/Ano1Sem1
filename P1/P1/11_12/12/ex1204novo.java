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
public class ex1204novo {
	static Scanner kb = new Scanner(System.in);
	public static void main (String[] args) throws IOException {
		Aluno [] a = new Aluno [1];
	int op;
	while(true){
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
		while(op<1 && op>7){
	  System.out.print("Opção Invalida");
	  System.out.print("Opção ->  ");
	  op = kb.nextInt();
		}
	  
	  switch(op){
		case(1):
			a = f1();
		break;
		case(2):
			f2(a);
		 break;
		case(3):
			f3(a);
		 break;
		case(4):
			a = f4(a);
		 break;
		case(5):
			f5(a);
		 break;
		case(6):
			f6(a);
		 break;
	    case(7):
		 break;
	   }
 }
	}

	public static Aluno[] f1() throws IOException{
		
	 int mec;//mec e contador para dim do array
	 int ef, ee; //nota final e a de recurso
	 String nomedoficheiro; 
	 String linhanota = ""; //String que guarda o mec e as notas linha temp
	 String nmec = ""; //String que guarda o mec
	 String [] mecs;
	 File ficheiro;
	 while(true){
	  System.out.println("Nome do file ");
	  nomedoficheiro = kb.nextLine();
		ficheiro = new File (nomedoficheiro);
	  if (ficheiro.isFile() && ficheiro.canRead()){break;}
	  else {System.out.printf("nome do ficheiro errado, tente outo \n");} 
	  }
	 Scanner sf = new Scanner (ficheiro);
	 while (sf.hasNextLine()){
	   nmec += sf.nextInt();
	   nmec += " ";

	 }
	 
	 System.out.print(nmec);
	  mecs=nmec.split("\\W+");
	  String [] notas = new String [mecs.length];
      Aluno [] al = new Aluno [mecs.length];
      		for (int i = 0; i < al.length; i++)
	 {
		 al[i] = new Aluno();
	 }
	 for (int i = 0; i < mecs.length; i++)
	 {
		 al[i].mec = Integer.parseInt(mecs[i]);
	 }
	 
	 for (int i = 0; i < mecs.length; i++)
	 {
		mec = al[i].mec;
		while(true){
		 System.out.printf("O aluno com numero mec. %d teve que nota de exame final escreva 77 se faltou o animal ",mec);
		 ef = kb.nextInt();
		 if ((ef<=20 && ef>=0) || ef == 77){
			 al[i].f = ef;
			 notas[i] = mec + " " + ef;
			 break;}  
		 }
		 while(true){
		 System.out.printf("O aluno com numero mec. %d teve que nota de exame expecial se faltou escreva 77 se faltou o animal ",mec);
		 ee = kb.nextInt();
		 if ((ee<=20 && ee>=0) || ee == 77){
			  al[i].e = ee;
			  notas[i] = notas[i] + " " + ee;
			 break;}  
		 }
	 }		 
	//PrintWriter tem que ser depois se não ele apaga o ficheiro
		PrintWriter pf = new PrintWriter (ficheiro);
		  for (int i = 0; i < notas.length; i++)
		 {
			pf.println (notas[i]);
		 }
		 
		 
	sf.close();
	pf.close();
	return al;
	}

	public static void f2(Aluno a[]) throws IOException{
		for (int i = 0; i < 20; i++)
		{
			System.out.print("-");
		}
		System.out.println("");
		for (int i = 0; i < a.length; i++)
		{			
			System.out.printf("| %6d | %2d | %2d | \n",a[i].mec,a[i].f,a[i].e);
		}
		for (int i = 0; i < 20; i++)
		{
			System.out.print("-");
		}
	}
	public static void f3(Aluno a[]) throws IOException{
		int reprovados = 0, aprovados= 0;
		double melhor = 0;
		int i_temp= 0;
		double notaftmp , maxima = 0.,notaetmp ;
		//Calculo da média da nota
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
			if (a[i].f != 77 || a[i].e != 77){
				a[i].med = 0;
			}
		}
		//Melhor aluno
			for (int i = 0; i < a.length; i++)
			{
				if (a[i].med > melhor) {melhor = a[i].med;}
			}
			for (int i = 0; i < a.length; i++)
			{
				if (a[i].med == melhor){a[i].best = true;}
			}
		//calculo dos aprovados e dos reprovados
		for (int i = 0; i < a.length; i++)
		{
			if (a[i].med >0 && a[i].med <9.5){reprovados++;}
			else if (a[i].med >=9.5 && a[i].med <=20){aprovados++;}
		}
		
		
		//Impressora de média
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Aluno " +  a[i].mec );
			System.out.println("  Media=  " +  a[i].med );
			
		}
		//Impressora dos melhores
			for (int i = 0; i < a.length; i++)
			{
				if (a[i].best = true){
					System.out.printf("O Aluno %d é o melhor" +  a[i].mec);
					System.out.println("  Media=  " +  a[i].med);
					System.out.println("  E.F=  " +  a[i].f);
					System.out.println("  E.E=  " +  a[i].e);
					System.out.println("");
				}
			}
		//Impressora dos reprovados e aprovados
		System.out.printf("Aprovados %d \n reprovados %d \n", aprovados,reprovados);
		
		
		
	}
	
	public static Aluno[] f4(Aluno a[]) throws IOException{
	int mec, ef, ee;
	String nomedoficheiro;
	String [] notas = new String [a.length];
	while(true){
	  System.out.println("Nome do file ");
	  nomedoficheiro = kb.next();
	  File ficheiro = new File (nomedoficheiro);
	  if (ficheiro.isFile() || ficheiro.canRead()){break;}
	  }
	File ficheiro = new File (nomedoficheiro);
	while(true){
		System.out.println("Qual é o aluno a alterar? -> ");
		mec = kb.nextInt();
		for (int i = 0; i < a.length; i++)
		{
			if (mec != a[i].mec){
			System.out.println("Aluno não existe");
			System.out.println("Qual é o aluno a alterar? -> ");
			mec = kb.nextInt();
			}
			if (mec == a[i].mec){
				while(true){
					System.out.printf("O aluno com numero mec. %d teve que nota de exame final escreva 77 se faltou o animal ",mec);
					ef = kb.nextInt();
					if ((ef<=20 && ef>=0) || ef == 77){
						a[i].f = ef;
						break;}  
				}
				while(true){
					System.out.printf("O aluno com numero mec. %d teve que nota de exame expecial se faltou escreva 77 se faltou o animal ",mec);
					ee = kb.nextInt();
					if ((ee<=20 && ee>=0) || ee == 77){
						a[i].e = ee;
						break;}  
					}
			}
			
		}
		System.out.print("Sair (1), Continuar (0)");
		int sair = kb.nextInt();
		if (sair == 1){break;}		
		
	}		
	for (int i = 0; i < a.length; i++)
	{
		notas [i] = "" + a[i].mec + " " + a[i].f + " " + a[i].e ; 
	}
	 
	//PrintWriter tem que ser depois se não ele apaga o ficheiro
		PrintWriter pf = new PrintWriter (ficheiro);
		 
		  for (int i = 0; i < notas.length; i++)
		 {
			pf.println (notas[i]);
		 }
	pf.close();	 
	return a;	
	}
	public static void f5(Aluno a[]) throws IOException{
		int [] notas = new int [20];
		System.out.println("Histograma de uma disciplina");
		for (int i = 0; i < a.length; i++)
		{
			for (int not = 0; not <= 20; i++)
			{
				if (not == a[i].med){notas[i]++;}
			}
			
		}
		for (int i = 0; i <= notas.length; i++)
		{
			for (int imp = 0; imp < notas[i]; i++)
			{
				System.out.println("*");
			}
			System.out.print(i + " ");
		}
		
	
	
	
	}
	public static void f6(Aluno a[]) throws IOException{
		
		
		
		
	}	
	}
class Aluno {
int mec;
int f, e, med;
boolean best;

}	


