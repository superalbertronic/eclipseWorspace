package menu1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Menu {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			byte opcion;
			
			do {
				// Menú con sus opciones:
				System.out.println("Elige una opción:"
						+ "\n\t1 - Crear carpeta."
						+ "\n\t2 - Crear fichero."
						+ "\n\t3 - Borrar fichero."
						+ "\n\t4 - Borrar carpeta."
						+ "\n\t5 - Leer fichero."
						+ "\n\t6 - Ver información de fichero."
						+ "\n\t7 - Ver información de carpeta."
						+ "\n\t8 - Salir.");
				
				opcion = Byte.parseByte(sc.nextLine());
				
				// Todo lo que creemos, aparecerá en el disco local C:
				String ruta = "C:\\";
				
				switch (opcion) {
				case 1:
					System.out.println("Introduce el nombre de la carpeta que deseas crear:");
	                String nombreCarpeta = sc.nextLine();
	                File carpeta = new File(ruta + nombreCarpeta);

	                // Creamos la carpeta usando mkdir: 
	                if (carpeta.mkdir()) {
	        			System.out.println("Carpeta '" + nombreCarpeta + "' creada.");
	        			
	        		} else {
	        			System.out.println("No se pudo crear la carpeta '" + nombreCarpeta + "'.");
	        			
	        			if (carpeta.exists()) { // Comprobamos si la carpeta ya existe.
	        				System.out.println("La carpeta '" + nombreCarpeta + "' ya existe.");
	        			}
	        		}
	                
					break;
					
				case 2:
	                System.out.println("Introduce el nombre de la carpeta:");
	                String nombreCarpetaFichero = sc.nextLine();
	                File carpetaFichero = new File(ruta + nombreCarpetaFichero);

	                // Comprobamos si la carpeta existe:
	                if (carpetaFichero.exists()) {
	                    System.out.println("Introduce el nombre del fichero:");
	                    String nombreFichero = sc.nextLine();
	                    
	                    File fichero = new File(ruta + nombreCarpetaFichero + "\\" + nombreFichero + ".txt");
	                    
	                 // Comprobamos si el fichero ya existe:
	                    if (fichero.exists()) {
	                        System.out.println("El fichero '" + nombreFichero + ".txt' ya existe.");
	                        
	                    } else {
	                    	System.out.println("¿Deseas introducir información en el fichero? "
	                    			+ "Responde Sí o No.");
	                    	String siONo = sc.nextLine();
	                    	
	                    	if (siONo.equals("Sí")) {
	                    		// Creamos un fichero e introducimos información en él:
	                    		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
	                    			System.out.println("Escribe un texto:");
	                    			String texto = sc.nextLine();
	                    			
	                    			bw.write(texto);
	 		                        bw.newLine();
	 		                        
	                    		} catch (IOException e) {
			                        System.out.println("No se ha podido escribir en el fichero");
			                    }
	                    		
	                    	} else {
	                    		try {
	                				boolean creado = fichero.createNewFile(); // Creamos un fichero vacío.

	                				// Comprobamos si el fichero se ha creado:
	                				if (creado) {
	                					System.out.println("El fichero ha sido creado con éxito.");
	                					
	                				} else {
	                					System.out.println("No se pudo crear el fichero.");
	                				}
	                				
	                			} catch (IOException e) {
	                				System.out.println("Error al crear el fichero: " + e.getMessage());
	                			}
	                    	}	
	                    }   
	                    
	                } else {
	                    System.out.println("La carpeta '" + nombreCarpetaFichero + "' no existe.");
	                }
	                
					break;
					
				case 3:
					System.out.println("Introduce el nombre de la carpeta:");
	                String nombreCarpetaBorrarFichero = sc.nextLine();
	                File carpetaBorrarFichero = new File(ruta + nombreCarpetaBorrarFichero);

	             // Comprobamos si la carpeta existe:
	                if (carpetaBorrarFichero.exists()) {
	                    System.out.println("Introduce el nombre del fichero que deseas borrar:");
	                    String nombreFicheroBorrar = sc.nextLine();
	                    File ficheroBorrar = new File(ruta + nombreCarpetaBorrarFichero + "\\" 
	                    		+ nombreFicheroBorrar + ".txt");

	                    // Comprobamos si el fichero existe y lo eliminamos:
	                    if (ficheroBorrar.exists()) {
	                        ficheroBorrar.delete();
	                        
	                        System.out.println("El fichero '" + nombreFicheroBorrar + ".txt' se ha borrado "
	                        		+ "correctamente.");
	                        
	                    } else {
	                        System.out.println("El fichero '" + nombreFicheroBorrar + ".txt' no existe.");
	                    }
	                    
	                } else {
	                    System.out.println("La carpeta '" + nombreCarpetaBorrarFichero + "' no existe.");
	                }
					
					break;
					
				case 4:
					System.out.println("Introduce el nombre de la carpeta a borrar:");
	                String nombreCarpetaBorrar = sc.nextLine();
	                File carpetaBorrar = new File(ruta + nombreCarpetaBorrar);

	             // Comprobamos si la carpeta existe y la eliminamos junto con todo su contenido:
	                if (carpetaBorrar.exists()) {
	        			FileUtils.deleteDirectory(carpetaBorrar);
	        			
	        			System.out.println("La carpeta '" + nombreCarpetaBorrar + "' se ha borrado "
	        					+ "correctamente.");
	        			
	        		} else {
	        			System.out.println("Las carpeta '" + nombreCarpetaBorrar + "' no existe.");
	        		}
					
					break;
					
				case 5:
					 System.out.println("Introduce el nombre de la carpeta:");
	                 String nombreCarpetaLeer = sc.nextLine();
	                 File carpetaLeer = new File(ruta + nombreCarpetaLeer);

	              // Comprobamos si la carpeta existe:
	                 if (carpetaLeer.exists()) {
	                     System.out.println("Introduce el nombre del fichero a leer:");
	                     String nombreFicheroLeer = sc.nextLine();
	                     File ficheroLeer = new File(ruta + nombreCarpetaLeer + "\\" + nombreFicheroLeer 
	                    		 + ".txt");

	                     // Comprobamos si el fichero existe y leemos su información:
	                     if (ficheroLeer.exists()) {
	                         try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
	                             String linea;
	                             
	                             while ((linea = br.readLine()) != null) {
	                                 System.out.println(linea);
	                             }    
	                             
	                         } catch (IOException e) {
	                             System.out.println("No se puede leer el fichero.");
	                         }  
	                         
	                     } else {
	                         System.out.println("El fichero '" + nombreFicheroLeer + ".txt' no existe en "
	                         		+ "la carpeta.");
	                     }
	                     
	                 } else {
	                     System.out.println("La carpeta '" + nombreCarpetaLeer + "' no existe.");
	                 }
					
					break;
				
				case 6:
					System.out.println("Introduce el nombre de la carpeta:");
	                String nombreCarpetaFicheroInfo = sc.nextLine();
	                File carpetaFicheroInfo = new File(ruta + nombreCarpetaFicheroInfo);
	                
	                // Comprobamos si la carpeta existe:
	                if (carpetaFicheroInfo.exists()) {
	                	System.out.println("Introduce el nombre del fichero cuya información deseas saber:");
	                    String nombreFicheroInfo = sc.nextLine();
	                    File ficheroInfo = new File(ruta + nombreCarpetaFicheroInfo + "\\" + nombreFicheroInfo
	                    		+ ".txt");
	                    
	                 // Comprobamos si el fichero existe y mostramos su información:
	                    if (ficheroInfo.exists()) {
	                    	System.out.println("Nombre del directorio: " + ficheroInfo.getName());
		        			System.out.println("Ruta: " + ficheroInfo.getPath());
		        			System.out.println("Ruta absoluta: " + ficheroInfo.getAbsolutePath());
		        			System.out.println("Lectura: " + ficheroInfo.canRead());
		        			System.out.println("Escritura: " + ficheroInfo.canWrite());
		        			System.out.println("Tamaño: " + ficheroInfo.length() + " Kb");
		        			System.out.println("Directorio: " + ficheroInfo.isDirectory());
		        			System.out.println("Fichero: " + ficheroInfo.isFile());
		        			System.out.println("Nombre del directorio padre: " + ficheroInfo.getParent());
		        			break;
		        			
	                    } else {
	                    	System.out.println("El fichero '" + nombreFicheroInfo + "' no existe en la carpeta.");
	                    	break;
	                    }
	                    
	                } else {
	                	System.out.println("La carpeta '" + nombreCarpetaFicheroInfo + "' no existe.");
	                	break;
	                }
				
				case 7:
					System.out.println("Introduce el nombre de la carpeta cuya información deseas saber:");
	                String nombreCarpetaInfo = sc.nextLine();
	                File carpetaInfo = new File(ruta + nombreCarpetaInfo);
	                
	                // Comprobamos si la carpeta existe y mostramos su información:
	                if (carpetaInfo.exists()) {
	        			System.out.println("Nombre del directorio: " + carpetaInfo.getName());
	        			System.out.println("Ruta: " + carpetaInfo.getPath());
	        			System.out.println("Ruta absoluta: " + carpetaInfo.getAbsolutePath());
	        			System.out.println("Lectura: " + carpetaInfo.canRead());
	        			System.out.println("Escritura: " + carpetaInfo.canWrite());
	        			System.out.println("Tamaño: " + carpetaInfo.length() + " Kb");
	        			System.out.println("Directorio: " + carpetaInfo.isDirectory());
	        			System.out.println("Fichero: " + carpetaInfo.isFile());
	        			System.out.println("Nombre del directorio padre: " + carpetaInfo.getParent());
	        			
	        		} else {
	        			System.out.println("La carpeta '" + nombreCarpetaInfo + "' no existe.");
	        		}
					
					break;
				
				case 8:
					System.out.println("Saliendo del programa... ¡Hasta pronto!");
					break;
					
				default:
					System.out.println("Opción no válida.");
					break;
				}
						
			} while (opcion != 8); // Si la opción elegida no es 8, el programa seguirá ejecutándose en bucle.
			
			sc.close();
			
		} catch (IOException e) {
            System.out.println("Error en la operación.");
        }
	}
}