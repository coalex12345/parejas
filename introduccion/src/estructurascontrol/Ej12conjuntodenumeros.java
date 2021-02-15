package estructurascontrol;
import java.util.Scanner;
public class Ej12conjuntodenumeros {
	
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		double numero;
		int contmenor15=0;
		int contmayor55=0;
		int cont4555=0;
			for(int i=1;i<=6;i++) {
				System.out.println("dime un numero");
				numero=s.nextDouble();
				if (numero<15) {
					contmenor15++;}
				else if(numero>=55) {
					contmayor55++;}
				else if(numero>45){
					cont4555++;}
	}   System.out.println("hay "+contmenor15+" menores de 15");
		System.out.println("hay "+contmayor55+" mayores de 55");
		System.out.println("hay "+cont4555+" entre 45 y 55");
				

	}

}
