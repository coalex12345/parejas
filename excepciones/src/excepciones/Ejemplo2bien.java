package excepciones;

import java.io.IOException;

public class Ejemplo2bien {

	public static void main(String[] args) throws IOException {
		
		char respuesta = getRespuesta();
		System.out.println("fin del programa");
		
		

	}
	
	public static char getRespuesta()  {
		
		System.out.println("desea seguir?");
		boolean respuestaValida = false;
		char resp = 0;
		while(!respuestaValida) {
			try {
			resp = (char)System.in.read();
			System.in.skip(2);
			}
			catch(IOException error) {
				System.err.print("errr de entrada-salida "+ error.getMessage());
			}
			respuestaValida = (resp == 's' || resp == 'n');
			if(!respuestaValida) {
				System.out.print("error mete una s o una n");
			}
			
			
		}return resp;
		
		
		
	}
	
	
	
	
	

}
