package tutorialesprogramacionya;


public class Sumador {
		
		public static void datos(String nombre, int edad) {
			System.out.println(" su nombre y edad es " +nombre+" "+ edad);
			
			
		}
		
		public int suma(int numero1, int numero2){
			int resultado=numero1+numero2;
		return resultado;
		}
		public static void sumasinreturn(int numero1, int numero2){
			int resultado=numero1+numero2;
			System.out.println("El resultado es "+resultado);
		}
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
        Sumador sumaobject=new Sumador();
        int rs=sumaobject.suma(12,20);
        System.out.println("el resultado es " + rs);
        sumasinreturn(10,20);	
        datos("Alberto",50);        
        
	}

}
