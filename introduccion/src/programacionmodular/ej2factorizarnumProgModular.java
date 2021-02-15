package programacionmodular;
import java.util.Scanner;
public class ej2factorizarnumProgModular {

	public static void main(String[] args) {
	//pedimos el num
	int num=pedirDato();
	//calculas la factorizacion
	int resultado=hacerOperacion(num);
	//sacas el resultado pro pantalla
	verResultado(num,resultado);
											}
	public static int pedirDato() {
		System.out.println("dime el numero ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		return num;
									}
	public static int hacerOperacion(int num) {
		int operacion=1;
		for(int i=num; i>0; i--) {
			operacion=operacion*i;
								 }
		return operacion;
	
												}
	
	public static void verResultado(int num, int resultado) {
		
		System.out.println("el factorial de "+num+" es "+resultado);
																}
	
}
