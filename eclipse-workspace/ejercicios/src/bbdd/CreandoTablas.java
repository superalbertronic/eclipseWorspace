

public void crecionBaseDeDatos() throws Exception {  	
	Connection conn = null;  	
	Statement stmt = null;  	
	try { 
}
 	 	conn=conector.conector();
 	 	stmt=conn.createStatement();
 	 	String sql = "CREATE TABLE clientes" +
 	 			"id INT PRIMARY KEY AUTO:INCREMENT;"+
 	 			"  nif VARCHAR(50) NOT NULL," + 
 	 			"  nombre VARCHAR(50) NOT NULL," + 
 	 			");";  	 	 
	 	
 	 	
 	 	stmt.executeUpdate(sql); 
}catch(SQLException se){ 
//Gestionamos los posibles errores que puedan surgir durante la ejecucion de la insercion 
 	 	se.printStackTrace();  	}catch(Exception e){ 
 	 	//Gestionamos los posibles errores  	 	e.printStackTrace();  	 	}finally{ 
	 	 	 	//Paso 5. Cerrar el objeto en uso y la conexión 
 	 	 	stmt.close();  	 	 	conn.close(); 
 	 	} 
 	}
}
 	 	
