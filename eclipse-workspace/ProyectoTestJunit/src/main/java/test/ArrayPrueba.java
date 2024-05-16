package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPrueba {
	
	
	@Test
	public void testArrayTest() {
	    Arrays arrays = new Arrays();
	    int[] expectedArray = {1, 4, 5};
	    assertArrayEquals(expectedArray, arrays.getArray1());
	    assertArrayEquals(expectedArray, arrays.getArray2());
	}

}




