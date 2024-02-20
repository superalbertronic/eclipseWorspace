package recursividad;

public class Recursividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] personas=new String[] {"Alberto","Ana","Eva"};
		listapersonas(personas, 0);	
		
	}
	static void listapersonas(String [] person,int position) {
		if (position>=person.length) {
			return;
		}
		System.out.println(person[position]);
		listapersonas(person,position+1);
		
	}
}
