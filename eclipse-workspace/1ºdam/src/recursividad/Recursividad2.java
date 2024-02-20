package recursividad;

public class Recursividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ciudades=new String [] {"España","Portugal","Francia"};
		listaciudades(ciudades,0);
		
	}
		static void listaciudades (String [] city, int position) {
			if (position>=city.length) {
				return;
			}
			System.out.println(city[position]+" "+position);
			listaciudades(city,position+1);
			
		}
	

}
