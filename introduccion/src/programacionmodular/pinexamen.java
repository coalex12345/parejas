package programacionmodular;

import java.util.Scanner;

public class pinexamen {

	public static void main(String[] args) {
		final int pinalmacenado = 4545;
		int contador=1;
		boolean pincorrecto=false;
		while (pincorrecto==false && contador<=3) {
			int num=pedirDato();
			if(num==pinalmacenado) {
				pincorrecto=true;
				System.out.println("correcto estas dentro");
									}
			
			else {
				contador++;
				pincorrecto=false;
				System.out.println("pin incorrecto intentelo de nuevo");
				}
			
													}
		if(contador==3) {
			System.out.println("te quedas fuera");
		}
}
	
	///////////////////////////////////////////////////////////

public static int pedirDato(){
	System.out.println("dime el num");
	Scanner s = new Scanner(System.in);
	int i=s.nextInt();
	
	return i;
							}


}
