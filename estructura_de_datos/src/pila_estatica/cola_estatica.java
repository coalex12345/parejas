package pila_estatica;

public class cola_estatica {
	
	//miembros dato
	
	private char cola[];
	private int tammax;
	private int inicio;
	private int fin;
	
	
	//constructor
	public cola_estatica() {
		inicio=0;
		fin =0;
		tammax= 'z'-'a'+1;
		cola = new char[tammax];
		
	//colallena
	}
	public boolean colallena() {
		return fin==tammax;
	}
	//meter
	public void meter(char letra) {
		if (colallena()) {
			System.err.println("la cola esta llena");
		}
		
		else {
			cola[fin] = letra;
			fin++;
		}
	}
	//colavacia
	public boolean colavacia() {

		return (inicio==fin);
	}
	//sacar
	public char sacar() {
		if(colavacia() == false) {
			System.err.println("la cola esta vacia");
			return 0;
		}
		else {
			inicio++;
			return cola[inicio-1];
		}
	}
	
	public void rellenar() {
			
			for (char letra = 'a'; letra <= 'z'; letra++) {
				meter(letra);
			}
		
	}
	
	public void vaciar() {
		while(!colavacia()) {
			System.out.println(sacar());
		}
	}
	
	
	
	
	
}
