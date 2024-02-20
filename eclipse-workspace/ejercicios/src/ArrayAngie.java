public class ArrayAngie {

        public static void main(String[] args) {

                char[][] letras = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' } };

                System.out.println("En el array letras :");
                System.out.println("------------------");
               
                for (int i = 0; i < letras.length; i++) {
                       
                        System.out.println();
                        System.out.println("Fila:" + i);
                       
                        for (int j = 0; j < letras[i].length; j++) {
                                System.out.println("Columna: " + j + " El valor es: " + letras[i][j]);
                        }
                }
        }
}