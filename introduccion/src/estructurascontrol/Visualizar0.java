package estructurascontrol;
import java.util.Scanner;

public class Visualizar0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("dime tu numero");
		double numero = entrada.nextDouble();
		
		if (numero > 0)
			System.out.println(numero+ " es mayor que 0");
		else if (numero < 0)
			System.out.println(numero+ " es menor que 0");
		else 
			System.out.println("tu numero es 0");
		

	}

}
