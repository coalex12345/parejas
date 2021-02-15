package pila_estatica;

import pila_dinamica.Pila_estatica;

public class Test_cola {

	public static void main(String[] args) {
		//intanciamos una pila
		cola_estatica pila = new cola_estatica();
		//rellenamos la pila
		cola.rellenar();
		//probamos al condicion de error
		cola.meter('k');
		//vaciamos toda la pila
		cola.vaciar();
		//probamos si al pila esta vacia
		cola.sacar();

	}

}
