package ejemplo;

public class Clinica
{
	public static void main(String[] args) 
	{
		Paciente P=new Paciente("María","Ridruejo","33359945M","12/01/2022","15:00","Pedro Manzano");
		Medico M=new Medico("Pedro Manzano","Ginecología");
		System.out.println(P);
		System.out.println(M);

	}
}