package estructurascontrol;
import java.util.Scanner;
public class EJ19NotaMedia {

	public static void main(String[] args) {
		// 19 )NotaMedia.java) Realizar un pseudocódigo que visualice en pantalla la
		//nota media de un conjunto de notas. El usuario deja de introducir notas
		//cuando teclea un –99.
		Scanner s=new Scanner(System.in);
		double suma=0,num=0;
		double numeros=0;
		double media=0;
		do {
			System.out.println("Dime las notas para hacer la media(-99 para salir) ");
			num=s.nextDouble();
			if(num>=0 && num<=10) {
				suma=suma+num;
				numeros++;
				media=suma/numeros;}
			else if(num==-99) {
				System.out.println("programa acabadisimo");
			}
			else {
				System.out.println("las notas no son reales");
			}
			}while(num!=-99);
			
			System.out.println("la media es "+media);
}
}