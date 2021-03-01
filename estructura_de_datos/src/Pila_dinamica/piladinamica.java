package Pila_dinamica;

public class piladinamica
{
/**
 * una pila es una estructura en la cual el ultimo en entrar es el ultimo en salir
 * LIFO
 * las insercciones y eliminaciones se hacen en la cima
 * 
 */
	//atributos
	private Nodo cima;
	
	
	public piladinamica() {
		
		cima = null;
		
		
	}
	
	//meter un elementio en la cima de la pila
	
	public void meter(Object obj) {
		//creamos un nodo nuevo
		Nodo nuevo = new Nodo(obj,cima);
		//actualizamos cima
		cima = nuevo;
		
	}
	//retorna un valor y dice si la pila esta vacia
	
	public boolean pilaVacia() {
		
		return (cima.enlace == null);
		
	}
	
	//retorna la infomracion del nodo que he eliminado
	public Object sacar() {
		if (pilaVacia()) {
			System.err.print("la pila esta vacia");
			return null;
		}
		else {
			Object aux = cima.info;
			//hacemos que cima aopunte al nodo anterior
			cima = cima.enlace;
			return aux;
		}
		
	}
	
	//metodo que rellena con el abecedario la pilla
	
	public void rellenar() {
		for (char letra = 'a'; letra <= 'z'; letra ++) {
			
			
			
			meter(letra);
		}
		
		
		
	}
	//mientras que la pila no este vacia que envie a pantalla 
	//la infomracion del nodo que ha eliminado
	public void vaciar() {
		while (!pilaVacia()) {
			System.out.print(sacar());
		}
	}
	
	
}
