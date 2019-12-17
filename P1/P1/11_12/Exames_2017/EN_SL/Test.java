import java.util.Scanner;
import java.io.*;

public class Test {
	
	public static void main(String[] args) throws IOException{
		 Pais[] paises;
		 paises = lerFichHum("PaisesHumid.txt");
		 procurarListar(paises," "); // espa�o lista tudo
		 procurarListar(paises,"56"); // lista paises onde apareca "56"
		 int [] mins = humMin(paises);
		 for(int i=0; i<mins.length; i++)
			 System.out.printf("Minimo = %5d %3d %s%n", paises[mins[i]].dia,
			 paises[mins[i]].humidade, paises[mins[i]].nome);
			 int[] freq = freqHum(paises);
			 printFreq(freq);
			 System.out.println(diaPaisExiste(paises,paises.length,24,"Marrocos"));
			 //paises=removerRepetidos(paises);
			 //bubbleSort(paises);
			 gravarPais(paises, "PaisesHumidOrd.txt");
	}

	static Pais[] lerFichHum(String nomeF) throws IOException {
		//L� o ficheiro com o nome dado e inicializa o Scanner para o mesmo
		File file = new File(nomeF);
		Scanner scf = new Scanner(file);
		
		//Ler a primeira linha e passar o conte�do para int
		int size = Integer.parseInt(scf.nextLine());
		//Criar uma array do tipo Pais com o tamanho indicado
		Pais[] paises = new Pais[size];
		
		//Inicializa��o do contador
		int count = 0;
		//Loop para ler as linhas do ficheiro enquanto houver nova linha
		while (scf.hasNextLine()) {
			//Cria um objeto do tipo Pais, na posi��o do valor do contador
			paises[count] = new Pais();
			//Passa o primeiro valor da linha como o dia do objeto
			paises[count].dia = scf.nextInt();
			//Passa o segundo valor da linha como a humidade do objeto
			paises[count].humidade = scf.nextInt();
			//Passa a restante string com o nome para o objeto (passando para a pr�xima linha pois chega ao final da atual), incrementando o contador
			paises[count++].nome = scf.nextLine();
		}
		
		//Fecha o Scanner
		scf.close();
		
		//Retorna a array com os objetos do tipo Pais
		return paises;
	}
	
	static void procurarListar(Pais[] p, String frase) {
		//Print inicial para ficar igual ao terminal do enunciado
		System.out.println("Dia   Hum Pais");
		//Loop para correr a array dada toda
		for (int i = 0; i < p.length; i++) {
			//Cria��o da string pedida no enunciado
			String str = p[i].dia + " " + p[i].humidade + " " + p[i].nome;
			//Fun��o sugerida no enunciado, se o resultado for >= 0 ent�o encontrou a frase em algum peda�o da string
			if (str.indexOf(frase) >= 0) {
				//Print formatado para corresponder ao terminal do enunciado
				System.out.printf("%5d %3d%s\n", p[i].dia, p[i].humidade, p[i].nome);
			}
		}
	}
	
	static int[] humMin(Pais[] p) {
		//Inicializar a vari�vel com o valor m�ximo e o tamanho da array
		int min = 100;
		int size = 0;
		
		//Loop que percorre todos os objetos do tipo Pais na array dada
		for (int i = 0; i < p.length; i++) {
			//Se a humidade desse pais for menor que a m�nima atual, substitui a m�nima atual por esse valor e define a contagem dos pa�ses com humidade m�nima como 1
			if (p[i].humidade < min) {
				min = p[i].humidade;
				size = 1;
			}   //Caso a humidade desse pais seja igual � m�nima, incrementa a contagem dos pa�ses com humidade m�nima
				else if (p[i].humidade == min) {
				size++;
			}
		}
		
		//Cria uma array com o tamanho da contagem dos pa�ses com humidade m�nima
		int[] minimos = new int[size];
		
		//Inicializa o contador
		int count = 0;
		
		//Define a array criada com o index dos pa�ses cuja humidade � igual � humidade m�nima e incrementa o valor do contador
		for (int i = 0; i < p.length; i++) {
			if (p[i].humidade == min) {
				minimos[count++] = i;
			}
		}
		
		//Retorna a array com o index dos pa�ses com humidade m�nima
		return minimos;
	}
	
	static void gravarPais(Pais[] p, String nome) throws IOException {
		//Inicializa o ficheiro com o nome dado e o PrintWriter para o mesmo 
		File file = new File(nome);
		PrintWriter pwf = new PrintWriter(file);
		
		//Escreve o tamanho da array dada e a informa��o dos pa�ses formatada como pedida
		pwf.println(p.length);
		for (int i = 0; i < p.length; i++) {
			pwf.printf("%5d %3d%s\r\n", p[i].dia, p[i].humidade, p[i].nome);

		}
		
		//Fecha o PrintWriter
		pwf.close();
	}
	
	static int[] freqHum(Pais[] p) {
		//Cria��o de uma array com 91 posi��es (10 a 100), cada uma correspondente a 1 valor da humidade
		int[] freq = new int[91];
		
		//Loop que corre toda a array fornecida e caso a humidade do objeto perten�a ao intervalo [10,100], incrementa o valor da array cujo �ndice corresponde a essa humidade-10 (porque a humidade come�a no 10)
		for (int i = 0; i < p.length; i++) {
			if (p[i].humidade >= 10 && p[i].humidade <= 100) {
				freq[p[i].humidade-10]++;
			}
		}
		
		//Devolve a array com os valores para cada humidade
		return freq;
	}
	
	static void printFreq(int[] f) {
		//Print igual ao do terminal do enunciado
		System.out.println("Hum. Freq");
		
		//Loop que imprime o valor da humidade e a frequ�ncia com que ocorre, caso esta seja > 0
		for (int i = 10; i < 100; i++) {
			//i-10 pois os �ndices da array v�o de 0 a 90, apesar da humidade ir de 10 a 100
			if (f[i-10] > 0) {
				System.out.printf("%4d %4d\n", i, f[i-10]);
			}
		}
	}
	
	static boolean diaPaisExiste(Pais[] p, int comp, int dia, String pais) {
		//Percorre toda a array com os objetos Pais
		for (int i = 0; i < comp; i++) {
			//Caso o dia e o nome do objeto correspondam respetivamente ao dia e � string passadas retorna como verdadeiro
			if (p[i].dia == dia && p[i].nome.indexOf(pais)>0) {
				return true;
			}
		}
		
		//Caso n�o encontre nenhum objeto que preencha os requisitos, retorna f�cil
		return false;
	}
	
}

class Pais {
	int dia;
	int humidade;
	String nome;
}