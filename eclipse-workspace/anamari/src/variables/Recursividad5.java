package variables;

public class Recursividad5 {
	public static void main(String[] args) {
	int [] numero=new int[] {20,21,22};
	numerar(numero,0);
	}
	static void numerar(int [] num, int pos) {
		if (pos>=num.length) {
			return;
					
		}
		System.out.println(num[pos]);
		numerar(num,pos+1);
		
		
	}

}