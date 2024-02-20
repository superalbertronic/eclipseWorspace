package recursividad;

public class Recursividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] edad=new int [] {1,2,3};
		edades(edad,0);
	}
		static void edades(int []age, int pos) {
			if (pos>=age.length) {
				return;						
			}
		System.out.println(age[pos]);
		edades(age,pos+1);
			
		}
	

}
