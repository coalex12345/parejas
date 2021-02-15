package estructurascontrol;
import java.util.Scanner;
public class Ej15Potenciajava {
	
	public static void main(String[] args) {
	Scanner s =  new Scanner(System.in);
	int base,exp;
	int resultado=1;
	System.out.println("dime la base");
	base=s.nextInt();
	System.out.println("dime el exponente");
	exp=s.nextInt();
	for( int i=1;i<=exp;i++) {
		resultado=resultado*base;;}
	System.out.println("el resultado es "+ resultado);
	}

}
