/*
 ex1202.java
 * 
 */
import java.util.*;
import java.io.*;
public class ex1201 {
	static Scanner kb = new Scanner (System.in);
	public static void main (String[] args) throws IOException {
	Data[] dados = new Data[1];
	int op;
	//menu
	while(true){
	System.out.println("");
	System.out.println("Estação meteorológica:");
	System.out.println(" 1 - Ler ficheiro de dados");
	System.out.println(" 2 - Acrescentar medida");
	System.out.println(" 3 - Listar valores de temperatura e humidade");
	System.out.println(" 4 - Listar medidas ordenadas por valor de temperatura");
	System.out.println(" 5 - Listar medidas ordenadas por valor de humidade");
	System.out.println(" 6 - Calcular valores médios de temperatura e humidade");
	System.out.println(" 7 - Calcular valores máximos e mínimos de temperatura e humidade");
	System.out.println(" 8 - Calcular histograma das temperaturas e humidade");
	System.out.println(" 9 - Terminar o programa");
	System.out.print("Opção -> ");
	op = kb.nextInt();
	if ( op > 9 || op < 1){
			System.out.print("Opção -> ");
			op = kb.nextInt();
	}
	 switch(op){
		case(1):
			dados = op1();
			break;
		case(2):
			dados = op2(dados);
			break;
		case(3):
			op3(dados);
			break;
		case(4):
			op4(dados);
			break;
		case(5):
			op5(dados);
			break;
		case(6):
		
		case(7):
		case(8):
		case(9):
		
	 }
	
	
	}
	}
	public static Data[] op1() throws IOException{
		int cont = 0 ;//contador de linhas de dados no ficheiro de texto
		String nomfile = "" ; //nome do ficheiro
		File fin;
		Data[] dados_temp = new Data [31]; // Array temporario que comporta os dados permitidos 
		for (int i = 0; i < 31; i++)
	   {
		  dados_temp[i] = new Data();
	   }
		while (true){ //Leitor de um ficheiro valido 
		 System.out.println("Qual é o nome do ficheiro");
	     nomfile = kb.next();
	     fin = new File (nomfile);
		 if (fin.isFile() && fin.canRead()){break;}
		}
		
		Scanner sf = new Scanner (fin);  //Scanner do ficheiro
		
		while (sf.hasNextLine()){ //Leitor do Array do ficheiro		
			dados_temp[cont].temp = sf.nextInt();
			dados_temp[cont].hum = sf.nextInt();
			cont++;
		}
		Data[] dados = new Data [cont];//Array definitivo com a dim dos valores do ficheiro 
		for (int i = 0; i < cont ; i++)
	   {
		  dados[i] = new Data();
	   }
	   
		System.arraycopy(dados_temp,0,dados,0,dados.length);//Copia do Array temporario para o Array defenitivo
		
		sf.close();
	 return dados;
	}
	//~ Introdução da informação associada a uma nova medida. O programa deve aceitar
	//~ apenas temperaturas no intervalo [-10, 40] e valores de humidade relativa no intervalo
	//~ [0, 100]. Deve ter em atenção o número máximo de medidas permitidas.
	public static Data[] op2(Data[] dados) throws IOException{
		if(dados.length == 31){
			System.out.println("Não pode por mais");
			return dados;
			}
		Data[] novo_dados = new Data [dados.length + 1];
		int temp,hum;
		for (int i = 0; i < novo_dados.length; i++) //Criar um array com mais uma entrada
		{
			novo_dados[i]= new Data();
		}
		for (int i = 0; i < novo_dados.length - 1; i++) //Copia array existente
		{
			novo_dados[i] = dados[i];
		}
		do //Leitor da temperatura
		{
		 System.out.println("Qual é o valor da temperatura ");
		 temp = kb.nextInt();
		} while (temp<-10 || temp>40);
		novo_dados[novo_dados.length - 1 ].temp = temp; //Grava o valor novo de temperatura na possição final
		do //Leitor de humidade
		{
		 System.out.println("Qual é o valor da humidade ");
		 hum = kb.nextInt();
		} while (hum<0 || hum>100);
		novo_dados[novo_dados.length - 1].hum = hum; //Grava o valor novo de humidade na possição final
	 return novo_dados;
	}
	// Mostrar ao utilizador a informação sobre todas as medidas.
	public static void op3(Data[] dados) throws IOException{
	 System.out.println("| Temp | Hum |");
	 for (int i = 0; i < dados.length; i++)
	 {
		 System.out.printf("| %d | %d | \n", dados[i].temp,dados[i].hum);  
	 }
	}
	// Mostrar ao utilizador a informação sobre todas as medidas, ordenadas por ordem
    // crescente de temperatura.
   public static void op4(Data[] dados) throws IOException{
	   for (int i = 0; i < dados.length - 1; i++)
	   {
		   for (int j = i + 1 ; i < dados.length; i++)
		   {
			   if (dados[i].temp > dados[j].temp){ // ordenação
					int temp = dados[i].temp;
					int temphum = dados[i].hum;
					dados[i].temp = dados[j].temp;
					dados[i].hum = dados[j].hum;// mudança da posição do valor da humidade para corresponder ao 
					dados[j].temp = temp;
					dados[j].hum = temphum;
			   }
		   }
		   
	   }
	   //Impressão dos dados ordenados
	   System.out.println("| Ord p Tmp  |");
	   System.out.println("| Temp | Hum |");
	 for (int i = 0; i < dados.length; i++)
	 {
		 System.out.printf("| %d | %d | \n", dados[i].temp,dados[i].hum);  
	 }
	   
   }
    // Mostrar ao utilizador a informação sobre todas as medidas, ordenadas por ordem
	// decrescente de humidade.
     public static void op5(Data[] dados) throws IOException{
	   for (int i = 0; i < dados.length - 1; i++)
	   {
		   for (int j = i + 1 ; i < dados.length; i++)
		   {
			   if (dados[i].hum < dados[j].hum){ // ordenação
					
					int temphum = dados[i].hum;
					int temp = dados[i].temp;
					dados[i].hum = dados[j].hum;// mudança da posição do valor da humidade para corresponder ao 
					dados[i].temp = dados[j].temp;
					dados[j].hum = temphum;
					dados[j].temp = temp;
			   }
		   }
		   
	   }
	   //Impressão dos dados ordenados
	   System.out.println("| Ord p hum  |");
	   System.out.println("| Temp | Hum |");
	 for (int i = 0; i < dados.length; i++)
	 {
		 System.out.printf("| %d | %d | \n", dados[i].temp,dados[i].hum);  
	 }
	   
   }
    public static void op6(Data[] dados) throws IOException{
	 double mediatmp=0, mediahum=0;
	 int somatmp = 0, somahum=0;
	 //calculo da media
	  for (int i = 0; i < dados.length; i++)
	 {
 		 somatmp += dados[i].temp;
	 	 somahum += dados[i].hum;
	 }
	 mediatmp = somatmp/dados.length;
	 mediahum = somahum/dados.length;
	 //impressão dos valores da media
	 System.out.println("O valor medio de temp " + mediatmp);
	 System.out.println("O valor medio de hum " + mediahum);
	}
    public static void op7(Data[] dados) throws IOException{
		int maximotmp = 0;//valor onde é guardado o maximo de temperatura
		int maximohum = 0;//valor onde é guardado o maximo de temperatura
		int minimotmp = 0;//valor onde é guardado o maximo de temperatura
		int minimohum = 0;//valor onde é guardado o maximo de temperatura
		//calculo do maximo
		for (int i = 0; i < dados.length; i++)
		{
			if(maximotmp < )
		}
		
	}
}

class Data{
	int temp,hum;
}

