package bbdd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionOracle {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Connection conn1=null;
		Connection conn2=null;
		Connection conn3=null;
		try {
			//registramos el driver de oracle//
			Class.forName(null)	;
			String url="jdbc.oracle:thin:root/1234@localhost:1521:empresa";
			//metodo 1
			conn1=DriverManager.getConnection(url);
	
			if (conn1 !=null) {
				System.out.println("conectado con conn1");
			}
			//metodo 2
			String url2="jdbc:oracle:thin:@empresa";
			String usuario="root";
			String pass="";
			conn2=DriverManager.getConnection(url2,usuario, pass);
			if (conn2!=null) {
					
				System.out.println("conectado con conn2");
			}
			//metodo 2
			String url3="jdbc:oracle:thin:@empresa";
			Properties properties=new Properties();
			properties.put("user","root");
			properties.put("password","");
			properties.put("defaultRowPrefetch","20");
			
			
			conn3=DriverManager.getConnection(url3,properties);
			if (conn3!=null) {
					
				System.out.println("conectado con conn3");
			}
			}catch (ClassNotFoundException ex) {
					ex.printStackTrace();
			} catch (SQLException ex) {
				
					ex.printStackTrace();
			}finally {
				try {
					conn1.close();
					conn2.close();
					conn3.close();
				}catch (SQLException ex) {
					ex.printStackTrace();
				}
					
			}
	}
}		
		
 


