//Escolhes que sandwiche queres e o programa diz o preço

import java.util.Scanner;

public class Sanduiche
{
     public static void main (String[] args)
     {          
        int a= 3;
        for (int i = 0; i < 40; i++)
		{
			System.out.print("-");
		}
		
		sandwiche(a);
		
		for (int i = 0; i < 40; i++)
		{
			System.out.print("-");
		}
	
		double vegetais = 3.5;
		double carne = 4;
		double espinafres = 2;
		
		pagar(vegetais, carne, espinafres);
	}
		

     public static void sandwiche (int a)
     {
     	
     	for (int i = 1; i <= a; i++)
		{
			if(i==1)
			{
				System.out.println("\n| Sandwiche de vegetais   |  3,5 euros |");
			
			} else if(i == 2) {
				System.out.println("| Sandwiche de carne      |  4 euros   | ");
			
			} else {
				System.out.println("| Sandwiche de espinafres |  2 euros   | ");
			}
	   }
   }
   
   public static void pagar (double vegetais, double carne, double espinafres)
   {
	   Scanner ler= new Scanner(System.in);
	   double precofinal=0, preco=0;
	   String sandes;
	   boolean continuar = false;
	   String conf;
	   
	   
	   do {
		   System.out.print("\nEscolha a sua sandes: ");
		   sandes = ler.next();
		   
		   switch(sandes) {
			    case "vegetais":
			        preco= vegetais;
					System.out.println("Escolheu uma sandes de vegetais.");
					precofinal= precofinal + vegetais;
					break;
				case "carne":
					preco = carne;
					System.out.println("Escolheu uma sandes de carne.");
					precofinal = precofinal + carne;
					break;
				case "espinafres":
					preco = espinafres;
					System.out.println("Escolheu uma sandes de espinafres.");
					precofinal = precofinal + espinafres;
					break;
				default:
					System.out.println("Sandes inválida");
					break;
				}
				System.out.println("Deseja continuar o pedido? Se sim prima y, se não premia qualquer tecla.");
				conf = ler.next();
				
				switch (conf) {
					case "y":
						continuar = true;
						break;
					default:
					    System.out.printf("A pagar: %3.1f euros", precofinal);
					}
				}
					while(continuar = true);
						
				}
			}
