package arrayejerciciosobligatorios;

import java.util.Arrays;
public class Array1 {

	public static void main (String[] args) {
		int index=0;
		String[] datos = {"Entorno de desarrollo", "Programacion", "Base de datos","Sistemas informaticos"};
		String [] asistencia= new String [3];
		asistencia[0]="buena";
		asistencia[1]="mala";
		asistencia[2]="NO VIENEN NUNCA";
		
		String [][] paises= {{"España","Madrid"},{"Egipto","El Cairo"},
				{"Marruecos","Rabat"}};
		
		for (int i=0;i<asistencia.length;i++ ) {
			System.out.println(asistencia[i]);
			
		}
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.print( " "+ paises[i][j]);
				
			}
			
			
		}
		
		
		
		int[] notas = {10,9,8,7};
		index = Arrays.asList(datos).indexOf("Programacion");
		
		if (index>=0) {
		
			for (int i=0; i<datos.length;i++) {
				if (index==i) {
				//	System.out.println("La nota es "+notas[i]);
				}
			}
			
			
		} else {
			System.out.println("no encontrada la asignatura ");
		}

	}
	}
