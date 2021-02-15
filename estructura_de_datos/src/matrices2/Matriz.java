package matrices2;

import java.util.Scanner;

public class Matriz {
 Scanner scan = new Scanner(System.in);
 double matrix[][]; 
 int numFilas;
 int numcolum;
 //////////////////////////////////////////

 public Matriz( int numFilas, int numcolum) {
	
	this.numFilas = numFilas;
	this.numcolum = numcolum;
	matrix = new double [numFilas] [numcolum];
}
 //////////////////////////////////////////
public Matriz() {
	
	System.out.println("Introduce el numero de filas");
	numFilas = scan.nextInt();
	System.out.println("Introduce el numero de columnas");
	numcolum=scan.nextInt();
	matrix = new double [numFilas][numcolum];
	
}
//////////////////////////////////////////


public Matriz(Matriz copia) {

	
	
			
}
//////////////////////////////////////////
public void escribeMatriz() {
	for (int fila = 0; fila <numFilas; fila++) {
		 for (int columna = 0; columna < numcolum; columna++) 
			 System.out.print(matrix[fila][columna] + "\t");
		 System.out.println();	 
 }
	}
//////////////////////////////////////////
 public void leerMatriz() {
	 System.out.println("Introduce los datos de la matriz de uno en uno y pulsando enter cada vez");
	 for (int fila = 0; fila <numFilas; fila++) {
		 for (int columna = 0; columna < numcolum; columna++) {
			 matrix [fila][columna] = scan.nextDouble();
			
		}
		
	}
 }
 /////////////////////////////////////////////////////////////
 public double sumaDiagonal() {
	 double suma = 0;
	 for (int fila = 0; fila <numFilas; fila++) {
		 for (int columna = 0; columna < numcolum; columna++) {
			 if(fila == columna) {
				 suma = suma + matrix[fila][columna];
			 }
		 }

	 }
	 return suma;
 }
	/////////////////////////////////////////////// 
 public double sumaEncima() {
	 double suma = 0;
	 for (int fila = 0; fila <numFilas; fila++) {
		 for (int columna = 0; columna < numcolum; columna++) {
			 if(fila < columna) {
				 suma = suma + matrix[fila][columna];
			 }
		 }

	 }
	 return suma;
 }
	////////////////////////// 
 public void sumaTotales()
	{
		double sumaFilas[] = new double [numFilas];
		double sumaColumnas[] = new double [numcolum];
		//////////////////////////////////////////////////////
		//suma filas
		for(int fila = 0; fila < numFilas; fila++)
		{
			sumaFilas[fila] = 0;
			
			for(int columna = 0; columna < numcolum; columna++)
			{
				sumaFilas[fila] += matrix[fila][columna];
			}
		}
		////////////////////////////////////////////
		//suma columnas
		for(int columna = 0; columna < numcolum; columna++)
		{
			sumaColumnas[columna] = 0;
			
			for(int fila = 0; fila < numFilas; fila++)
			{
				sumaColumnas[columna] += matrix[fila][columna];
			}
		}
		
		escribeMatriz();
		System.out.println("Total filas: ");
		for(int fila = 0; fila < numFilas; fila++)
		{
			System.out.println(sumaFilas [fila] + " ");
		}
		System.out.println("Total columnas: ");
		for(int columna = 0; columna < numcolum; columna++)
		{
			System.out.println(sumaColumnas[columna] + " ");
		}
		
	}
 
 }
 

