package introduccion;

import java.util.Scanner;

public class EsPerfecto {

	public static void main(String[] args)
	{
		int num = pedirNum();
		if(esPerfecto(num))
			System.out.println(num + " es perfecto");
		else
			System.out.println(num + " no es perfecto");

	}
//	//////////////////////////////////////
	
	public static int pedirNum()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un número entero:");
		return entrada.nextInt();
	}
	///////////////////////////////////////////////
	public static boolean esPerfecto(int num)
	{
		int suma = 0;
		
		for(int divisor = 1; divisor <= num/2; divisor++) 
		{
			if(num % divisor == 0)
				suma = suma + divisor;

		}
			
		if( suma == num)
			return true;
		return false;
			
			
	}

}
