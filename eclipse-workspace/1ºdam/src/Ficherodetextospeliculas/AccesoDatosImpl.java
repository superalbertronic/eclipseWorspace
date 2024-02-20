package Ficherodetextospeliculas;

import java.io.*;
import java.util.*;

import peliculas.domain.*;
import peliculas.excepciones.*;


public class AccesoDatosImpl  implements AccesoDatos {

	@Override
	public boolean existe(String nombreRecurso) {
		var archivo= new File(nombreRecurso);
		return archivo.exists();
		}
	
	@Override
	public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
		  var archivo= new File(nombreRecurso);
		  List<Pelicula> peliculas = new ArrayList();
		  try {
			var entrada= new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			while(linea != null) {
				var pelicula = new Pelicula(linea);
				peliculas.add(pelicula);
				linea = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw new LecturaDatosEx("Excepcion al listar Peliculas: " + ex.getMessage());
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			throw new LecturaDatosEx("Excepcion al listar Peliculas: " + ex.getMessage());
		}
		  return peliculas;
	}
	
	@Override
	public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscriturasDatosEx {
					var archivo = new File(nombreRecurso);
					try {
					var salida = new PrintWriter(new FileWriter(archivo, anexar));
					salida.println(pelicula.toString());
					salida.close();
					System.out.println("Se ha escrito informacion al archivo: " + pelicula);
					} catch (IOException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
						throw new EscriturasDatosEx("Excepcion al escribir Peliculas: " + ex.getMessage());
						}
	}
	
	@Override
	public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
		
			var archivo= new File(nombreRecurso); //se especifica el nombre del archivo
			String resultado = null; //almacenar el resultado ,indicando el indice de la pelicula y nombre de la pelicula encontrada
			try {
				var entrada = new BufferedReader(new FileReader(archivo));
				String linea = null;  //Almacenar cada linea que vamos a leer
				linea = entrada.readLine(); //Hacemos un ciclo while para preguntar si esta linea es diferente de null
				var indice =  1;  //El indice empieza desde el uno y no desde cero
				
				while (linea != null) {
					if (buscar != null && buscar.equalsIgnoreCase(linea)) {
						resultado = "Pelicula " + linea + " encontrada en el indice  " + indice;
						break;
					}
					//si la busquedad no coincide
					
					linea = entrada.readLine();
					indice ++;
				}
				} catch (FileNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				throw new LecturaDatosEx("Excepcion al buscar Peliculas: " + ex.getMessage());
			}catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				throw new LecturaDatosEx("Excepcion al buscar Peliculas: " + ex.getMessage());
				}
			
			return resultado;//sino se encuentra se devuelve la variable resultado, al final
	}
	@Override
	public void crear(String nombreRecurso) throws AccesoDatosEx {
	     var archivo= new File(nombreRecurso);
	     try {
			var salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo");
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			throw new AccesoDatosEx("Excepcion al crear archivo: " + ex.getMessage());
		}
	     
		
	}
	@Override
	public void borrar(String nombreRecurso)  {
	     var archivo= new File(nombreRecurso);
	     if(archivo.exists())
	     archivo.delete();
	     
	     System.out.println("Se ha borrado el archivo");

		}
}
