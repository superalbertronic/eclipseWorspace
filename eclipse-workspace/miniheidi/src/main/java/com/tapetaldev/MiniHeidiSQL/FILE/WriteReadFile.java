package com.tapetaldev.MiniHeidiSQL.FILE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;

import com.tapetaldev.MiniHeidiSQL.Main;
import com.tapetaldev.MiniHeidiSQL.DATABASE.DatosBD;

public class WriteReadFile {
	
	private String url;
	private String port;
	private String bdUser;
	private String usuario;
	private String pass;
	private Scanner s;
	
	public void WriteFileFull() {
		
		s = new Scanner(System.in);
		DatosBD datos = new DatosBD();
	
        System.out.print("Introduce el SERVIDOR(localhost): ");
		url = s.nextLine();

		System.out.print("Introduce el Puerto(3306): ");
		datos.setPort(port = s.nextLine());

		System.out.print("Introduce el Usuario(root): ");
		datos.setUsuario(usuario = s.nextLine());

		System.out.print("Introduce el contraseña: ");
		datos.setContra(pass = s.nextLine());
		
		
		File archivo = new File("archivo.properties");
		
		try {
			
			try(OutputStream outputStream = new FileOutputStream(archivo)){
				
				Properties prop = new Properties();
				
				 prop.setProperty("db.url", url);
				 prop.setProperty("db.port", port);
	             prop.setProperty("db.usuario", usuario);
	             prop.setProperty("db.password", pass);
	             prop.store(outputStream, "Config");
			}
			
		} catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado!");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error de entrada salida!");
            ex.printStackTrace();
        }
	}
	
	public void writeFile() {
		s = new Scanner(System.in);
		DatosBD datos = new DatosBD();
		File archivo = new File("archivo.properties");
		
		System.out.print("¿Que deseas modificar?");
		System.out.print("");
		System.out.print("\n1. URL - Servidor");
		System.out.print("\n2. Port");
		System.out.print("\n3. Usuario");
		System.out.print("\n4. Password.");
		System.out.print("\n5. Todo.");
		System.out.print("\n6. Salir.");
		System.out.print("\nOpcion: ");
		int op = s.nextInt();
		
		switch (op) {
		case 1:
			System.out.print("Introduce el SERVIDOR(localhost): ");
			url = s.next();
			try {
				
				try(OutputStream outputStream = new FileOutputStream(archivo)){
					
					Properties prop = new Properties();
					 prop.setProperty("db.url", url);
					 prop.getProperty("db.port");
					 prop.getProperty("db.usuario");
					 prop.getProperty("db.password");
		             prop.store(outputStream, "Config");
				}
				
			} catch (FileNotFoundException ex) {
	            System.out.println("Archivo no encontrado!");
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            System.out.println("Error de entrada salida!");
	            ex.printStackTrace();
	        }
			break;
			
		case 2:	
			System.out.print("Introduce el Puerto(3306): ");
			datos.setPort(port = s.next());
			try {
				
				try(OutputStream outputStream = new FileOutputStream(archivo)){
					
					Properties prop = new Properties();
					prop.setProperty("db.port", port);
		            prop.store(outputStream, "Config");
				}
				
			} catch (FileNotFoundException ex) {
	            System.out.println("Archivo no encontrado!");
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            System.out.println("Error de entrada salida!");
	            ex.printStackTrace();
	        }
			break;
			
		case 3:	
			System.out.print("Introduce el Usuario(root): ");
			datos.setUsuario(usuario = s.next());
			try {
				
				try(OutputStream outputStream = new FileOutputStream(archivo)){
					
					Properties prop = new Properties();
					prop.setProperty("db.usuario", usuario);
		            prop.store(outputStream, "Config");
				}
				
			} catch (FileNotFoundException ex) {
	            System.out.println("Archivo no encontrado!");
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            System.out.println("Error de entrada salida!");
	            ex.printStackTrace();
	        }
			break;
			
		case 4:	
			System.out.print("Introduce el contraseña: ");
			datos.setContra(pass = s.next());
			try {
				
				try(OutputStream outputStream = new FileOutputStream(archivo)){
					
					Properties prop = new Properties();
					prop.setProperty("db.password", pass);
		            prop.store(outputStream, "Config");
				}
				
			} catch (FileNotFoundException ex) {
	            System.out.println("Archivo no encontrado!");
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            System.out.println("Error de entrada salida!");
	            ex.printStackTrace();
	        }
			break;
			
		case 5:	
			WriteFileFull();
			break;
		case 6:	
			Main.main(null);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
		        


	}
	
	public void readFile() {
		
		File archivo = new File("archivo.properties");   
		
		   try (InputStream inputStream = new FileInputStream(archivo)) {
               Properties prop = new Properties();
               prop.load(inputStream);
               System.out.println("\n\nDatos de Conexion");
               // get value by key
              
               System.out.println("+---------+--------------+");
               System.out.println("|URL      | " + prop.getProperty("db.url") + "\t |");
               System.out.println("+---------+--------------+");
               System.out.println("|Port     | " + prop.getProperty("db.port") + "\t |");
               System.out.println("+---------+--------------+");
               System.out.println("|Usuario  | " + prop.getProperty("db.usuario") + "\t |");
               System.out.println("+---------+--------------+");
               System.out.println("|Password | " + prop.getProperty("db.password") + "\t |");
               System.out.println("+---------+--------------+\n");
               
               
               
	        } catch (FileNotFoundException ex) {
	        	System.out.println("+-----------------------+");
	            System.out.println("| Archivo no encontrado |");
	            System.out.println("+-----------------------+");
	            notFile();
	            //ex.printStackTrace(); //Imprime la excepción con toda la informacion
	        } catch (IOException ex) {
	            System.out.println("Error de entrada salida!");
	            ex.printStackTrace();
	        }
	}
	
	public void notFile() {
		s = new Scanner(System.in);
		System.out.print("¿Deseas crear uno para continuar?(Y or N): ");
    	String op = s.next();
    	if(op.equals("Y") || op.equals("y") ) {
    		writeFile();
    	}else {
    		Main.main(null);
    	}
	}

	
 
}