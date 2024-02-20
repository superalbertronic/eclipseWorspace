package testjunit;
import org.junit.Test;
import static org.junit.Assert.assertThrows;

class TestPersona{

	@Test
	void test() {
		Persona person= new Persona();
		assertThrows(NumberFormatException.class, () 
		-> person.setEdad(12));
		
	}

}
