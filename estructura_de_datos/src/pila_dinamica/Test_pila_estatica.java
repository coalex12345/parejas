package pila_dinamica;

public class Test_pila_estatica {

	public static void main(String[] args) {
		//intanciamos una pila
		Pila_estatica pila = new Pila_estatica();
		//rellenamos la pila
		pila.rellenar();
		//probamos al condicion de error
		pila.meter('k');
		//vaciamos toda la pila
		pila.vaciar();
		//probamos si al pila esta vacia
		pila.sacar();

	}

}
