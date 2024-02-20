package tutorialesprogramacionya;

import prueba.ClasePadreHijo;
import prueba.Suma;

//import tutorialesprogramacionya.Sumador;
//import objetosBinarios.Empleado;
public class ImportarClase {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// TODO Esbozo de método generado automáticamente
				//Empleado emple= new Empleado();
				
				
				MetodoGetSet  s=new MetodoGetSet ();
				Potencia a=new Potencia(12, 21);
				System.out.println(a.get_potencia());
				s.setName("Alberto");
				System.out.println(s.getName());
				s.setName("Eva");
				System.out.println(s.getName());
				Sumador sumaobject=new Sumador();
		        int rs=sumaobject.suma(12,20);
		        System.out.println("la suma es "+rs);
		        
		        Suma suma1=new Suma();
		        suma1.cargar1();
		        suma1.cargar2();
		        suma1.operar();
		        suma1.mostrarResultado();  
		       
		
	}

}
