import java.util.Scanner;
import java.io.*;
public class EF2018 {
	public static void main(String[] args) throws IOException{
		Pais[] paises;
		paises = lerFichHum("PaisesHumid.txt");
		procurarListar(paises," "); // espaço lista tudo
		procurarListar(paises,"56"); // lista paises onde apareca "56"
		int [] mins = humMin(paises);
		for(int i=0; i<mins.length; i++)
		 System.out.printf("Minimo = %5d %3d %s%n", paises[mins[i]].dia,
		 paises[mins[i]].humidade, paises[mins[i]].nome);
		 int[] freq = freqHum(paises);
		 //~ printFreq(freq);
		 System.out.println(diaPaisExiste(paises,paises.length,24,"Marrocos"));
		//~ paises=removerRepetidos(paises);
		//~ bubbleSort(paises);
		 gravarPais(paises, "PaisesHumidOrd.txt");
		
	}
	public static Pais[] lerFichHum(String nomeF) throws IOException{
		File fin = new File (nomeF);
		Scanner sf = new Scanner (fin);
		int dim;
		int cont = 0;//contador de linhas
		dim = sf.nextInt();//le a primeira linha que fornece a Dimensão do Array
		Pais[] data = new Pais[dim];
		for (int i = 0; i < data.length; i++)
		{
			data[i] = new Pais();
		}
		while(sf.hasNextLine()){
		  data[cont].dia = sf.nextInt();
		  data[cont].humidade = sf.nextInt();
		  data[cont].nome = sf.nextLine();
		  cont++;
		}
		sf.close();
		return data;
	}
	public static void procurarListar(Pais [] p, String frase){
		int c;
		System.out.printf("Exemplo da procura de '%s' \n", frase);
		String [] linhas = new String [p.length];
		for (int i = 0; i < p.length; i++)
		{
			linhas[i] = "" + p[i].dia + " " + p[i].humidade + " " + p[i].nome;
		}
		for (int i = 0; i < p.length; i++)
		{
			c = (linhas[i]).indexOf(frase);
			if (c != -1){System.out.println(linhas[i]);}
		}
		System.out.println();
	}
	static int[] humMin(Pais [] p){
		int min= 100,dim = 0;
		for (int i = 0; i < p.length; i++)
		{
			if (p[i].humidade < min){min = p[i].humidade;}
		}
		for (int i = 0; i < p.length; i++)
		{
			if(min == p[i].humidade){dim++;}
		}
		int count=0;
		int[] indices = new int[dim];
		for (int i = 0; i < indices.length; i++)
		{
			if(min == p[i].humidade){indices[count++] = i;}
		}
		
	  return indices;
	}
	public static void gravarPais (Pais [] p, String nome) throws IOException{
		File fin = new File (nome);
		PrintWriter pf = new PrintWriter (fin);
		String tmp = "";
		pf.println(p.length);
		for (int i = 0; i < p.length; i++)
		{
			
			pf.printf("%4d %2d %s \r\n",p[i].dia,p[i].humidade,p[i].nome);
		}
	pf.close();	
	}
	public static int[] freqHum(Pais [] p){
		int [] freq = new int [91];
		for (int i = 10; i <= 100; i++)
		{
			for (int j = 0; j < p.length; i++)
			{
				if(p[j].humidade == i){freq[i-10]++;}
			}
		}
		return freq;	
	}
	public static boolean diaPaisExiste(Pais[] p, int comp, int dia, String pais) {
		boolean existe = false;
		for (int i = 0; i < p.length; i++)
		{
			if (dia == p[i].dia && pais.compareTo(p[i].nome) == 0){existe = true;}
		}
		return existe ;
	}
		public static Pais[] removerRepetidos(Pais [] p) {
		
		}
	}

class Pais {
 int dia;
 int humidade;
 String nome;
}

