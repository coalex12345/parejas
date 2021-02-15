package introduccion;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce el valor mínimo.");
		int min = entrada.nextInt();
		System.out.println("introduce el valor máximo:");
		int max = entrada.nextInt();
		System.out.println("introduce el valor:");
		
		int num;
		do {
			num = entrada.nextInt();
			if( num < min || num > max )
				System.out.println("Error: el número está fuera del rango");
			
		}while(num < min || num > max );
		System.out.println("fin de programa");
		
		
	}

}
