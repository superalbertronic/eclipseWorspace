package rentasimple;

public class RentaSimple {
	public static void main(String arg[]) { 
	double capital = 500.0;
	double interés =6.25;
	double rentaSimple;
	rentaSimple=capital*interés/100 ;
	capital +=rentaSimple;
	System.out.println("El capital es "+capital);
	System.out.println("El empleado es "+rentaSimple);
	}
}