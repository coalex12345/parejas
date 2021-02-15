package estructurascontrol;
import java.util.Scanner;

public class Conversornotas2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("dime tu letra bro");
		char letra = entrada.next().charAt(0);
		int nota=0;
		
		switch (letra) {
		case 'i' : nota=4; 
		System.out.println("tu nota es "+nota);
		break;
		
		case 'f' : nota=5;
		System.out.println("tu nota es "+nota);
		break;
		
		case 'b' : nota=6;
		System.out.println("tu nota es "+nota);
		break;
		
		case 'n' : nota=7;
		System.out.println("tu nota es "+nota);
		break;
		
		
		case 's' : nota=9;
		System.out.println("tu nota es "+nota);
		break;
		
		
		
		
		default :
			System.out.println("letra no valida"); break;
			
			
		}
		
	}
}
		
			
		
		

	


