import java.io.*;
import java.util.*;
public class ex95 {
	
	public static void main (String[] args) {
		numToBase(17,2);
	}
	public static void numToBase(int num,int base){
		int div_temp;
		String numconv = "";
		do{
			div_temp= (num % base);
			num =num/base;
			numconv = div_temp + numconv ;	
		}while(num  != 0);
		
		System.out.println(numconv);
		}		
		
		
		
		
	}
	


