package estructurascontrol;
import java.util.Scanner;
public class Ej19hechoenclase {

	public static void main(String[] args) {
		// 19 )NotaMedia.java) Realizar un pseudocódigo que visualice en pantalla la
		//nota media de un conjunto de notas. El usuario deja de introducir notas
		//cuando teclea un –99.
		Scanner s=new Scanner(System.in);
		float suma=0;
		float num=0;
		float numeros=0;
		float media=0;
		final float flag=-99;
		do {
			System.out.println("dime el numero, mete el flag para salirte del programa");
			num=s.nextFloat();
			if (num!=flag) {
				suma=suma+num;
				numeros++;
				media=suma/numeros;}
			else {
				System.out.println("has metido el flag");
			}
		}while(num!=flag);
		System.out.println("la media es: "+media);}}