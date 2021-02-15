package estructurascontrol;
import java.util.Scanner;
public class Ej18MaximoComunDivisor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//18) (MCD.java) Realizar un pseudocódigo que visualice en pantalla el máximo
		//común divisor de dos número enteros.
		int num1,num2;
		System.out.println("dime el primer num");
		num1=s.nextInt();
		System.out.println("dime el segundo num");
		num2=s.nextInt();
		while (num1!=num2) {
			if(num1>num2)
				num1=num1-num2;
			else
				num2=num2-num1;
		}
		System.out.println("el mcd es el numero "+num1);
	}	

}
