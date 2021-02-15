package estructurascontrol;
import java.util.Scanner;
public class Ej16factorialjava {

	public static void main(String[] args) {
		// 16) Factorial.java) que visualice en pantalla el
		//factorial de un número.
		Scanner s=new Scanner(System.in);
		System.out.println("dime el numero que quieres que te lo factorize");
		int num=s.nextInt();
		int r=1;
		for(int i=num;i>0;i--) {
			r=r*i;
			
		}
		System.out.println(r);
	}

}
