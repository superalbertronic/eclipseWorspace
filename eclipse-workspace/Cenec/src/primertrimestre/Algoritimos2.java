package primertrimestre;

public class Algoritimos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
		int num2=10;
		boolean total;
		// 12 mayor que 10
		total=num1>num2;
		System.out.println(total);
		//12 menor que 10
		total=num1<num2;
		System.out.println(total);
		// 12 menor que 10 o 12 mayor que 10
		total=(num1<num2) || (num1>num2);
		System.out.println(total);
		//12 menor que 10 y 12 mayor que 10
		total=(num1<num2) && (num1>num2);
		System.out.println(total);
				
		
		
	}

}
