package estructurascontrol;
import java.util.Scanner;
/*(Calculadora.java) que introduzca dos números
por teclado y mediante un menú calcule y visualice su suma, resta,
multiplicación y división. Utilice un interruptor que valide la opción. En caso
de que hay elegido la opción de dividir, visualice en pantalla un mensaje
indicando que no se puede dividir por cero cuando el operando2 sea 0 que,
así mismo y mediante otro interruptor denominado imprimir evite la
visualización del resultado si se da este hecho.*/

public class Ej14Calculadorajava {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		double numero1=0;
		double numero2=0;
		System.out.println("dime el primer numero ");
		numero1=s.nextDouble();
		System.out.println("dime el segundo numero en el caso de dividir este sera el dividendo");
		numero2=s.nextDouble();
		
		

	}

}
