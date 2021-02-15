package programacionmodular;
import java.util.Scanner;
public class pinexamenclase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		final int pin_real=1234;
		int pin_teclado;
		boolean pinValido;
		int cont=0;
		do {
			System.out.println("introduce el pin");
			pin_teclado=s.nextInt();
			cont++;
			pinValido=(pin_real == pin_teclado);
			if(pinValido==false) {
				System.out.println("error el pin no es correcto");
			}
			
		}while(pinValido==false && cont<=3);
		if (pinValido==true) {
			System.out.println("pin correcto");
		}
		else {
			System.out.println("ya no tienes mas intentos");
		}
	}

}
