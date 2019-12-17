import java.util.*;
public class ex82 {
	static final Scanner ler = new Scanner (System.in);
	public static void main (String[] args) {
		double soma = 0;
		double a = 0;
		double maisafastado = 0;
		Ponto2D p = new Ponto2D();
		Ponto2D p0 = new Ponto2D();
		Ponto2D ma = new Ponto2D();
		p0.x = 0;
		p0.y = 0;
		int con = -1;
		do{
			p = lerpontos();
			soma += Dist(p0,p);
			con++;
		    a = Dist(p0,p);
			if (a > maisafastado){
				maisafastado = a;
				ma = p;
				}
		}while(!(p.x == 0 && p.y == 0));
		System.out.printf("A soma das distâncias dos %d pontos à origem é %2.1f",con,soma);
		System.out.print("O ponto mais afastado da origem foi: (0.0,");
		writePontos(ma);
	} 
	public static Ponto2D lerpontos(){
		Ponto2D p = new Ponto2D();
		System.out.println("Introduza um ponto: ");
		System.out.print("Coordenada X: ");
		p.x = ler.nextDouble();
		System.out.print("Coordenada Y: ");
		p.y = ler.nextDouble();
		return p;
	
	}
	public static void writePontos(Ponto2D p){
		System.out.printf("(%1.1f;%1.1f)",p.x,p.y);
	}
	public static double Dist(Ponto2D p1,Ponto2D p2){
	double dist;
	double sub = Math.pow(( p2.x - p1.x ),2) + Math.pow((p2.y - p1.y),2);
	dist = Math.sqrt(sub);
	return dist;
	}

}
	class Ponto2D{
		double x,y;
		}

