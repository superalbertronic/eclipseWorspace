
import java.util.Random;

public class ArrayAle {

	public static void main(String[] args) {
		// Crear un array de arrays por partes(Matematicamente no es correcto decir que una estructura que contiene
		//diferentes números de columnas en cada fila sea una matriz porque en mátematicas el número de filas y columnas por
		// cada fila es fija es decir tiene el mismo número de elementos por tanto una matriz puede ser cuadrada o rectangular
		// pero no deforme jeje)
		int [][] arreglo = new int [4][];//definimos un array de dos dimensiones y solo especificamos los elementos que contendra la primera dimension que para nosotros visualmente representan las filas
		
		// esta clase que se encuentra en el paquete java.util sirve para generar números aleatorios de forma comoda ya
		// que cuenta con muchos métodos que son útiles para tal proposito
		Random aleatorio=new Random();
		
		for(int i = 0;i<arreglo.length;i++) {
			// la fila i debera contener un array y para hacerlo interesante vamos asignarle un array de una dimension
			// aleatoria hay que tener en cuenta que nextInt devolvera un valor entre 0 y 9 porque el 10 no se incluye
			// por eso le sumo 1 porque asi obtengo 0+1 y 9+1 que es un valor entre 1 y 10 que era mi objetivo por cierto
			// los elementos de este array seran visualmente las columnas de su fila correspondiente
			arreglo[i]=new int[aleatorio.nextInt(10)+1];
			
			// creamos un for para recorrer las columnas de la fila donde nos encontremos y darle valores aleatorio
			for(int j=0;j<arreglo[i].length;j++) {
				arreglo[i][j]=aleatorio.nextInt(100)+1;
			}
		}
		
		System.out.println("Ejemplo 1");
		
		//por comodidad nos vamos a crear un metodo auxiliar que no muestre el contenido de nuestro arreglo por si nos
		// da por crear varias pruebas poder tener una funcion que nos sirva para usarlo con todos los arreglo que 
		// modifiquemos sin tener que escribir veinte mil veces el mismo codigo para mostrar el contenido.
		mostrar(arreglo);
		
		// vamos hacer otro ejemplo donde voy a definir la dimension de las columnas de cada fila en la declaracion
		// del arreglo establecioendo los valores de dichas columnas directamente 
		int [][] arreglo2 = new int [][] {
			new int[] {1},
			new int[]{1,2},
			new int[]{1,2,3},
			new int[]{1,2,3,4}
			};
			
		System.out.println("\nEjemplo 2");
			
		// vamos a mostrarlo por pantalla pero antes imprimimos un salto de linea para que no se quede pegado al anterior arreglo que mostramos
		System.out.println();
		mostrar(arreglo2);
		
		// vamos a ver otro ejemplo en este caso vamos a definir la dimension de cada columna de una fila de forma fija para despues darle valores recorriendolo
		// en un bucle for, ten en cuenta que al definir las columnas se creara con el numero de elementos que le indiques y cada uno de esos elementos
		// contendra por defecto el valor 0. Nota: forma fija significa que fijamos con un valor el numero de elementos que queremos en nuestro array en este
		// caso el array seria las columnas de cada fila
		int [][] arreglo3 = new int [][] {
			new int[1],
			new int[2],
			new int[3],
			new int[4]
			};
			
			System.out.println("\nEjemplo 3");
			
			// para que veais que realmente contiene el valor 0 en cada elemento vamos a llamar a nuestro metodo auxiliar para que lo muestre y comprobarlo
			System.out.println();
			mostrar(arreglo3);
			
			//ahora le vamos a dar valores y vamos a construir el mismo que en el ejemplo anterior
			for(int i = 0; i<arreglo3.length;i++) {
				for(int j=0;j<arreglo3[i].length;j++) {
					// como j empieza por 0 y va a llegar hasta numero de columnas menos 1 es decir que si hay 2 columnas llega hasta 2-1 que es 1 ya la posicion
					// 2 no existiria por de 0 a 1 ya hay dos elementos por tanto si le sumo a la j el valor 1 obtengo su posicion en caso de que empezara 1 y no en 0
					// que coincide con los valores que puse en el ejemplo anterior
					arreglo3[i][j]=j+1;
				}
			}
			
			System.out.println("\nCambiamos los valores recorriendo la matrix para que coincida con los valores del ejemplo anterior");
			// mostramos el contenido
			System.out.println();
			mostrar(arreglo3);
			
		// El ultimo ejemplo es el mas sencillo y ya lo conoceis que es crear el arreglo espicificando sus elementos y
		// valores de forma manual
		int [][] arreglo4 = {{1},{1,2},{1,2,3},{1,2,3,4}};
		
		System.out.println("\nEjemplo 4");
		System.out.println();
		mostrar(arreglo4);
		
		// Tambien puedes hacer esto que seria lo mismo pero tiene una pequeña diferencia y es que el ejemplo anterior
		// se ha de hacer en el momento de declarar el arreglo lo que quiere decir que si tu declaras el arreglo pero no
		// inicializas como lo hacemos en el ejemplo anterior en la misma declaracion te dara un error en cambio esta
		// forma hace lo mismo y lo puedes usar despues de declarar el arreglo en cualquier momenteo incluso para machacar
		// su contenido
		int [][] arreglo5 = new int[][]{{1},{1,2},{1,2,3},{1,2,3,4}};
		
		System.out.println("\nEjemplo 5");
		System.out.println();
		mostrar(arreglo5);
		
		// ahora vamos a machacar su contenido con esta forma de crear el arreglo
		arreglo5=new int[][]{{1},{2,1},{3,2,1}};
		
		System.out.println("\nMachacamos el contenido por otra matriz usando la misma forma de crear matrices de este mismo ejemplo");
		System.out.println();
		mostrar(arreglo5);
		
		// esta forma de machacar funciona porque hemos puesto int[][] pero si lo hubieramos omitido como en el
		// ejemplo anterior habria dado error porque esa forma solo es valida cuando se declara el arreglo.
		// Con esto cubrimos algunos ejemplos porque existen muchas formas mas siemple se puede inovar asi que 
		// no te rayes aprende solo las que te interese y descarta el resto
		
	}
	
	public static void mostrar(int [][]arreglo) {
		for(int i=0;i<arreglo.length;i++) {
			for(int j=0;j<arreglo[i].length;j++) {
				System.out.print(arreglo[i][j]+" ");
			}
			System.out.println();
		}
	}

}
