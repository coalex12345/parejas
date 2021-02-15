package programacionmodular;
import java.util.Scanner;

public class numprimo {

	public static void main(String[] args) {
	System.out.println("dime un el numero que quieres averiguar");
	int num=pedirDato();
	if(esPrimo(num)==true)
		System.out.println("es primo");
	else
	System.out.println("no es primo");

											}
	///////////////////////////////////////////////////////////

public static int pedirDato(){
	Scanner s = new Scanner(System.in);
	int i=s.nextInt();
	return i;
							}
///////////////////////////////////////////////////////////////
public static boolean esPrimo(int num) {
	for (int divisor=2;divisor<=num/2;divisor++) {
		
		//comprobamos si el resto es 0
		if (num%divisor==0) {
		return false;
							}
													}	
	return true;
	}
}



