package clinicaherencia;


public class ClinicaPrincipal {

	public static void main(String[] args) {
		Medicos D= new Medicos("radiologo", "Mariano Lopez");
		Pacientes P=new Pacientes ("Alejandro Briales");
		System.out.println (P+"\n"+D);
		

	}

}
