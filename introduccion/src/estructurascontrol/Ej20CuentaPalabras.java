package estructurascontrol;

import java.io.IOException;

public class Ej20CuentaPalabras {

	public static void main(String[] args)throws IOException {
		char caracter;
		boolean salir=false;
		int contador=0;
		System.out.println("escriba una frase termianda en punto;");
		boolean empiezaPalabra=false;
		do {
			caracter=(char)System.in.read();
			salir=(caracter=='.');
			if(!empiezaPalabra && caracter!='.' && caracter!=' ' && caracter!='\n' && caracter!='\t') {
				empiezaPalabra=true;
				contador++;
			}
			if(caracter==' ' || caracter=='\n' || caracter =='\t') {
				empiezaPalabra=false;
			}
			
		}while (!salir);
		System.out.println("la frase tiene "+contador+" palabras");
	}

}
