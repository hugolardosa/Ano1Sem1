import java.io.*;
import java.util.*;
public class ex64 {
	
	public static void main (String[] args) throws IOException{
		hist();
	}
	public static void hist() throws IOException{
		Scanner scf = new Scanner (System.in);
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
			for (int i = 0; i <= 20;i++){
				if (meme == i){num[i]++;}
			}
					
}
	System.out.println("");
	System.out.println("Histórico de notas");
	for (int a=0 ; a<100; a++){System.out.print("-");}
	System.out.println("");
	String impressao;
	for (int i=0 ; i<20; i++){System.out.printf("%2d | %s \n",i,printNtimes(num[i]));}
	}
	public static String printNtimes(int num){
		String s = "";
		for (int d = 1; d<=num;d++){
			s = s + "*";
		}
		return s;
	}
	
	public static int normalizacao(int num[]){
	int escala = 50;
		//calular o Maximo
			int max = 0;
			for (int i = 0 ; i<20; i++){
				if (num[i] > max){
					max = num[i];
				}
			}
	int s ;
	s =() ;
	}
	
}

		



