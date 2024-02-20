package conectarmysqldao;

public class Cliente {
    private int id;
    private String nif;
    private String nombre;
    private String edad;

    public Cliente(int id, String nif, String nombre, String edad) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

	//public void Cliente(int id2, String nif2, String nombre2, String edad2) {
	//	// TODO Auto-generated constructor stub
	//}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

    
}
