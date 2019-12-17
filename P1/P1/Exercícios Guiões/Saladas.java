import java.util.Scanner;
public class Saladas {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int q;
		String salada="a";
		double soma=0;
		System.out.println(" --------------------------------------------------");
		System.out.println("|Cesar                  |                      6,0§|");
		System.out.println("|Vegana                 |                     10,0§|");
		System.out.println(" --------------------------------------------------");
		System.out.println("|molho maionese         |                     +0,6§|");
		System.out.println(" --------------------------------------------------");
		for (int i=1;i<=1000;i++){	
			System.out.printf("Deseja iniciar o pedido sim 1/não 0:");
			q = ler.nextInt();

		while(q==1 && salada!="0"){
			System.out.printf("Introduza o nome da salada e se desejar molho escreva (Molho)(Se quiser concluir escreva 0):");
			salada = ler.nextLine();
		
		switch(salada){
		 case("Cesar"):
			soma = soma + 6.0;
			break;
		 case ("Vegana"):
			soma = soma + 10.0;
			break;
		case ("Molho"):
			soma = soma + 0.6;
			break;
		case ("0"):
			System.out.printf("Pedido concluido. O preço a pagar é: %f\n", soma);
			break;
		default:
			System.out.printf("Opção Invalida");
			break;
		
		}

}
	
	System.out.printf("Pedido não realizado.");
}


		}
}		
	
	

