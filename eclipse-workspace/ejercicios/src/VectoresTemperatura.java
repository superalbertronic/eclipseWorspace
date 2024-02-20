public class VectoresTemperatura {
	private static int[] temperaturas1; //definimos una matriz
	final static int POS=11; //definimos una constante 10 temperaturas
	public static void main (String[] args) {
	int dato=0;
	int media=0;
	temperaturas1=new int[POS];//definimos un objeto
	System.out.println("introduzca las siguientes 10 temperaturas");
	for(int i=1;i<POS;i++){ //nos pide 10 temperaturas
		System.out.println("introduzca temperatura n "+ i);
		try{
			
			String sdato=System.console().readLine(); //es igual que un input
			dato=Integer.parseInt(sdato); //convierte a enteros  La función parseInt 
			//comprueba el primer argumento, una cadena, e intenta devolver un entero de la base especificada
		}catch(Exception e){
			System.out.println("Error en la introduccion de datos");
		}
		temperaturas1[i]=dato; //el valor del input se introduce en el objeto matriz
	}
	for (int i=0;i<POS;i++){ //realiza la media 
		media=media+temperaturas1[i];
	}
	media=media/POS;
	System.out.println("LA MEDIA DE TEMPERATURAS ES "+media);	
		
	}
}
