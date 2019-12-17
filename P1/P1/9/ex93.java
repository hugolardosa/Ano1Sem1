/*
 * ex9.3.java
 * 
 * Copyright 2018 Hmll <hugolardosa@ua.pt>
 * 
 * 
 * Exercício 9.3
Crie uma função que indique quantas palavras contém uma string. Considere que uma palavra
é qualquer texto que não contenha espaços, tabs (\t) ou mudanças de linha (\n). Por exemplo:
countWords("isto é 1 frase ") devolve 4.
Sugestão: pode percorrer a string símbolo a símbolo e manter uma variável que indica se
está dentro ou fora de uma palavra. Se estiver “dentro” e aparecer um espaço (ou \t ou \n),
passa a estar “fora”. Se estiver “fora” e aparecer outro caráter, passa a estar “dentro” e conta
mais uma palavra.
 * 
 * 
 */


public class ex93 {
	
	public static void main (String[] args) {
		
		System.out.print(countWords("Hello it's me"));
		
	}
	public static int countWords(String frase){
		char c;
		int countp = 0;
		for (int i=0; i < frase.length(); i++){
		c = frase.charAt(i);
		if (c == '\n' || c == '\t' || c == ' '){
		countp++;
		}
		
		}
	return (countp+1);
	}
}

