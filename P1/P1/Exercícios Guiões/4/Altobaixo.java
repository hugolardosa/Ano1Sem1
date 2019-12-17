/*
 *
Exerc�cio 4.4
* 
O jogo AltoBaixo consiste em tentar adivinhar um n�mero (inteiro) entre 1 e 100. O programa
escolhe um n�mero aleatoriamente. Depois, o utilizador insere uma tentativa e o programa
indica se � demasiado alta, ou demasiado baixa. Isto � repetido at� o utilizador acertar no
n�mero. O jogo acaba indicando quantas tentativas foram feitas.
Nota: Pode gerar o n�mero secreto com o c�digo abaixo.
 int secret = (int)(100.0*Math.random()) + 1;
 * 
 */

import java.util.Scanner;
public class Altobaixo {
	
	public static void main (String[] args) {
	Scanner ler = new Scanner (System.in);
	int secret = (int)(100.0*Math.random()) + 1;
	int x,cont;
	cont=0;
	x=101;
	while (x!=secret){
		System.out.println("Introduza um valor: ");
		x = ler.nextInt();
		cont++;
		if (x>secret){
			System.out.println("O valor que introduziu � maior que o secreto! Try Again");
			}
		if (x<secret){
			System.out.println("O valor que introduziu � menor que o secreto! Try Again");
			}
			
	}
	System.out.printf("O valor secreto era %d, jogou %d vezes",secret,cont);	
	}
}

