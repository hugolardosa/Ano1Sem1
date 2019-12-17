import java.util.Scanner;
public class Tres {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	int x,y;
	boolean mes;
	System.out.print("introduza o mes");
	x = sc.nextInt();
	System.out.print("introduza o ano");
	y= sc.nextInt();
	mes=mes(y);	
	if (x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12){
		System.out.printf("O mes %d tem 31 dias",x);
		}
	if (x==4 || x==6 || x==9 || x==11){
		System.out.printf("O mes %d tem 30 dias",x);
		}	
	if (mes==false && x==2){
		System.out.printf("O mes %d tem 28 dias",x);
		}
	if (mes==true && x==2){
		System.out.printf("O mes %d tem 29 dias",x);
		}
			
	}

public static boolean mes(int x){
		boolean bis;
		if((x % 400 == 0)  || ((x % 4 == 0) && (x % 100 != 0))){
			bis=true;
		}
		else {
			bis=false;
		}
		return bis;
}

}

