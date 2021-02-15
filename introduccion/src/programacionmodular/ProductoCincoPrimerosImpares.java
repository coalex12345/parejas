package programacionmodular;

public class ProductoCincoPrimerosImpares {

	public static void main(String[] args) 
	{
		int producto = 1;
		
		for(int num = 1; num < 10;num = num + 2)
			producto = producto * num;
		
		System.out.println("el producto de los 10 primeros números impares es:"+ producto);
			

	}

}
