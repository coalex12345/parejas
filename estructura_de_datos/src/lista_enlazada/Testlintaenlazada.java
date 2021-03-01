package lista_enlazada;
import java.util.Scanner;

public class Testlintaenlazada {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Listaenlazada list = new Listaenlazada();
		
		
		list.insertaralprincipio("maria");
		list.insertaralprincipio("ricardo");
		
		list.verLista();
		System.out.println("\n\n");
		
		list.insertarFinal("Alex");
		list.insertarFinal("Carlos");
		
		
		list.verLista();
		
		list.eliminar("Alex");
		System.out.println("\n\n");
		list.verLista();
		System.out.println(list.eliminar("Javier"));
		
		
		System.out.println("introduce una cadena");
		String buscado = s.nextLine();
		
		
	}

}
