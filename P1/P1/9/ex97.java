import java.util.*;
import java.io.*;

public class ex97 {
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
	capitalize("era uma vez");
    }

    public static void capitalize(String str) {
       char p = str.charAt(0);
       char c,d;
       System.out.print(Character.toUpperCase(p));
        for (int i = 1; i < str.length(); i++) {
			c = str.charAt(i);
				if (c == ' ') {
					System.out.print(' ');
					d = str.charAt(i + 1);
					System.out.print(Character.toUpperCase(d));
					i++;
  
				}else{System.out.print(c);}
		  
        }
    }
}
