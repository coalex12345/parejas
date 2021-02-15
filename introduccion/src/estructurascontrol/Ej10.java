package estructurascontrol;

public class Ej10 {

	public static void main(String[] args) {
		int mult,suma;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				mult=i*j;
				suma=i+j;
				System.out.println("la suma de "+i+" y "+j+" es "+suma);
				System.out.println("la multiplicacion de "+i+" y "+j+" es "+mult);
			}
				
			System.out.println();
		}
			
		

	}

}
