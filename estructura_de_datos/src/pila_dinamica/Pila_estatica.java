package pila_dinamica;

public class Pila_estatica {
// atributos :
	private char pila[];
	
	private int cima;
	
	private int tam;
	
	//constructor
	
	public Pila_estatica() {
		tam = 'z'-'a'+1;
		cima = 0;
		pila = new char [tam];
		
	}
	
	//funcion metodo pila llena
	
	public boolean pilallena() {
		
		return (cima==tam);
		
	}
	//mete el caracter en la cima de la pila
	
	public void meter(char car ) {
		if ( pilallena() ==true) {
			System.err.println("la pila esta llena");
		
		}
		
		else {
			pila[cima]= car;
		cima++;
		}
	}
	//retorna un booleano que indica si la pila esta llena
	public boolean pilavacia() {
		return (cima == 0);
	}
	
	
	//retorna el elemento que he sacado
	
	public char sacar() {
		
		if (pilavacia()) {
			System.err.println("la pila esta vacia");
			return 0;
		}
		else {
		//me situo en la pos donde esta el ultimo caracter
		cima--;
		//retornamos el valor
		return pila[cima];
		}
	}
	//rellenamos la pila con el abecedario
		public void rellenar() {
			
			
			for (char letra = 'a'; letra <= 'z'; letra++) {
				meter(letra);
			}
		}
		
		//vacia la pila y envia a pantalla los elementos que voy eliminando
		public void vaciar() {
			
		while (!pilavacia()) {
			System.out.print(sacar());
		}
	
	
}
	
	
	
	
	
	
	
	
	
}
