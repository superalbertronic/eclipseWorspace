package testjunit;

public class Arrays {
	// atributos
	
		private int[] array1 = {1,4,5};
		private int[] array2 = {1,4,5};
		
		// método
		
		public boolean arrayTest() {
			if (array1 == array2) {
	       }
			return true;
		}
	    // métodos getter and setter

		public int[] getArray1() {
			return array1;
		}

		public void setArray1(int[] array1) {
			this.array1 = array1;
		}

		public int[] getArray2() {
			return array2;
		}

		public void setArray2(int[] array2) {
			this.array2 = array2;
		}
}
