package programacionmodular;

import java.util.Scanner;

public class ej8CombinacioneselementosProgModular {

	public static void main(String[] args) {
		System.out.println("dime el numero total(m)");
		int m=pedirDato();
			
		}
		System.out.println("dime el numero cada vez(n)");
		int n=pedirDato();
		int refinal=resultado(m,n);
		verResultado(m,n,refinal);
											}
///////////////////////////////////////////////////////////modulo que pide recoge num
	public static int pedirDato() {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		return num;					}
///////////////////////////////////////////////////////////
//Modulo que calcula el factorial
public static int calculoFactorial(int iNum) {
	int iFactorial = 1;

	for(int i=1; i <= iNum; i++){
		iFactorial = iFactorial * i;
								}
			return iFactorial;
											}
///////////////////////////////////////////////////////////modulo que hace la formula
												
	public static int resultado(int m, int n) {
		int resultado=calculoFactorial(m)/(calculoFactorial(n)*calculoFactorial(m-n));
		return resultado;
												}
///////////////////////////////////////////////////////////modulo que ense�a por pantalla lo que queda
															
	public static void verResultado(int m,int n,int refinal) {
		System.out.println("el resultado de "+m+" veces "+" pillados de  "+n+" en "+n+" es "+refinal);
	}
	
	

}
