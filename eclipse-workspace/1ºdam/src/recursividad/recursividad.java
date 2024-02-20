package recursividad;

public class recursividad {
	static void recorrer (int [] recorre, int posicion) {
		if (posicion>=recorre.length) {
			return;
		
		}	
		System.out.println("numero "+recorre[posicion]);
		recorrer(recorre,posicion+1);	
	} 
	public static void main(String[] args) {
		int [] matriz=new int[] {10,11,12,13};
		recorrer(matriz,0);
		
		
	}

}
