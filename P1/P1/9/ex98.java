import java.util.*;
import java.io.*;

public class ex98 {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
		System.out.println(baseToNum("10001",2));
		System.out.println(baseToNum("122",3));
		System.out.println(baseToNum("17",10));
    }
    public static int baseToNum(String num, int base){
		int dim = num.length();
		int[] x = new int [dim];
		int resultado = 0;
		char d;
		for (int i = 0 ; i < num.length(); i++){
			 d = num.charAt((num.length()-1-i));
			 x[i] = Character.getNumericValue(d);
			 resultado += (x[i] * Math.pow(base,(i)));
				 	 
			}
	 return resultado;
	}
}
