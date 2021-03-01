package cola_dinamica;

public class ColaDinamica {

	/**
	 * una cola es una estructura en la cual el primero en entrar es el primero en salir
	 */
	
	//atributos
	
	private Nodo primero;
	private Nodo ultimo;
	
	//constructor
	
	public ColaDinamica() {
		
		primero = null;
		ultimo = null;
	
	}
	
	//colavacia devuelve un valor apra indicar si la cola esta vacia o no lo esta
	public boolean ColaVacia() {
		return (primero==null);
	}
	
	//metodo para meter
	public void meter(Object obj) {
		//creamos un nuevo nodo
		Nodo nuevo = new Nodo(obj,null);
		if (ColaVacia()) {
				primero = nuevo;
				//ultimo = nuevo;
		}
		else {
			//si no esta vacia enlazamos el ultimo nodo con el nuevo
			ultimo.enlace = nuevo;
			//ultimo = nuevo;
		}ultimo = nuevo;

	}
	public Object sacar() {
		//comprobamos si esta vacia
		if (ColaVacia()) {
			System.err.println("error la cola esta vacia");
			return null;
		}
		else {
			Object aux = primero.info;
			//hacemos que primero apunte al sigueinte nodo
			primero = primero.enlace;
			return aux;
		}
		
		
		
		
	}
	
	public void rellenar() {
		for (char letra = 'a'; letra <= 'z'; letra ++) {
			
			
			
			meter(letra);
		}
		
		
		
	}
	//mientras que la pila no este vacia que envie a pantalla 
	//la infomracion del nodo que ha eliminado
	public void vaciar() {
		while (!ColaVacia()) {
			System.out.print(sacar());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
