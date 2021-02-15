package programacionmodular;
import java.util.Scanner;
public class Ej11Divisionrecursiva {

	public static void main(String[] args) {
		System.out.println("dime el num");
		int num=pedirDato();
		System.out.println("dime la base");
		int base=pedirDato();
		cambiarBase(num, base);
	}
	public static int pedirDato(){
		Scanner s = new Scanner(System.in);
		int i=s.nextInt();
		return i;
	}
	public static void cambiarBase(int num,int base) {
		if (num<base) {
			System.out.print(num);
		}
		else {
			cambiarBase(num/base,base);
			System.out.print(num%base);
		}
	}
	
	
	
	
}

