/*
Pretende-se construir um programa que processe uma sequência de números reais que
poderiam corresponder a valores de pH fornecidos pelo analisador de uma piscina. Os valores
de pH estão armazenados num ficheiro de texto cujo nome deve ser pedido ao utilizador. O
valor do pH varia entre 0 e 14, pelo que a existência de um valor no ficheiro que não
pertencente ao intervalo deve ser ignorado. O programa deve começar por contar o número
de amostras válidas gravadas no ficheiro de modo a criar um array com a dimensão correta.
As funções que o programa deverá disponibilizar são as seguintes:
 */
import java.util.*;
import java.io.*;
public class ex1003 {
	static Scanner kb = new Scanner (System.in); 
	public static void main (String[] args) throws IOException{
		int op;
		int ph [] = new int [1];
		double media = 0;
		//Imprime função
		while (true){
		System.out.println("");
		System.out.println("Analisador de pH");
		System.out.println("1 - Ler valores de pH de um ficheiro");
		System.out.println("2 - Escrever valores de pH no terminal");
		System.out.println("3 - Calcular o pH médio das amostras");
		System.out.println("4 - Calcular o número de amostras ácidas (< 7) e básicas (> 7)");
		System.out.println("5 - Calcular o número de amostras de pH superior à média");
		System.out.println("6 - Escrever valores de pH no terminal ordenados de modo crescente");
		System.out.println("7 - Terminar o programa");
		System.out.print("Opção ->  ");
		 op = kb.nextInt();
		 if (op>7 || op<1){
		  System.out.print("opção  invalida");
		  System.out.print("Opção ->  ");
		  op = kb.nextInt();
		 }
		 switch(op){
			 case(1):
			    ph = f1();
			    break;
			  case(2):
			    f2(ph);
			    break;
			  case(3):
			   media = f3(ph);
			    break;
			  case(4):
			    f4(ph);
			    break;
			  case(5):
			    f5(ph,media);
			    break;
			  case(6):
			    f6(ph);
			    break;
			  case(7):
			  System.exit(1);
			    break;			    
		 }
		}
	}
	public static int[] f1() throws IOException{
		String nomef="";
		String [] valores;
		File fin;
		String linhaph = "";
		int cont = 0;
		while(true){
		System.out.print("Qual é o nome do ficheiro -> ");
		nomef = kb.nextLine();
		fin = new File (nomef);
		if (fin.isFile() && fin.canRead()){break;}
		}
		Scanner sf = new Scanner (fin);
		while(sf.hasNextInt()){
			linhaph += sf.nextInt();
			linhaph += " ";
		}
		valores = linhaph.split(" ");
		int[] ph_conv = new int [valores.length];
		int[] ph_temp = new int [valores.length];
		for (int i = 0; i < valores.length; i++)
		{
			ph_conv[i] = Integer.parseInt(valores[i]);
		}
	    for (int i = 0; i < ph_conv.length; i++)
		{
			if(ph_conv[i]<=14 && ph_conv[i]>=0) {ph_temp[i] = ph_conv[i]; cont++;}
			if(ph_conv[i]>14 && ph_conv[i]<0){i--;cont--;}
		}
		int [] ph = new int [cont];		
		System.arraycopy(ph_temp, 0 , ph , 0, cont);	
		sf.close();
	 return ph;
	}
	public static void f2(int ph[]){
	 System.out.println("Valores de pH");
	 for (int i = 0; i < ph.length; i++)
	 {
		System.out.printf("%2d, ",ph[i]);
	 }
     }
	 public static double f3(int ph[]){
	 double media=0, soma=0;
	 
	 for (int i = 0; i < ph.length; i++)
	 {
		soma += ph[i];
	 }
	 media = soma / ph.length;
	 System.out.printf("Média = %f",media);
	 return media;
	}
	public static void f4(int ph[]){
	int acido = 0, basico = 0;
	for (int i = 0; i < ph.length; i++)
	{
		if (ph[i]<7){acido++;}
		if (ph[i]>7){basico++;}
	}
	System.out.println(basico + " Amostras basicas");
	System.out.println(acido + " Amostras acido");
	}
	public static void f5(int ph[], double media){
		int cont = 0;
		for (int i = 0; i < ph.length; i++)
		{
			if (media > ph.length){cont++;}
		}
		System.out.println(cont +  " São maiores que os");
	}
	public static void f6(int ph[]){
		int num = 100;
		int n = -1;
		for (int i = 0; i < ph.length; i++)
		{
			if (ph[i] < num){n = i;}
		}
		int tmp;
		int i, j;
		for(i = 0 ; i < n; i++){ // fixamos uma posição
		for(j = i + 1 ; j < n +1 ; j++){ //percorremos as outras
		if(ph[i] > ph[j]) // se mínimo, trocamos
			{
				tmp = ph[i];
				ph[i] = ph[j];
				ph[j] = tmp;
			}
		}
}
		f2(ph);
		}
}

