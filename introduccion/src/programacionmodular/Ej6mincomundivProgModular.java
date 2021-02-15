package programacionmodular;
import java.util.Scanner;
public class Ej6mincomundivProgModular {

	public static void main(String[] args) {
		//pedimos los dos numeros
		System.out.println("dime el primer numero");
		int num1=pedirDato();
		System.out.println("dime el segundo numero");
		int num2=pedirDato();
		int resultado=hacerCuentas(num1,num2);
		verResultado(num1,num2,resultado);
											}
	public static int pedirDato() {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		return num;
									}
	public static int hacerCuentas(int num1, int num2) {
		while (num1!=num2) {
			if(num1>num2)
				num1=num1-num2;
			else
				num2=num2-num1;}
		return num1;
															}
	public static void verResultado(int num1, int num2, int resultado) {
		System.out.println("el minimo comun divisor entre "+num1+" y "+num2+" es "+resultado);
	}
}
