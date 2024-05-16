package testjunit;
import org.junit.Test;
import static org.junit.Assert.assertThrows;

class TestPersona{

	@Test
	void test() {
		Persona person= new Persona();
		/*verificamos si el valor que estamos usando es numerico
		usamos una expresion lambda tiene esta estructura en los parentesis no hemos puesto parametros
		llamamos al metodo setedad de person */
		assertThrows(NumberFormatException.class, () 
		-> person.setEdad(12));
		
	}

}
