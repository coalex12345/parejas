package estructurascontrol;
import java.util.Scanner;
import java.io.IOException;
public class ej7son {
	
	public static void main(String[] args) throws IOException {
		System.out.println("mete la respuesta s o v para acabar bro");
		char car ;
		do {
			car = (char) System.in.read();
			car= Character.toLowerCase(car);
			System.in.skip(2);
			
			if (car!= 's'&& car!='n') {
			System.out.println("tu respuesta es un mierda");
			}
				
		}while (car != 's'&& car != 'n');
		
		System.out.println("tu respuesta es valida");
			
	

	}

}
