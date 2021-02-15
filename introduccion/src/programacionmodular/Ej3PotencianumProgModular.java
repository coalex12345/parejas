package programacionmodular;
import java.util.Scanner;
public class Ej3PotencianumProgModular {

	public static void main(String[] args) {
		//pedimos la base
		System.out.println("dime la base");
		float base= pedirDato();
		//pedimos el exponente
		System.out.println("dime el exponente");
		float exp= pedirDato();
		//hacemos la operacion
		float operacion=hacerOperacion(base,exp);
		//mostramos el resultado por pantalla
		verResultado(base,exp,operacion);
											}
	public static float pedirDato() {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		return num;
									}
	public static float hacerOperacion(float base, float exp) {
		float resultado=1;
		for( int i=1;i<=exp;i++) {
			resultado=resultado*base;;}
		return resultado;
																}
	public static void verResultado(float base, float exp, float operacion) {
		
		System.out.println("el resultado de "+base+" elevado a "+exp+" es "+operacion);
		
		
															}
}
