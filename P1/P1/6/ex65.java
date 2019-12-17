import java.util.*;
import java.io.*;
public class ex65 {
	
	public static void main (String[] args) {
	 Scanner ler = new Scanner (System.in);
	 int num;
	
	  System.out.println("Introduza os valores a ser lidos ");
	  num = ler.nextInt();
	   double[] x = new double[num];
		for (int i=0; i<num; i++){
			x[i] = ler.nextDouble();
		}
		double med = media(num,x);
		double des = desvio(num,x,med);
	  	  System.out.printf("A media é %f e o desvio %f \n",med,des);

	 
	}
	public static double media(int num,double x[]){
	 double media, soma = 0;
		for (int i=0; i<num; i++){
			soma += x[i];
		}
	 media = soma / num;
	 return media; 
	}
	public static double desvio(int n,double x[], double med){
	 double d = 0;
	 double e = 0;
		for (int i = 1; i<n; i++){
			d = (x[i] - med);
		}
		e += Math.pow(d,2);	
	 double s;
		s = Math.sqrt((e/n));
	return s;
	}
}

