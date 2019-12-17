import java.util.Scanner;
public class Quatro {
	
	public static void main (String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int m;
	 System.out.println("Qual é o factorial desejado?");
	 m = sc.nextInt();
	 for (int i=m;i>=1;i--){
			System.out.printf("%d! = %d\n",i,fact(i));
			}
	}
	
	public static int fact(int x){
	int fact=1;
	for(int i=1;i<=x;i++){
		fact=fact*i;
	}
	return fact;	
		}
}

