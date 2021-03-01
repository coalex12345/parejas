package interfaz;

public class TestContacto  {

	public static void main(String[] args) 
	{
		Contacto contacto1 = new Contacto("Jose","665049301", "hola@gmail.com",20);
		System.out.println(contacto1);
		Contacto contacto2 = new Contacto("Pepe", "6567799","Hola@hotmail.com",25);
		System.out.println(contacto2.toString());
		System.out.println(contacto2);
		System.out.println(contacto1 == contacto2);
		
		if (contacto1.equals(contacto2))
			System.out.println(contacto1 + " y " + contacto2 + " son iguales");
		else
			System.out.println("No son iguales");
		
		Contacto contacto3 = new Contacto("Jose","665049301", "hola@gmail.com",20);
		if (contacto1.equals(contacto3))
			System.out.println(contacto1 + " y " + contacto3 + " son iguales");
		else
			System.out.println("No son iguales");
		///////////////////////////////////////////////////////////////////////
		System.out.println("****Ejecutando el metodo compare to******");
		if(contacto1.compareTo(contacto2) == 0)
			System.out.println("los nombres son iguales");
		else if(contacto1.compareTo(contacto2) < 0 )
			System.out.println(contacto1 + " va antes que " + contacto2);
		else
			System.out.println(contacto1 + " va despues de " + contacto2);
		////////////////////////////////////////////////////////////////////////
		if(contacto1.compareTo(contacto3) == 0)
			System.out.println("los nombres son iguales");
		else if(contacto1.compareTo(contacto3) < 0 )
			System.out.println(contacto1 + " va antes que " + contacto3);
		else
			System.out.println(contacto1 + " va despues de " + contacto3);
		///////////////////////////////////////////////////////////////////
		System.out.println("*****Ejecutando la otra version del metodo compare to***********");
		if(contacto1.compareTo(contacto2) == 0)
			System.out.println("los nombres son iguales");
		else if(contacto1.compareTo(contacto2) < 0 )
			System.out.println(contacto1 + " va antes que " + contacto2);
		else
			System.out.println(contacto1 + " va despues de " + contacto2);
		////////////////////////////////////////////////////////////
		if(contacto1.compareTo(contacto3) == 0)
			System.out.println("los nombres son iguales");
		else if(contacto1.compareTo(contacto3) < 0 )
			System.out.println(contacto1 + " va antes que " + contacto3);
		else
			System.out.println(contacto1 + " va despues de " + contacto3);
	}

}
