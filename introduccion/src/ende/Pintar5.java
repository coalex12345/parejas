package ende;

import java.util.Scanner;

public class Pintar5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de la primera persona");
		String nombre = sc.next();
		System.out.println("Edad de la primera persona");
		int edad = sc.nextInt();
		
		System.out.println("Nombre de la segunda persona");
		String nombre2 = sc.next();
		System.out.println("Edad de la segunda persona");
		int edad2 = sc.nextInt();

		String[] nombres = {"Pepe","Juan","Ana","Bea","Julio","Belén","Isabel"};
		if(nombre == nombre2) {
			System.out.println("Iguales");
		}
		int temp1 = edad;
		int temp2 = edad2;
		for(int i = 0; i< nombres.length;i++) {
			if(nombre.equals(nombres[i])) {
				System.out.println("Acierta el primero");
			}
			else if(nombre2.equals(nombres[i])) {
				System.out.println("Acierta el segundo");
			}
			
		}
		if(edad % 3 == 0) {
			System.out.println("Edad múltiplo de 3");
		}
		if(edad % 5 == 0) {
			System.out.println("Edad múltiplo de 5");
		}
		if( edad % 3 == 0 && edad % 5 == 0) {
			System.out.println("Edad múltiplo de 3 y 5");
		}
		else {
			System.out.println("No es múltiplo de 3 ni 5");
		}
		System.out.println("Los valores son " + temp1 + " y " + temp2);
	}

}
