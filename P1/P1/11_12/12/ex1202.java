/* Pretende-se implementar um programa que permita gerir uma prova automóvel com no
máximo 10 participantes. Para cada participante (classe Piloto) deverá ser guardada a
seguinte informação:
	número da viatura: valor inteiro incrementado automaticamente após cada introdução;
	nome do piloto: texto livre;
	matrícula da viatura: texto com 8 carateres representando uma matrícula portuguesa;
O programa deve funcionar de forma repetitiva com base no menu de opções que a seguir
se apresenta
*/

import java.io.*;
import java.util.*;
public class ex1202 {
	static Scanner kb = new Scanner (System.in);
	public static void main (String[] args) {
		Piloto[] info = new Piloto[1];
		int op;	
		// menu
	   while(true){
		System.out.println("");
		System.out.println("Gestão de uma prova automóvel:");
		System.out.println("	1 - Inserir informação dos pilotos");
		System.out.println("	2 - Listar pilotos ordenados pelo número da viatura");
		System.out.println("	3 - Alterar informação de um piloto");
		System.out.println("	4 - Remover piloto com base no número da viatura");
		System.out.println("	5 - Listar pilotos ordenados pelo nome");
		System.out.println("	6 - Remover piloto(s) com base no nome");
		System.out.println("	7 - Validar matriculas");
		System.out.println("	8 - Terminar o programa");
		System.out.println("Opção ->");
		op = Integer.parseInt(kb.nextLine());
		while (op>8 || op<1){
			System.out.println("Opção invalida");
			System.out.println("Opção ->");
			op = Integer.parseInt(kb.nextLine());
		}
	switch (op)
	{
		case 1:
			info = op1();
			break;
		case 2:
			op2(info);
			break;
		case 3:
			info = op3(info);
			break;
		case 4:
			info = op4(info);
			break;		
	    case 5:
			op5(info);
			break;
		//~ case 6:
			//~ info = op6(info);
			//~ break;
		//~ case 7:
			//~ op7(info);
			//~ break;
	}
}
  }
			//~ Introdução da informação associada aos pilotos, terminando com a introdução de
		//~ um nome vazio, isto é, nome com zero carateres. Toda a informação deverá ser
		//~ pedida ao utilizador com a exceção do número do veículo que deverá ser
		//~ preenchido pelo programa, assumindo um valor incremental começando em 1 para
		//~ o primeiro piloto. Não é necessário fazer validações na introdução dos dados. Nesta
		//~ opção, a base de dados deve ser preenchida desde o início, ignorando os dados
		//~ previamente introduzidos.
	public static Piloto[] op1(){
	Piloto[] inf_tmp=new Piloto[11];
	int id=0;
	for (int i = 0; i < 11; i++)
	{
		inf_tmp[i] = new Piloto();
	}
	int c;
	while(true){
	 inf_tmp[id].id = id;
	 System.out.println("Qual é o nome do condutor:");
	 inf_tmp[id].nome = kb.nextLine();
	 c = (inf_tmp[id].nome).compareTo("");
	 if (c == 0) {break;}
	 System.out.println("Qual é a matricula:");
	 inf_tmp[id].matricula = kb.nextLine();
	 if (id == 10) {break;}
	id++;
	}
	Piloto [] inf = new Piloto [id];
	for (int i = 0; i < id; i++)
	{
		inf[i] = new Piloto();
	}
	System.arraycopy(inf_tmp,0 ,inf, 0, inf.length);
	return inf;
}
	//~ Mostrar ao utilizador a informação sobre os pilotos, ordenada por ordem
	//~ decrescente do número da viatura.
	public static void op2(Piloto[] info){
		System.out.println("| nº | Nome | Matricula | ");

		for (int i = info.length-1 ; i >= 0; i--)
		{
			if (info[i].nome!= null && info[i].matricula!= null)
			System.out.printf("| %2d |  %s  |  %s  | \n",info[i].id,info[i].nome,info[i].matricula);
		}
		
	}
	//~ Alterar a informação sobre um piloto, dado o número da viatura pedido ao
	//~ utilizador. Caso a viatura exista, deverá ser pedido ao utilizador todos os campos do
	//~ piloto com a exceção do número da viatura. Deve informar o utilizador se a viatura
	//~ não existir.
	public static Piloto[] op3(Piloto[] info){
	boolean existe = false;
	int num,id = -1;
	while(true){
		 System.out.println("Qual é o numero de viatura so piloto");
		 num = Integer.parseInt(kb.nextLine()); 
		for (int i = 0; i < info.length; i++)
		{
			if(num == info[i].id){existe = true; id = i;}
		}
		if (existe == true){break;}
		System.out.printf("Não existe, repita. \n");
	}
	System.out.println("Mudança do piloto " + id);
	System.out.println("---------------------");
	System.out.println(" ");
	System.out.println("Qual é o nome do condutor:");
	 info[id].nome = kb.nextLine();
	 System.out.println("Qual é a matricula:");
	 info[id].matricula = kb.nextLine();
	return info;
	}
	 //~ Remover um piloto, dado o número da viatura pedido ao utilizador. Deve informar
	//~ o utilizador se a viatura não existir.
	public static Piloto[] op4(Piloto [] info){
	boolean existe = false;
	int num,id = -1;
	while(true){
		System.out.println("Qual é o numero de viatura a apagar?");
		num = Integer.parseInt(kb.nextLine()); 	
		 for (int i = 0; i < info.length; i++)
		{
			if(num == info[i].id){existe = true; id = i;}
		}
		if (existe == true){break;}
	    System.out.printf("Não existe, repita. \n");
	}
	 
	 info[id].nome = null;
	 info[id].matricula = null;
	 return info;
	}
	//~ Mostrar ao utilizador a informação sobre os pilotos, ordenada lexicograficamente
	//~ por ordem crescente do seu nome.
	public static Piloto[] op5(Piloto[] info){
		for (int i = 0; i < info.length - 1; i++) //fixa o array numa possição
		{
			for (int j = i + 1; j < info.length ; i++) //e depois verifica as outras
			{
				if((info[i].nome).compareTo(info[j].nome) > 0){ //Troca os nomes de possição
					String Temp = info[i].nome;
					info[i].nome = info[j].nome;
					info[j].nome = Temp;
					
				}
			}
			
		}
		
		return info;
	}
	//~ Remover um ou vários pilotos com base no nome, parcial ou completo, pedido ao
	//~ utilizador. Sugere-se a utilização da função indexOf da classe String. No caso de
	//~ haver mais do que um piloto que respeite a condição, deve ser perguntado ao
	//~ utilizador qual ou quais os pilotos a remover.
	public static Piloto[] op6(Piloto[] info){
		
		return null;
	}
	//~ Verificação das matrículas dos veículos presentes na prova e, em caso de matrícula
	//~ inválida, pedir ao utilizador nova matrícula para o piloto em causa. Considere as
	//~ três possibilidades de matrículas em Portugal: AA-00-00, 00-00-AA e 00-AA-00.
	public static Piloto[] op7(Piloto[] info){
		return null;
	}

}
	
class Piloto{
	int id;
	String nome;
	String matricula;
}
