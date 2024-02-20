public class Strings {

        public static void main(String[] args) {
                 /*
                 Reamos el array para los alumnos y su edad
                 La columna [0] será el índice
                 la columna [1] el nombre y
                 la columna [2] la edad
                 */
               
                String[][] Alumnos = {
                                                                {"Federico", "14 años"},
                                                                {"Rodrigo", "15 años"},
                                                                {"Pedro", "20 años"},
                                                                {"Federico", "18 años"},
                                                                {"Pedro", "23 años"},
                                                                {"Federico", "15 años"},
                                                                {"Pedro", "10 años"}
                                                        };
                /*
                 *  Creamos un bucle que recorrerá los índices y leerá en TODOS, la columna 1
                 *  y la compara con el parámetro que elegimos, (en este caso Pedro)
                 *          
                 */
                for (int i=0; i<Alumnos.length; i++)
                {
                        if ( Alumnos[i][0] == "Pedro")
                       
                                /*
                                 * Si dentro de la columna 1, encuentra a Pedro, nos mostrará en la consola
                                 * El nombre del almuno y su edad
                                 */
                               
                                System.out.println(Alumnos[i][0] + " " + Alumnos[i][1]);
                }
        }        
}