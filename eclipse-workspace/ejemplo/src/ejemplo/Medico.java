package ejemplo;

public class Medico extends Clinica
{
	protected String Medico;
	protected String Departamento;
	
	public Medico()
	{
		
	}
	 public String getMedico()
	 {
		return Medico;
	 }
	 
	 public void setMedico(String Medico) 
	 {
		this.Medico = Medico;
	 }

	 public String getDepartamento()
	 {
		return Departamento;
	 }
	 
	 public void setDepartamento(String Departamento) 
	 {
		this.Departamento = Departamento;
	 }

 @Override
	 
	 public String toString() 
	 {
	 	return "D/Dª "+Medico + " del Área de "+Departamento;
	 }


}
