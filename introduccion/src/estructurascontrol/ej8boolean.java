package estructurascontrol;
import java.util.Scanner;
import java.io.IOException;
public class ej8boolean {
	
	public static void main(String[] args) throws IOException {
		boolean respvalida;
		System.out.println("mete la respuesta s o v para acabar bro");
		char car ;
		do {
			car = (char) System.in.read();
			car= Character.toLowerCase(car);
			System.in.skip(2);
			respvalida=(car=='s'|| car=='n');
			
			if (!respvalida)
				System.out.println("mete una s o una n crack");
				
		}while (respvalida==false);
		
		System.out.println("tu respuesta esta okay");
			
	

	}

}
