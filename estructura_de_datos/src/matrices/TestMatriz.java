package matrices;

public class TestMatriz {

	public static void main(String[] args) {
		Matriz Matriz1 = new Matriz();
		Matriz1.leerMatriz();
		Matriz1.escribirMatriz();
		System.out.println("la suma de la diagonal principal es : ");
		Matriz1.sumaDiagonal();
	}

}
