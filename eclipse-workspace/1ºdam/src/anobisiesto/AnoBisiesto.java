package anobisiesto;

public class AnoBisiesto{
	public static void main (String args[]){ 
	
	
		
		
		int año = 2400;
	boolean bisiesto=false; //no tiene ningún valor se puede borrar false
	bisiesto=(año%4==0)&&(año%100!=0) || (año%400==0);
	System.out.println(bisiesto); 
	if(bisiesto=true){ //va implicito el valor true, no hace falta poner true, se puede borrar
		System.out.println(año + " es bisiesto"); 
		}else{
			System.out.println(año + " no es bisiesto"); 
			} 
	} 
	}