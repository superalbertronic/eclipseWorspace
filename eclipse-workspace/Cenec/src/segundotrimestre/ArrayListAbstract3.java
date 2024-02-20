package segundotrimestre;
import java.util.ArrayList;

abstract class Juego{
	String jugador1,jugador2;
	int puntos1,puntos2;
	public Juego(String jugador1, String jugador2, int puntos1, int puntos2) {
		super();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.puntos1 = puntos1;
		this.puntos2 = puntos2;
	}
@Override
public String toString() {
	return "jugador1 "+jugador1+ " puntos "+puntos1+" jugador 2 "+jugador2+ " puntos "+puntos2;
}
}

class jugada extends Juego{

	public jugada(String jugador1, String jugador2, int puntos1, int puntos2) {
		super(jugador1, jugador2, puntos1, puntos2);
		// TODO Auto-generated constructor stub
	}
		
}




public class ArrayListAbstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Juego> listaPuntos=new ArrayList();
		listaPuntos.add(new jugada("Alberto","Eva",1200,1500));
		listaPuntos.add(new jugada("Juan","Antonio",1300,1100));
		
		for (Juego lista: listaPuntos) {
			System.out.println(lista);
			
			
		}
    
    
		
	}

}
