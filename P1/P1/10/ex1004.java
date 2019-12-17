/*
 * ex1004.java
 * 

 * 
 * 
 */
import java.util.*;
import java.io.*;
public class ex1004 {
	static Scanner kb = new Scanner (System.in);
	public static void main (String[] args) throws IOException{
		Aluno [] inf = new Aluno [1];
		int op;
		while(true){
		System.out.println("");
		System.out.println("Menu:");
		System.out.println("1 - Ler Ficheiro");
		System.out.println("2 - Procurar Mecs");
		System.out.println("3 - Sair");
		op = kb.nextInt();
		switch(op){
		case(1):
			inf = readFile();
			break;
		case(2):
			lookName(inf);
			break;
		case(3):
			System.exit(0);
			break;
		}
	 }	 		
	}
	public static Aluno[] readFile() throws IOException {
		int meca;
		String [] nomes;
		String [] mecs;
		String firstname ="",secondname = "",linhamec= "", nomedoficheiro, linhanome="" ;
		File ficheiro;
		while(true){
			System.out.println("Nome do file ");
			nomedoficheiro = kb.next();
			ficheiro = new File (nomedoficheiro);
			if (ficheiro.isFile() || ficheiro.canRead()){break;}
			else {System.out.println("nome do ficheiro errado");} 
		}
		Scanner sf = new Scanner (ficheiro);
		while (sf.hasNext()){
			meca = sf.nextInt();
			firstname = sf.next();
			secondname = sf.next();
			linhamec += meca + " ";
			linhanome = firstname + " " + secondname + "/";
		}
		mecs = linhamec.split(" ");
		nomes = linhanome.split("/");
		Aluno[] inf = new Aluno [mecs.length];
		for (int i = 0; i < mecs.length; i++)
		{
			inf[i] = new Aluno ();
		}
		System.out.println(linhanome);
		for (int i = 0; i < nomes.length; i++)
		{
			System.out.println(nomes[i]);
		}
		
		for (int i = 0; i < mecs.length; i++)
		{
			inf[i].mec = Integer.parseInt(mecs[i]);
			//~ inf[i].nome = nomes[i];
		}
		sf.close();
		return inf;
		}
	public static void lookName(Aluno inf[]){
	 int rep;
		while(true){
		 int mec;	
		 int inicio = 0, fim = inf.length -1 , meio;
		 int haValor= -1;
		 System.out.println("Procura de alunos ");
		 System.out.print("Mec? -> ");
		 mec = kb.nextInt();
		 do{
		 meio = (fim + inicio) /2;
		 if (mec> inf[meio].mec){inicio=meio+1; }
		 if (mec < inf[meio].mec){fim=meio-1;}
		 else if (mec == inf[meio].mec){haValor = meio;}
		}while(haValor== -1 && inicio <=fim);
	 if (haValor == -1){System.out.println("Esse aluno não existe");}
	 if (haValor != -1){System.out.printf("O aluno com nome mec. %d, chama-se %s",inf[haValor].mec,inf[haValor].nome);}
	 System.out.println("Quer repetir (escreva 1), terminar (escreva 0)");
	 rep = kb.nextInt();
	 if (rep == 0){break;}
	}
}
}
class Aluno {
	int mec;
	String nome;
}
