import java.io.*;
import java.util.*;
public class ex74 {
	static 	Scanner scf = new Scanner (System.in);
	public static void main (String[] args) throws IOException{
		hist();
	}
	public static void hist() throws IOException{
	
	System.out.println("introduza nome do ficheiro");
	String nomedoficheiro = scf.nextLine();
		File fin = new File (nomedoficheiro);
		PrintWriter pwd = new PrintWriter (fin);
		System.out.println("introduza o numero de notas");
		 int d = scf.nextInt();
		 int notas[] = new int [d];
		 int c =0;
		 int[] num = new int [20];
		 int meme;
		System.out.println("Introduza as notas");
		for (int a=0 ; a<d; a++){
			notas[a] = scf.nextInt();
			}

		for (int a=0 ; a<d; a++){
			meme = notas[a]; 
			for (int i = 0; i<=20;i++){
				if (meme == i){num[i]++;}
			}
					
}
	pwd.println("Histórico de notas");
	for (int a=0 ; a<100; a++){pwd.print("-");}
	pwd.println("");
	String linha = "";
	for (int i=0 ; i<20; i++){
		//pwd.printf("%2d | %s \n",i,printNtimes(num[i]));
		linha = String.format("%2d | %s",i,printNtimes(num[i]));
		pwd.println(linha);
		}
	pwd.close();
}
	public static String printNtimes(int num){
		String s = "";
		for (int d = 1; d<=num;d++){
			s = s + "*";
		}
		return s;
	}
	//~ public static String fl_v() throws IOException{
		//~ String ret = "";
		//~ while(true){
		//~ System.out.println("Introduza o nome do ficheiro ");
		//~ String nomedoficheiro = scf.nextLine();
		//~ File fin = new File (nomedoficheiro); 
		//~ if (fin.isFile() && fin.canRead()){ret = nomedoficheiro; break;}
		//~ }
		//~ return ret;
	//~ }
}

		



