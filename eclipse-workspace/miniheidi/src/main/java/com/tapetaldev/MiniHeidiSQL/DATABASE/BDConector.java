package com.tapetaldev.MiniHeidiSQL.DATABASE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.tapetaldev.MiniHeidiSQL.Main;
import com.tapetaldev.MiniHeidiSQL.FILE.WriteReadFile;

public class BDConector {
	
	
	private String jbcUrl;

	public String bdUser;
	private Connection miConexion;
	private Scanner s;
	private String bdConsult;
	
	public void fullbd() {
		File archivo = new File("archivo.properties");
		
		
		
		try (InputStream inputStream = new FileInputStream(archivo)) {
            Properties prop = new Properties();
            prop.load(inputStream);
			
            
            jbcUrl = "jdbc:mysql://" + prop.getProperty("db.url") + ":"+ prop.getProperty("db.port") + "/" +"test" + "?useSSL=false";
            System.out.println("Intentando conectar con la BBDD: " + jbcUrl);
            //Contraseña
            String usuario = prop.getProperty("db.usuario");
			//Usuario
			String contra = prop.getProperty("db.password");
			
			
				//System.out.println("Intentando conectar con la BBDD: " + jbcUrl);
				miConexion = DriverManager.getConnection(jbcUrl, usuario, contra);
				
				String consulta2 = "show databases"; //Consulta SQL a realizar 
				Statement stmt = miConexion.createStatement();
				ResultSet rs2 = stmt.executeQuery(consulta2); //Ejecucion consulta
				System.out.println("");
				while(rs2.next()) { //LISTA BASE DATOS
					System.out.println("+-------------------------+");
					System.out.println("|" + rs2.getString(1) + "|");
				}
				System.out.println("+-------------------------+");
				cerrarConexion();
		
		} catch (FileNotFoundException ex) {
        	System.out.println("\n+------------------------------------+");
            System.out.println("| No se especifico un servidor de BD |");
            System.out.println("+------------------------------------+");
            WriteReadFile file = new WriteReadFile();
        	file.notFile();
		}catch(NullPointerException ex) {
        	System.out.println("Base Datos desconocida URL");
        	
        }catch(SQLSyntaxErrorException e) {
        	System.out.println("Base Datos desconocida");
        	Main m = new Main();
        	Main.main(null);
        	
        }catch(SQLException ex){
        	
        	System.out.println("Access denied for user");
        	System.out.println("Seleccione la OP 1 del menu");
        	//ex.printStackTrace();
        }catch (IOException ex) {
            System.out.println("Error de entrada salida!");
           // ex.printStackTrace();
        }catch(Exception e) {
        	e.printStackTrace(); //Imprime por consola los errores que puede tener la conexion o la consulta a la BD
        }
		
	}
	
	
	public void conexionBD(String bdConsult) {
		
		
		File archivo = new File("archivo.properties");   
		
		   try (InputStream inputStream = new FileInputStream(archivo)) {
            Properties prop = new Properties();
            prop.load(inputStream);
            
            jbcUrl = "jdbc:mysql://" + prop.getProperty("db.url") +
            		":"+ prop.getProperty("db.port") + "/"+ bdConsult + "?useSSL=false";
            
            //Conexion a la base datos
		
			//Contraseña
			String usuario = prop.getProperty("db.usuario");
			//Usuario
			String contra = prop.getProperty("db.password");
			
			System.out.println("Intentando conectar con la BBDD: " + jbcUrl);
			
			//Paso de parametros de los String declarados a al driver de conexion
			miConexion = DriverManager.getConnection(jbcUrl, usuario, contra);
			
			System.out.println("Conexion exitosa!!! \n");
			
			consultaTablas(bdConsult);
			
	        } catch (FileNotFoundException ex) {
	        	System.out.println("\n+------------------------------------+");
	            System.out.println("| No se especifico un servidor de BD |");
	            System.out.println("+------------------------------------+");
	            WriteReadFile file = new WriteReadFile();
	        	file.notFile();
	        	
	        	//ex.printStackTrace();
	        }catch(NullPointerException ex) {
	        	System.out.println("Base Datos desconocida URL");
	        	
	        }catch(SQLSyntaxErrorException e) {
	        	System.out.println("Base Datos desconocida");
	        	Main m = new Main();
	        	Main.main(null);
	        	
	        }catch(SQLException ex){
	        	
	        	System.out.println("Access denied for user");
	        	System.out.println("Seleccione la OP 1 del menu");
	        	ex.printStackTrace();
	        }catch (IOException ex) {
	            System.out.println("Error de entrada salida!");
	           // ex.printStackTrace();
	        }catch(Exception e) {
	        	e.printStackTrace(); //Imprime por consola los errores que puede tener la conexion o la consulta a la BD
	        }
		
		
	}
	
	
	public void consultaTablas(String bdConsult) {
		
		try{

			Statement stmt = miConexion.createStatement(); //Crea un objeto para trabajar con cosultas
			
			String consulta = "SHOW FULL TABLES FROM " + bdConsult; //Consulta a realiar 
			
			ResultSet rs = stmt.executeQuery(consulta); //Ejecucion de la consulta
			
			
		    DatabaseMetaData meta = miConexion.getMetaData();
	        ResultSet rs1 = meta.getTables(bdConsult, null, null,new String[] {"TABLE"});
	        
	        while (rs1.next()){
	        	System.out.println("|" + rs1.getString("TABLE_NAME") + "|");
	        }

		}catch(Exception e) {
			e.printStackTrace(); //Imprime por consola los errores que puede tener la conexion o la consulta a la BD
		
        	System.out.println("Base Datos desconocida");
        	Main m = new Main();
        	Main.main(null);
		}
	}
	
	public void consultSelect(String tabla) {

		String consulta = "select * from " + tabla; //Consulta a realiar 
		System.out.println("Ejecutando: " + consulta);
		
		int count = 0;
		try (PreparedStatement stmt = miConexion.prepareStatement(consulta)) {
			  ResultSet rs = stmt.executeQuery();
		//MUESTRA CABECERA TABLA
			  int numColumns = rs.getMetaData().getColumnCount();
			  for(int i=1;i<= numColumns ;i++) {
	            	
	            	System.out.print(rs.getMetaData().getColumnName(i) + "\t|\t");
			  } //fin cabecera - SALTO LINEA
			  System.out.println("\n-----------------------------------------------------------------------------");
			  
			  while (rs.next()) {
				//LISTAR CAMPOS TABLA
	            for ( int i = 1 ; i <= numColumns ; i++ ) {
	       
	            	System.out.print(rs.getObject(i) + "\t|\t");
	            }//fin for i - mostrar campos tabla
	            System.out.println("\n-----------------------------------------------------------------------------");
			  }//fin while
	    
			  if (count == 0) {
		        	Main.main(null);
			  }
				

			} catch (SQLException sqle) { 
			  System.out.println("Error en la ejecución: " 
			    + sqle.getErrorCode() + " " + sqle.getMessage());
			  	Main.main(null);
			}catch(NullPointerException ex){
				System.out.println("Error consulta, no se encontro la tabla " + tabla);
				Main.main(null);
			}
	
		
		//cerrarConexion(); //Cierre de la consulta, Esto es obligatorio despues de trabajar con una BD.
	}
	
	
    //DESCONECTARSE BBDD
    public void cerrarConexion(){
        try {
        	miConexion.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

	

}
