package estructurascontrol;
import java.util.Scanner;
public class Ej17triangulopitagorico {

	public static void main(String[] args) {
		//17) (TrianguloPitagorico.java) que visualice en pantalla un triángulo pitagórico. La base tiene que
	   //tener igual número de caracteres que la altura.
	Scanner s=new Scanner(System.in);
	System.out.println("dime el numero de asteriscos que quieres que tenga la base o la altura ");
	int numero=s.nextInt();
	for(int i=1;i<=numero;i++) {
		System.out.println(' ');
		for(int j=1;j<=i;j++) {
		System.out.print('*');
	}
		
	}}}

//System.out.println("introduce un caracter");
//char car=(char)System.in.read();
//System.out.println("introduce la altura");
//int altura=s.nextInt();
//for (int linea=1;linea<=altura;linea++) {
//	for (int contca=1;contca<=linea; contca++) {
//		System.out.print(car);}
//syso println()
//}