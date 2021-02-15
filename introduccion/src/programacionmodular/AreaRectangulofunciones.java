package programacionmodular;




import java.util.Scanner;

/* programa que calcule el area y el perimetro del rectangulo*/

public class AreaRectangulofunciones {

	public static  void main(String[] args){
		System.out.println("dime la base ");
		float base= pedirDato();
		System.out.println("dime la altura");
		float altura= pedirDato();
		float area= calcularArea(base,altura);
		float perimetro= calcularPerimetro(base,altura);
		//envimaos a pantalla los resultados
		verResultado(area,perimetro);
		}
	//////////////////////////////////////////////////////////////pedimos datos
	public static float pedirDato() {
		Scanner s=new Scanner(System.in);
		return s.nextFloat();
	}
	//////////////////////////////////////////////////////////////calcula area
	public static float calcularArea(float base, float altura){
		float operacion;
		operacion=base*altura;
		return operacion;
	}
	///////////////////////////////////////////////////////////// calcula perimetro
	public static float calcularPerimetro(float base, float altura) {
		float operacion;
		operacion=2*(base+altura);
		return operacion;
	}
	////////////////////////////////////////////////////////////// hace cosas varias que no return nada
	public static void verResultado(float area,float perimetro) {
		System.out.println("el area es "+ area);
		System.out.println("el perimetro es "+perimetro);
	}
}