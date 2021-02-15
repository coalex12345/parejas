package estructurascontrol;
import java.util.Scanner;
/*(Calculadora.java) que introduzca dos números
por teclado y mediante un menú calcule y visualice su suma, resta,
multiplicación y división. Utilice un interruptor que valide la opción. En caso
de que hay elegido la opción de dividir, visualice en pantalla un mensaje
indicando que no se puede dividir por cero cuando el operando2 sea 0 que,
así mismo y mediante otro interruptor denominado imprimir evite la
visualización del resultado si se da este hecho.*/

public class Ej14calculadorajavabueno {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		double numero1=0;
		double numero2=0;
		int inter;
		System.out.println("dime el primer numero ");
		numero1=s.nextDouble();
		System.out.println("dime el segundo numero (en el caso de dividir este sera el dividendo)");
		numero2=s.nextDouble();
		double op;
		System.out.println(" 1 Pasa sumar los numeros\n 2 Para restar los numeros\n 3 Para multiplicar los numeros\n 4 Para dividir los numeros");
		inter=s.nextInt();
		switch (inter) {
			case 1:
				op=numero1+numero2;
				System.out.println("el resultado de la operacion es "+op);
				break;
			case 2:
				op=numero1-numero2;
				System.out.println("el resultado de la operacion es "+op);
				break;
			case 3:
				op=numero1*numero2;
				System.out.println("el resultado de la operacion es "+op);
				break;
			case 4:
				if (numero2!=0){
				op=numero1/numero2;
				System.out.println("el resultado de la operacion es "+op);}
				else {
					System.out.println("tu segundo numero es 0, y no puedo dividir entre 0");}
				break;
			default:
				System.out.println("el numero introducido no esta entre las opciones");
			
				}
		
		
	}

}
