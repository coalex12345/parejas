package programacionmodular;
//import scanner here to use it all around the code
import java.util.Scanner;
public class Ej9salarioProgModular {

	public static void main(String[] args) {
		//ask the number of workers
		//System.out.println("dime el numero de trabajadores");
		//float trabajadores=pedirDato();
		
		//ask the price/hour
		System.out.println("dime la tarifa normal, cuantos euros pagas por hora trabajada");
		float tarifaOrd=pedirDato();
		// the extra hours are paid at 1.5*normal hours
		float tarifaExtra=(float) (tarifaOrd*1.5);
		//ask the hours
		System.out.println("dime la cantidad de horas");
		float horas=pedirDato();		
		//we find how many normal ours we have
		float horasOrd=horasOrdinarias(horas);
		//we calculate how much money we earn with the ordinary hours
		float dineroHorasOrd=horasOrd*tarifaOrd;
		//we find how many extra hours
		float horasEx=horasExtra(horas);
		//we calculate how much money we earn with the extra hours
		float dineroHorasEx=(float) (tarifaExtra*horasEx);
		//we calculate how much gross money we earn
		float dineroBrutoTotal=(float) (dineroHorasOrd+dineroHorasEx);
		//System.out.println("obtenemos un sueldo bruto de "+dineroBrutoTotal);
		float dineroNetoTot=dineroImpuestos(dineroBrutoTotal);
		//taxes
		float impuestos=dineroBrutoTotal-dineroNetoTot;
		verResultado(horasOrd,tarifaOrd,dineroHorasOrd,tarifaExtra,horasEx,dineroHorasEx,dineroBrutoTotal,dineroNetoTot,impuestos);
		
		
		
											}
	//ask for any number///////////////////////////////////////////
	public static float pedirDato() {
		Scanner s=new Scanner(System.in);
		float num=s.nextFloat();
		return num;
									}
	///validate the ordinary hours/////////////////////////////
	public static float horasOrdinarias(float horas) {
		float horasOrdina=0;
		if (horas<0) 
			System.out.println("has metido horas negativas");
					
		else if(horas>=0 && horas<=38)
			horasOrdina=horas;
		else {
			horasOrdina=38;
			horas=(horas-38);
				}
		return horasOrdina;
													}
	//validate the extra hours//////////////////////////////////
	public static float horasExtra(float horas) {
		float horasOrdina=0;
		if (horas<0) 
			System.out.println("has metido horas negativas");
					
		else if(horas>=0 && horas<=38) {
			horasOrdina=horas;
			return 0;
										}
			
		else {
			horasOrdina=38;
			horas=(horas-38);
						}
		return horas;
												}
	//we get the money without any taxes///////////////////
	public static float dineroImpuestos(float dineroBrutoTotal) {
		float dinerolimpio=0;
		float dinero25=0;
		float dinero45=0;
		float dineroNetoTotal=0;
		if (dineroBrutoTotal>=0 && dineroBrutoTotal<=600) {
			dinerolimpio=dineroBrutoTotal;
			dineroNetoTotal=dinerolimpio;}
		else if(dineroBrutoTotal>600 && dineroBrutoTotal<=1200) {
			dinerolimpio=(float)(600);
			dinero25=(float)(dineroBrutoTotal-600);
			dinero25=(float)(dinero25-(dinero25*0.25));
			dineroNetoTotal=(dinerolimpio+dinero25);
																}
		else {
			dinero45=(float)(dineroBrutoTotal-1200);
			dinero45=(float)(dinero45-(dinero45*0.45));
			dinero25=(float)(600);
			dinero25=(float)(dinero25-(dinero25*0.25));
			dinerolimpio=(float)(600);
			dineroNetoTotal=(dinerolimpio+dinero25+dinero45);
			}
		return dineroNetoTotal;
																	}
	public static void verResultado(float horasOrd, float tarifaOrd,float dineroHorasOrd, float tarifaExtra, float horasEx,float dineroHorasEx, float dineroBrutoTotal, float dineroNetoTot,float impuestos){
		System.out.println("las horas normales trabajadas han sido "+horasOrd+" pagadas a un tarifa de "+tarifaOrd);
		System.out.println("la cantidad de dinero conseguido por las horas normales es de "+dineroHorasOrd);
		System.out.println("las horas extra trabajadas han sido "+horasEx+" pagadas a una tarifa de "+tarifaExtra);
		System.out.println("la cantidad de dinero conseguido por las horas extras es de "+dineroHorasEx);
		System.out.println("la cantidad total de dinero en bruto es "+dineroBrutoTotal);
		System.out.println("la cantidad total de dinero netos(ya aplicados los impuestos) es "+dineroNetoTot);
		System.out.println("has pagado "+impuestos+" euros de impuestos ");
	}

}
