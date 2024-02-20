package ejemplo;


public class Paciente extends Clinica
{
	protected String Pac_Nombre;
	protected String Pac_Apellidos;
	protected String Pac_Dni;
	protected String Pac_Fecha;
	protected String Pac_Hora;
	protected String Pac_Medico;
	
	
	public Paciente()
	{
		
	}
	 public String getPac_Nombre()
	 {
		return Pac_Nombre;
	 }
	 
	 public void setPac_Nombre(String Pac_Nombre) 
	 {
		this.Pac_Nombre = Pac_Nombre;
	 }
	 
	 public String getPac_Apellidos()
	 {
		return Pac_Apellidos;
	 }
	 
	 public void setPac_Apellidos(String Pac_Apellidos) 
	 {
		this.Pac_Apellidos = Pac_Apellidos;
	 }
	
	 public String getPac_Dni()
	 {
		return Pac_Dni;
	 }
	 
	 public void setPac_Dni(String Pac_Dni) 
	 {
		this.Pac_Dni = Pac_Dni;
	 }
	
	 public String getPac_Fecha()
	 {
		return Pac_Fecha;
	 }
	 
	 public void setPac_Fecha(String Pac_Fecha) 
	 {
		this.Pac_Fecha = Pac_Fecha;
	 }
	
	 public String getPac_Hora()
	 {
		return Pac_Hora;
	 }
	 
	 public void setPac_Hora(String Pac_Hora) 
	 {
		this.Pac_Hora = Pac_Hora;
	 }
	
	 public String getPac_Medico()
	 {
		return Pac_Medico;
	 }
	 
	 public void setPac_Medico(String Pac_Medico) 
	 {
		this.Pac_Medico = Pac_Medico;
	 }
	 
	 @Override
	 
	 public String toString() 
	 {
	 	return "D/Dª "+Pac_Nombre + " "+ Pac_Apellidos + " con Dni " + Pac_Dni + " tiene cita el "+ Pac_Fecha+" a las "+Pac_Hora+" horas, con el Doctor "+Pac_Medico;
	 }

	
}