package bbdd;



import java.sql.*;  //RECUERDA TENER EL DRIVER INSTALADO, mysql-connector-java-x.x.xx.jar PREVIAMENTE


// https://downloads.mysql.com/archives/get/p/3/file/mysql-connector-java-8.0.27.zip


/*
 * RECUERDA ABRIR XAMPP!!!! Y ENCENDER EL SERVIDOR MYSQL!!!! NO ES NECESARIO ENCENDER APACHE(UNICAMENTE SI USAS PHPMYADMIN)
 * 
 * SI TE DA UN ERROR "Communications link failure" ES MUY PROBABLE DE QUE TENGA EL SERVIDOR APAGADO. O ALGUN DATO ESTE MAL EN LA 
 * CONEXION A LA BD
 */

public class EmpresaMain {
	
	
	
	public static void main(String[] args) {
		
		//Conexion a la base datos
		String jbcUrl = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
		//Contraseña
		String usuario = "root";
		//Usuario
		String contra = "";
		
		
		try {
			System.out.println("Intentando conectar con la BBDD: " + jbcUrl);
			
			//Paso de parametros de los String declarados a al driver de conexion
			Connection miConexion = DriverManager.getConnection(jbcUrl, usuario, contra);
			
			System.out.println("Conexion exitosa!!! \n");
			

			Statement stmt = miConexion.createStatement(); //Crea un objeto para trabajar con cosultas
			
			String consulta = "select * from emple"; //Consulta a realiar 
			
			ResultSet rs = stmt.executeQuery(consulta); //Ejecucion de la consulta
			
			int i;
			
			while(rs.next()) { //Bucle de para que recorra toda las filas de la tabla a consultar.
			
				System.out.println(
						rs.getInt(1) + " | " + 
					    rs.getString(2) + " | " + 
						rs.getString(3) + " | " + 
					    rs.getInt(4) + " | " + 
					    rs.getString(5) + " | " + 
					    rs.getInt(6) + " | " + 
						rs.getInt(7) + " | " + 
					    rs.getInt(8)
						
						);
			}
				
			
			miConexion.close(); //Cierre de la consulta, Esto es obligatorio despues de trabajar con una BD.
			
		}catch(Exception e) {
			e.printStackTrace(); //Imprime por consola los errores que puede tener la conexion o la consulta a la BD
		}
		
		
	}

}
