package lista_enlazada;
/* una lista enlazada es una coleccion de nodos
 * cada nodo tendra dos atributos:info,tiene la referencia a un objeto y enlace que tendra la referencia a otro nodo
 * la lista siempre tendra una referencia al primer nodo que podemos llamar incio
 * el final de la lista se sabe por que el campo enlace de tipo nodo contiene null*/
public class Listaenlazada {

	//atributos
	private Nodo inicio;
	//constructor
	public Listaenlazada() {
		
		inicio = null;
		
	}
	
	/*  este metodo inserta un nodo al rpincipio de la lista
	 * 
	 *  
	 *  */
	public void insertaralprincipio(Object obj) {
		//creamos un nuevo nodo y lo enlazamos con el primero
		
		Nodo nuevo = new Nodo(obj,inicio);
		
		//hacemos que inicio apunte al nuevo modo
		
		inicio = nuevo;
		
		
	}
	
	
	/**
	 * muestra en pantalla el contenido de la lista
	 */
	
	public void verLista() {
		
		//decalramos una referencia que sirve para recorrer la lista y que apunte en primer lugar al principio de la lista
		
		Nodo actual = inicio;
		
		//recorremos la lista
		
		while (actual != null) {
			//llevamos a pantala la info
			System.out.println(actual.info);
			
			//avamzamos al siguiente nodo
			actual = actual.enlace;
			
		}
		
		
		
		
	}
	/**
	 * retorno un valor que indica si al lista esta vacia
	 */
	
	public boolean ListaVacia() {
		return (inicio==null);
	}
	
	
	
	
	/**
	 * el metodo inserta un nuevo nodo al final de la lista
	 */
	
	public void insertarFinal(Object obj) {
		//creamos un nuevo nodo
		Nodo nuevo = new Nodo(obj,null);
		if (ListaVacia()==true) {
			inicio=nuevo;
								}
		else {
			//nos situamos en el ultimo nodo
			
			Nodo actual = inicio;
			
			while(actual.enlace != null) {
			//avanzo al siguiente nodo
				
				actual=actual.enlace;}
				
			
			//enlazamos el ultimo nodo con el nuevo
			
			actual.enlace = nuevo;
			}

	}
	
	/**
	 * este metodo elimina un nodo de la lista
	 * 
	 * 	//utilizamos un puntero o referencia al nodo anterior
	//de forma que la eliminacion,de manera que la forma de enlazar el nodo anterior con el siguiente
	//sera:anterior.enlace = actual.enlace
	//haremos un busqueda para encontrar el nodod que quiero eliminar utilizando
	//un boolean denominado encontrado
	 * 
	 * el metodo retornara un boolean que indica si el nodo ha sido eliminado
	 */

	public boolean eliminar(Object obj) {
		Nodo anterior = null;
		Nodo actual = inicio;
		
		boolean encontrado = false;
		
		//mientras que no sea fin de lista y ademas no lo haya encontrado
		
		while (actual != null && encontrado ==false) {
			//comparamos la infomracion con lo que estoy buscando
			
			if(obj.equals(actual.info)) {
				encontrado = true;
												}
			else {
				//avamzamos al sigueinte nodo
				anterior = actual;
				actual=actual.enlace;
				
			}
			
													}
		
		//comprobamos si lo ha encontrado
		if(encontrado==true) {
		//comprobamos si es el primero
			if (actual == inicio) {
				inicio = inicio.enlace;
			}
			else {
				anterior.enlace=actual.enlace;
			}
		
	}
	return encontrado;
	
	
	
	
}
}
