package modelo;

import javax.persistence.*;

@Entity
@Table(name = "tvideojuegos")
public class Juegos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjuego")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "anio")
    private Integer anio;

    @Column(name = "compania")
    private String compania;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "sinopsis")
    private String sinopsis;

    @Column(name = "plataforma")
    private String plataforma;

    // Constructor por defecto requerido por Hibernate
 
    

    // Constructor para crear un objeto de tipo Juegos con un nombre específico
   
    public Juegos(String nombre, Integer anio, 
    		String compania, Double precio, String sinopsis, String plataforma) {
		super();
		this.nombre = nombre;
		this.anio = anio;
		this.compania = compania;
		this.precio = precio;
		this.sinopsis = sinopsis;
		this.plataforma = plataforma;
	}

	// Getters y setters para los atributos
     

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	 // Método para imprimir información del objeto Juegos
    @Override
    public String toString() {
        return "Juegos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anio=" + anio +
                ", compania='" + compania + '\'' +
                ", precio=" + precio +
                ", sinopsis='" + sinopsis + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
