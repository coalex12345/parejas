package estructurascontrol;

import java.util.Scanner;

public class ParImpar
{
	public static  void main(String[] args) 
	{
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dime el numero");
		double numero = entrada.nextDouble() ;
		
		 double actua = numero%2;
		
		if (actua == 1) {
			System.out.println("el numero "+numero+ " es impar" );
		
		}
		else {
	
		
			System.out.println("el numero "+numero+ " es par ");
		}
		
				
			
		
		
		
		
		
		
		
	}
	
}
	


