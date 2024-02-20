package objetos;
import java.util.ArrayList;
import java.util.Arrays;
public class PruebaLibroMetodoConstructor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Libro[] listaLibro = new Libro[3];
		listaLibro[0]=new Libro();
		listaLibro[1]=new Libro();
		listaLibro[2]=new Libro();
		
		String []autores={"Tolkien","Cervantes","Shakespeare"};
		String []titulos={"El Hobbit","Quijote","Hamlet"};
		String []isbn={"1","2","3"};
		int []paginas={200,1500,180};

		for (int i=0;i<listaLibro.length;i++ ) {
					listaLibro[i].autor=autores[i];
					listaLibro[i].titulo=titulos[i];
					listaLibro[i].isbn=isbn[i];
					listaLibro[i].numeroDePaginas=paginas[i];			
				}

		for (int i=0;i<listaLibro.length;i++ ) {
			System.out.println("Autor: "+listaLibro[i].autor
					+ " libro "+listaLibro[i].titulo+ " isbn "+listaLibro[i].isbn
					+ " NºPag "+listaLibro[i].numeroDePaginas
					);			
		}	
	}

}
