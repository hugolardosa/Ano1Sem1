/*
 * ex72.java
 * 
 * Copyright 2018 Hmll <hugolardosa@ua.pt>
 * 
 Exercício 7.2
Altere o programa 6.2 para ler a lista de números de um ficheiro (deve parar quando ler 100
números positivos ou quando chegar ao fim do ficheiro e deve ignorar os negativos). O nome
do ficheiro deve ser passado como argumento na linha de comandos. Assim, para testar o
programa deve usar uma linha de comando deste género:
java Ex6_3 FicheiroComNumeros.txt
Nota: Num programa Java os argumentos são recebidos no parâmetro da função main, que é
um array de Strings (geralmente String[] args). (No exemplo acima, args[0] teria o valor
"FicheiroComNumeros.txt").

 * 
 * 
 */

import java.io.*;
import java.util.*;
public class ex72 {
	static File fl; 
	public static void main (String[] args) throws IOException {
		File fl = new File (args[0]);
		fl_vld();
		lernum();
	}
	
	    public static void fl_vld () { //validação do nome do ficheiro e do proprio ficheiro
        if(fl.isFile()==false) {System.out.println("O Ficheiro não existe!"); System.exit(1);}
        else if(fl.canRead()==false) {System.out.println("O ficheiro não pode ser lido!"); System.exit(1);}
        else {System.out.println("validação!");}
    }
    public static void lernum() throws IOException{
	Scanner scf = new Scanner (fl);
	int n, rep;
	System.out.printf("Intruduza o valor de contagem");
		 rep = ler.nextInt();
	for (int c=0; c<100; c++){
	 while (fl.hasNextLine() ){
		 n = scf.nextInt();
		 if (n>0 && n == rep ){c++;}
		 if (n<0){break;}
		 }
	 
	}
}
	}

