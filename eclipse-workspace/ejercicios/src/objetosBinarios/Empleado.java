package objetosBinarios;
 
import java.io.Serializable;
 
public class Empleado implements Serializable{
 
	private static final long serialVersionUID = 7833717614651250909L;
	private String nombre;
	private int antiguedad;	
	
	public Empleado(String nombre,int antiguedad){
	  	this.nombre=nombre;
	  	this.antiguedad=antiguedad;	
	}
	
	public Empleado(){
	  	this.nombre="Pedro";
	  	this.antiguedad = 0;
	}	
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setAntiguedad(int antiguedad){
		this.antiguedad=antiguedad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getAntiguedad(){
		return antiguedad;
	}	
}
 
 
