package lista_enlazada;

public class Testlintaenlazada {

	public static void main(String[] args) {
		
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
	}

}
