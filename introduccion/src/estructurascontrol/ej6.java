package estructurascontrol;
import java.io.IOException;
import java.util.Scanner;
public class ej6 {
	public static void main(String[] args) throws IOException {
		final char EOF = (char)-1;
		System.out.println(EOF);
		System.out.println("mete una frase y pulsa ctrlD para terminar");
		char car = (char) System.in.read();
		
		while (car != EOF) {
			System.out.print(car);
			car = (char)System.in.read();
			
					
		}

	}

}
