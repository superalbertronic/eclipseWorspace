package modelo;




import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name = "productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

    @Column(name = "nombre")
    private String nombre;
 
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "precio")
    private double precio;
    
    @Column(name = "fabricante")
    private String fabricante;
    
    @Column(name = "unidades")
    private int unidades;
    
    // Constructor por defecto requerido por Hibernate
    public Productos() {
    }

    // Constructor para crear un objeto de tipo Clientes con un nombre y una ciudad espec�ficos
    public Productos(String nombre, String descripcion,
    		double precio,String fabricante,int unidades) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fabricante = fabricante;
        this.unidades = unidades;
       
                
    }

    public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	// Getter y setter para el atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
	// M�todo para imprimir informaci�n del objeto fabricante
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
               ", descripcion='" + descripcion + '\'' +
               ", precio='" + precio + '\'' +
               ", fabricante='" + fabricante + '\'' +
               ", unidades='" + unidades + '\'' +
                '}';
    }
}
