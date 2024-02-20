package abstracta;

public class SueldosMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
        Sueldos empleado = new Empleados("Juan", "Programador", 5000.0,"enero");
        Sueldos empleado1 = new Empleados("Alberto", "Profesor", 7500.0,"febrero");
        Sueldos directivo1= new Directivos("Eva","directora",12000.0,"febrero",300.0);
        Sueldos directivo2= new Directivos("Marina","Coordinadora",11000.0,"febrero",200.0);
        Sueldos becario1= new Becario("Jose", "Esclavo becario", 0.0,"enero","enero","marzo");
        System.out.println("El Salario de " + empleado.getNombre() + " es: " + 
        empleado.calcularSalario()+" "+empleado.getMes()
        +" el irpf es "+empleado.Irpf()
        		
        		);
        System.out.println("El Salario de " + empleado1.getNombre() 
        + " es: " + empleado1.calcularSalario()+" "+empleado1.getMes()
        +" el irpf es "+empleado.Irpf()
        		);
        System.out.println("El Salario de " + directivo1.getNombre() 
        + " es: " + directivo1.calcularSalario()+" "+directivo1.getMes()
        +" el irpf es "+directivo1.Irpf()+"el incremento es "+directivo1.MostrarDividendo());
        
        System.out.println("El Salario del "+becario1.getPuesto()+ " " + becario1.getNombre() 
        + " es: " + becario1.calcularSalario()+" "+becario1.getMes()+" "+"inicio de practica "
        + ((Becario) becario1).getInicio()+" la fecha de fin "+((Becario) becario1).getFin()
            		);  
        
        
        ((Empleados) empleado).vacaciones();
        
	}

}
