package pelicula.datos;

import java.util.*;
import peliculas.excepciones.*;
import peliculas.domain.*;
//definimos el comportamiento
public interface AccesoDatos {
		boolean existe(String nombreRecurso) throws AccesoDatosEx;//indica la firma del metodos
		//solo definen las reglas con estas excepcion
		
		//para saber si existe el archivo 
		     List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
		 
		     //   definir el compartamieno de conexion con nuestro archivo 
		     //personalizando las acciones
		     void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscriturasDatosEx;
		    	 //definir busqueda de pelicula
		     
		     String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
		     
		     //definir el metodo de crear una archivo o recurso
		     
		     				void crear(String nombreRecurso) throws AccesoDatosEx;//En caso de problema
		     // definir el metodo de borrar
		     				
		     		void borrar(String nombreRecurso) throws AccesoDatosEx;//en caso de problemas la excepcion
		     		//utilizamos la clase padre 
		     }
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     

