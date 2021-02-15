package matrices2;

public class TestMatriz {

	public static void main(String[] args) {
		System.out.println("Practica de matrices");
		Matriz matriz = new Matriz(3,3);
		matriz.leerMatriz();
		matriz.escribeMatriz();
		System.out.println("La suma de la diagonal de la matriz "
				+ "es " + matriz.sumaDiagonal());
		System.out.println("La suma de encima de la matriz es " + matriz.sumaEncima());
		matriz.sumaTotales();
	}

}
