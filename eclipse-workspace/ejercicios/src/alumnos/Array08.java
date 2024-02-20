package alumnos;

import java.util.Scanner;

public class Array08 {
    public static void main (String [] args) {
        String [] tabla = {"-","-","-","-","-","-","-","-","-"};
            int tirada = 0;
        Scanner s = new Scanner(System.in);

            
            
           	System.out.println("Introduce la figura que quieras jugador1");
            String y=s.next();
          
          
          
            System.out.println("Introduce la figura que quieras jugador2");
            String a = s.next();
            
            
            boolean Ganador = false;
            do { 
                mostrarTabla(tabla);					//coge la funcion de mostrar tabla
                String ficha = tirada%2==0? y:a;	//esto es para que una vez sea X y otro O
                jugadaX(ficha, tabla);

                Ganador = valoraJugada(tabla);
                if (Ganador)System.out.println("Ganó: " + ficha);
                tirada++;
            }
            while (!Ganador);   		// mientras no haya un ganador

    }

     static void mostrarTabla(String[] tabla) {
        System.out.println(tabla[0] + " | " + tabla[1] + " | " + tabla[2]);
        System.out.println(tabla[3] + " | " + tabla[4] + " | " + tabla[5]);
        System.out.println(tabla[6] + " | " + tabla[7] + " | " + tabla[8]);
    }
    
    
    
    
    
    

    static void jugadaX(String ficha, String[] tabla) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la posicion," + ficha);
        int posicion = s.nextInt();

        tabla[posicion] = ficha;
    }
    
    
    
    
    
    public static boolean valoraJugada(String tabla[]) {
        if (tabla[0].equals(tabla[1]) && tabla[0].equals(tabla[2]) && !tabla[0].equals("-")) {
            return true;
        } 
            else if (tabla[3].equals(tabla[4]) && tabla[3].equals(tabla[5]) && !tabla[3].equals("-"))
        { return true; 
        } 
            else if (tabla[6].equals(tabla[7]) && tabla[6].equals(tabla[8]) && !tabla[6].equals("-"))
        { return true;
        }
            else if (tabla[0].equals(tabla[3]) && tabla[0].equals(tabla[6]) && !tabla[0].equals("-"))
        { return true;
        }
            else if (tabla[1].equals(tabla[4]) && tabla[1].equals(tabla[7]) && !tabla[1].equals("-"))
        { return true;
        }
            else if (tabla[2].equals(tabla[5]) && tabla[2].equals(tabla[8]) && !tabla[2].equals("-"))
        { return true;
        }
            else if (tabla[0].equals(tabla[4]) && tabla[0].equals(tabla[8]) && !tabla[0].equals("-"))
        { return true;
        }
            else if (tabla[2].equals(tabla[4]) && tabla[2].equals(tabla[6]) && !tabla[2].equals("-"))
        {return true;
        }

        return false;
    }
    
}
