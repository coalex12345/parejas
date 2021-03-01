package excepciones;

import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
		
		char respuesta = getRespuesta();
		System.out.println("fin del programa");
		
		

	}
	
	public static char getRespuesta() throws IOException {
		
		System.out.println("desea seguir?");
		boolean respuestaValida = false;
		char resp = 0;
		while(!respuestaValida) {
			resp = (char)System.in.read();
			System.in.skip(2);
			respuestaValida = (resp == 's' || resp == 'n');
			if(!respuestaValida) {
				System.out.print("error mete una s o una n");
			}
			
			
		}return resp;
		
		
		
	}
	
	
	
	
	

}
