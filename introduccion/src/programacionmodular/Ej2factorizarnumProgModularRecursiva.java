package programacionmodular;

import java.util.Scanner;

public class Ej2factorizarnumProgModularRecursiva {

	public static void main(String[] args) {
		//pedimos el num
		System.out.println("dime el numero que quieres factorizar");
		int num=pedirDato();
		//calculas la factorizacion
		int resultado=factorial(num);
		//sacas el resultado pro pantalla
		verResultado(num,resultado);
												}
		public static int pedirDato() {
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			return num;
										}
		public static int factorial(int num) {
			if (num==0){
				return 1;}
			else {
				return num=num*factorial(num-1);
			}
				
											}
			
		
													
		
		public static void verResultado(int num, int resultado) {
			
			System.out.println("el factorial de "+num+" es "+resultado);
																	}
		
	}