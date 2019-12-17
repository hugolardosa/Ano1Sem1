import java.util.Scanner;
public class Cinco {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int lag,alt,altr,lagr;
		System.out.print("Qual é a largura: ");
		lag = sc.nextInt();
		System.out.print("Qual é a altura: ");
		alt = sc.nextInt();
		lagr=lag-1;
		ast(lag);
		altr=alt-2;
		for (int a=1; a<=altr; a++){
		esp(lagr);
	}
		ast(lag);
	}

	
	public static void ast(int x){
		
		for (int i=1; i<=x; i++){
		System.out.printf("*");
	}
		System.out.println();
}
	public static void esp(int x){
		System.out.print("*");
		for (int i=2; i<=x; i++){
		System.out.print(" ");
	}
	System.out.print("*");
	System.out.println();
}
}
