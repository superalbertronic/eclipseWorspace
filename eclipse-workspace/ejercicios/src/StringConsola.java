
import javax.swing.JOptionPane;

public class StringConsola{
	
	
	public static void main(String[] args) {
		String Nombre;
	
	               
		String[][] Alumnos = {
	                              {"Federico", "14 años"},
	                              {"Rodrigo", "15 años"},
	                              {"Pedro", "20 años"},
	                              {"Federico", "18 años"},
	                              {"Pedro", "23 años"},
	                              {"Federico", "15 años"},
	                              {"Pedro", "10 años"}
	                         };
	  Nombre = JOptionPane.showInputDialog("Que alumnos Busca");
	    // System.out.println(Nombre); * DEBUG *
	
	   
	    for (int i=0; i<Alumnos.length; i++){
		//	System.out.println(Nombre);  * DEBUG *    	
	    		    	
	    	if (Alumnos[i][0].equals(Nombre)) {
	    	   	//	System.out.println(Nombre);
				System.out.println(Alumnos[i][0] + " " + Alumnos[i][1]);
				
	    	}
		}        
	}
}