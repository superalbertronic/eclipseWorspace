package metodos;

import java.util.*;

public class Notas {

   public static String evaluacion(int num) {
	    String mensaje;
        if (num < 5) {
        	mensaje="suspenso";
           
        }else if (num >= 5 && num < 6){
        	mensaje="suspenso";
         

        }else if(num >=6 && num < 7) {
        	mensaje="suspenso";
           

        }else if (num >=7 && num < 9) {
        	mensaje="suspenso";

        }else {
        	mensaje="suspenso";
           
        }
        return mensaje;
   }
   
       public static void main(String args[]) {
           Scanner Z= new Scanner(System.in);
                   int a;
                   System.out.print("Escriba la nota que ha sacado: ");
                   a=Z.nextInt();
                   Z.close();
       System.out.print(evaluacion(a));                    

               }

               }