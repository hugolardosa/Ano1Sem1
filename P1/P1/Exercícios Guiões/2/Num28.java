/*
 *
Pretende-se escrever um programa que dados três números inteiros introduzidos através do
teclado imprime no terminal os números ordenados por ordem crescente.
 * 
 * 
 */
import java.util.Scanner;
public class Num28 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,y,z;
		System.out.println("Introduza o valor 1: ");
		x = ler.nextInt();
		System.out.println("Introduza o valor 2: ");
		y = ler.nextInt();
		System.out.println("Introduza o valor 3: ");
		z = ler.nextInt();
		if (x>y && y>z){
			System.out.printf("Por ordem %d %d %d" ,x,y,z);
		}
		if (x>z && z>y){
			System.out.printf("Por ordem %d %d %d" ,x,z,y);
		}
		if (y>x && x>z){
			System.out.printf("Por ordem %d %d %d" ,y,x,z);
		}
		if (y>z && z>x){
			System.out.printf("Por ordem %d %d %d" ,y,z,x);
		}
		if (z>y && y>x){
			System.out.printf("Por ordem %d %d %d" ,z,y,x);
		}
		if (z>x && x>y){
			System.out.printf("Por ordem %d %d %d" ,z,x,y);
		}
	
		
	}
}
