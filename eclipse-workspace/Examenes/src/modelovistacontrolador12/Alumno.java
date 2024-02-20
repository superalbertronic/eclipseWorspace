package modelovistacontrolador12;
import java.time.LocalDate;
import java.util.Date;
/**
 * Clase Alumno 
 * @author javid
 *
 */
public class Alumno {
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fechanacimiento;
	private String esrepetidor;
	private String telefono;

	
// Constructor Alumno
	public Alumno(int id, String nombre, String apellido1, String apellido2, String fechanacimiento, String esrepetidor,
			String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechanacimiento = fechanacimiento;
		this.esrepetidor = esrepetidor;
		this.telefono = telefono;
	}

	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}
	

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public String getEsrepetidor() {
		return esrepetidor;
	}

	public String getTelefono() {
		return telefono;
	}

}
