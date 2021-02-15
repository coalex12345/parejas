package agenda;
import java.util.Scanner;
/**
 * esta aplicacion lleva a cabo una gestionde una agenda de contactos
 * @author alumnob
 *fecha: 01-01-2021
 */
public class Agenda {

/**
 * atributos o propiedades que tiene la agenda
 */
	
	Contacto contactos[];
	int numEle;
	
	/**
	 * constructor
	 */
	
	public Agenda(){
		
		numEle = 0;
		contactos = new Contacto [numEle];
		 
	}
	/**
	 * este metodo va a paedir espacio apra guadar un elemento mas en al agenda
	 */
	private void UnElementoMas(Contacto aux[]) {
		
		//pedimos espacio para un elementos mas
		
		contactos = new Contacto [numEle +1];
		
		//recorremos el array auxiliar y copiamos la informacion en el nuevo array de contactos
		
		for (int i = 0; i < numEle; i++) {
			contactos[i] = aux[i];
		}
		//actualizamos el numero de elementos
		numEle++;
	}

	/**
	 * inserta el contacto en una posicion valida
	 * @param posicion
	 * @param contacto
	 */
	
	public void insertar(int posicion ,Contacto contacto) {
		if (posicion >=0 && posicion < numEle) {
			contactos[posicion] = contacto;
		}
		System.out.println("posicion no valida");
	}
	
	/**
	 * este metodo va a pedi emmeoria para un elemento menos. copia en el array nuevo todos los elementos
	 * excepto aquel que haya sido marcado para eliminarlo
	 */
	
	private void UnElementoMenos(Contacto aux[]) {
		contactos = new Contacto[numEle -1];
		
		//copiamos en contactos todos aquellis elementos que no esten marcados
		//posicion donde guardo arrayd estino
		int j=0;
		for (int i = 0; i < numEle; i++) {
			if (aux[i] != null) {
				contactos[j] = aux[i];
				j++;
			}
				
		}numEle--;
		
		}
	/**
	 * metodo añadir contacto en la ultima posicion del array
	 */
	
	public void anadir (Contacto contacto) {
		UnElementoMas(contactos);
		insertar(numEle-1,contacto);
	}
	
	/**
	 * marcar recibe la posicion donde esta el elemento que quiero eliminar 
	 * lo marca almacenando un null en esa posicion y a continuacion
	 * invoca a UnElementoMenos
	 */
	
	public void marcar (int posicion) {
		contactos[posicion] = null;
		UnElementoMenos(contactos);
	}
	
	/**
	 * busca el contacto en la agenda por el nombre
	 * si la encuentra devuelve su posicion
	 * en caso contratio -1
	 */
	
	public int buscar(String nombre) {
		for (int i = 0; i<= numEle; i++) {
			if (nombre.equals(contactos[i].getNombre())){
				return i;
			}
		}
		return -1;
		
		
	}
	/**
	 * introduce por teclado lsod atos de un nuevo contacto y retorna su referencia
	 * @return
	 */
	public Contacto introDatos() {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce el nombre");
		String nombre = s.nextLine();
		System.out.println("introduce el telefono");
		String telefono = s.next();
		System.out.println("introduce el email");
		String email = s.nextLine();
		Contacto contacto = new Contacto (nombre,telefono,email);
		return contacto;
	}
	
	/**
	 * añade nuevo contacto a la agenda
	 */
	
	public void nuevoContacto() {
		Contacto contacto = introDatos();
		int pos = buscar(contacto.getNombre());
		boolean existe = (pos != -1);
		if (existe) {
			System.out.println("este contacto ya existe en la agenda");
		}
		anadir(contacto);
	}
	
	
	/**
	 * pedimos por teclado un nombre y para poder hacer consultas,eliminaciones,modificaciones
	 */
	
	public String pedirNombre() {
		Scanner s = new Scanner(System.in);
		System.out.println("dime el nombre");
		return s.nextLine();
	}
	/**
	 * elimina un contacto de la agenda
	 */
	
	public void eliminarContacto() {
		String nombre = pedirNombre();
		//buscamos si el contacto esta en la agenda
		int pos = buscar(nombre);
		boolean existe = (pos != -1);
		if (existe) {
			//si existe marcamos el elemento que queremos eliminar
			marcar(pos);
		}System.out.println("el contacto no existe");
		
	}
	
	public void consultarContacto() {
		String nombre = pedirNombre();
		int pos = buscar(nombre);
		boolean existe = (pos != -1);
		if (existe) {
			//visualizamos en pantalla la informcion del contacto
			System.out.println(contactos[pos]);
		}
		
	}
	
	/**
	 * ordena la agenda por el nombre alfabeticamente
	 */
	public void ordenar() {
		//tengo que recorrer el array y comparamos elementos adyacentes
		boolean hayIntercambio;
		do {
		hayIntercambio = false;
		for (int i = 0; i< numEle-1;i++) {
			
			if (contactos[i].getNombre().compareTo(contactos[i+1].getNombre()) > 0) {
				
				//intercambiamos los elementos
				Contacto aux;
				aux = contactos[i];
				contactos[i]=contactos[i+1];
				contactos[i+1] = aux;
				hayIntercambio = true;
			}
		}
		}while(hayIntercambio);
		
	}
	/**
	 * muestra la genda ordenada por orden alfabetico
	 */
	
	public void mostrarAgenda() {
		//ordenamso la agenda alfabeticamente
		ordenar();
		//visualizamos el contenido del array
		System.out.println();
		for(int i =0;i<numEle;i++) {
			System.out.println(contactos[i]);
		}
	}
	
}
