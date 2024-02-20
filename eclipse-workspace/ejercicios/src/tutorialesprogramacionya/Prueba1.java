package tutorialesprogramacionya;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba1 {

	@Test
	void test() {
		 Sumador sumaobject=new Sumador();
	        int rs=sumaobject.suma(12,20);
	        System.out.println("el resultado es " + rs);
	          
		fail("No implementado aun");
	}

}
