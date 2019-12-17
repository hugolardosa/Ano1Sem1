import java.io.*;
import java.util.*;
public class ex66 {
	
	public static void main (String[] args) {
	 char [] ab = new char[26];
	 char coco = 'a';
	 for (int i = 0; i<26; i++){ab[i] = coco++;}
	 boolean[] ab_ver = new boolean [26]; 
	 for (int i = 0; i<26; i++){ab_ver[i] = false;}
     Scanner scf = new Scanner (System.in); 
	 System.out.printf("Introduz a frase ");
	 String str = scf.nextLine();
	 char pussy;
	 char[] p = new char[str.length()];
	 for (int i = 0 ; i <str.length(); i++){
	 str =  str.toLowerCase();
	 p[i] = str.charAt(i);
	 pussy = p[i];
	 for (int a = 0 ; a<26; a++){
		if (pussy == ab[a]){ ab_ver[a] = true;}
		
	 }
	 }
	 for (int a = 0 ; a<26; a++){
	 if (ab_ver[a] == true){System.out.print(ab[a]);}
	}

}
}

