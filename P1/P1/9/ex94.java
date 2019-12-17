import java.util.*;
import java.io.*;
public class ex94 {
	static String str;
	static String pattern;

	public static void main (String[] args) throws IOException{
		Scanner ler = new Scanner (System.in);
		//~ System.out.println(match1("55-ED-65","00-A0-00"));
		
		System.out.print("Escolha o padrão ex.: 'AA-00-00' -> ");
		pattern = ler.nextLine();
		System.out.print("Introduza a matricula -> ");
		str = ler.nextLine();
		if(match1(str,pattern)== true){System.out.print("A matricula é valida");}
		if(match1(str,pattern)== false){System.out.print("A matricula é invalida");}
		
	}
	//~ Minha
	public static boolean matchPattern(String str,String pattern){
	boolean valid=true;
	switch(pattern){
		case("AA-00-00"):
				if (Character.isDigit(str.charAt(0))){valid = false;}	
				if (Character.isDigit(str.charAt(1))){valid = false;}
				if (str.charAt(2)!='-'){valid = false;}	
				if (Character.isLetter(str.charAt(3))){valid = false;}	
				if (Character.isLetter(str.charAt(4))){valid = false;}
				if (str.charAt(5)!='-'){valid = false;}			
				if (Character.isLetter(str.charAt(6))){valid = false;}	
				if (Character.isLetter(str.charAt(7))){valid = false;}		
			break;
		case("00-AA-00"):
				if (Character.isLetter(str.charAt(0))){valid = false;}	
				if (Character.isLetter(str.charAt(1))){valid = false;}
				if (str.charAt(2)!='-'){valid = false;}		
				if (Character.isDigit(str.charAt(3))){valid = false;}	
				if (Character.isDigit(str.charAt(4))){valid = false;}
				if (str.charAt(5)!='-'){valid = false;}			
				if (Character.isLetter(str.charAt(6))){valid = false;}	
				if (Character.isLetter(str.charAt(7))){valid = false;}
				break;
		case("00-00-AA"):
				if (Character.isLetter(str.charAt(0))){valid = false;}	
				if (Character.isLetter(str.charAt(1))){valid = false;}
				if (Character.isLetter(str.charAt(3))){valid = false;}	
				if (Character.isLetter(str.charAt(4))){valid = false;}		
				if (Character.isDigit(str.charAt(6))){valid = false;}	
				if (Character.isDigit(str.charAt(7))){valid = false;}
				break;
		default:
				System.out.println("O padrão de matricula é invalido");
				break;			
				
	}
     return valid;
	
	}
	//~ stor
	static boolean match1(String str, String padrao){
		boolean valida = true;
		if(str.charAt(2)!='-'){valida = false;}
		if(str.charAt(5)!='-'){valida = false;}
		if(valida == false){return valida;}	
		for (int i=0;i<padrao.length();i++){
			char p = padrao.charAt(i);
			char m = str.charAt(i);
			if (p != '-'){
				//~ if (!((Character.isLetter(p) && Character.isLetter(m)) || (Character.isDigit(p) && Character.isDigit(m))))valida=false;
				if(Character.isLetter(p) && Character.isDigit(m) || Character.isLetter(m) && Character.isDigit(p) ){valida = false;}
		}
			return valida;
		}
	//~ public static boolean isNumber(int i){
	//~ boolean num = false;
	//~ for (int a = 0; a<=9; a++){
		//~ if (i = a){num = true;}
	//~ }
	//~ return num;
	//~ }
}

