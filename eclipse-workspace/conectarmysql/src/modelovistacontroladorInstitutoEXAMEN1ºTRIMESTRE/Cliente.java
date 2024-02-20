package modelovistacontroladorInstitutoEXAMEN1ºTRIMESTRE;

import java.sql.Date;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fecha_nacimiento;
    private String es_repetidor;
    private String telefono;
    
    public Cliente(int id, String nombre,String apellido1,String apellido2,Date fecha_nacimiento,String es_repetidor,String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.fecha_nacimiento=fecha_nacimiento;
        this.es_repetidor=es_repetidor;
        this.telefono=telefono;
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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public String getEs_repetidor() {
		return es_repetidor;
	}

	public String getTeléfono() {
		return telefono;
	}

   
}
