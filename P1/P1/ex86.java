import java.util.*;
import java.io.*;
public class ex86 {
	static Scanner ler = new Scanner (System.in);
	public static void main (String[] args) {
	 Temp a [] = new Temp [5];
	 leitura(a);
	 for (int i = 0; i< 5; i++){
		System.out.println(a[i].tmin);
		System.out.println(a[i].tmax);
	 }
	 
	}
	public static Temp[] leitura(Temp a[]){
		for (int i = 0; i < 5 ; i++){
		while(true){
			System.out.printf("Temp max dia %d ",i+1);
			a[i].tmax =  ler.nextDouble();
			if (a[i].tmax <= 50 && a[i].tmax >= -20){break; }
		}
		while(true){
			System.out.printf("Temp min dia %d ",i+1);
			a[i].tmax =  ler.nextDouble();
			if (a[i].tmin > 50 && a[i].tmin < -20 && a[i].tmax > a[i].tmin){break; }
		}
		
	}
	return a;
}
}
class Temp {
double tmin,tmax,amplitude;
} 

