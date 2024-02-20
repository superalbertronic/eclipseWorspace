package alumnos;

//Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos segun la tabla que se muestra a continuacion. Muestra el contenido de todos los elementos del array.
//¿Que sucede con los valores de los elementos que no han sido inicializados?
public class Array11 {
    public static void main(String[] args) {
         String[] simbolo;
         simbolo = new String[9]; // le ponemos un maximo al array 
        // damos valores a los arrays
        simbolo[0] = "a";
        simbolo[1] = "x";
        simbolo[4] = "@";
        simbolo[6] = "''";
        simbolo[7] = "+";
        simbolo[8] = "Q";

        for(int i=0; i<simbolo.length; i++)
        {
            System.out.println(simbolo[i]);
        }

    }
}

// los elementos que no han sido inicializados se convierten en null, pero en char se convierte en un hueco en blanco.
