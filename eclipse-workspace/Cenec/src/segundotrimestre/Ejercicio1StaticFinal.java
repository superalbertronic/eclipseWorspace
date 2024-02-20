package segundotrimestre;


public class Ejercicio1StaticFinal {
	static final int numero=12; //constante no se le puede asignar valor
	static int numero2=13;
	public static void main(String[] args) {
      System.out.println(numero);
       suma(numero,numero2);
       System.out.println("la multiplicacion es " + multiplica(numero,numero2));
       
    }
	public static void suma(int num1, int num2) {
		int suma;
		suma=num1+num2;
		System.out.println("la suma es "+suma);
	}
	void resta(int num1,int num2) {
		int resta;
		resta=num1-num2;
		System.out.println("la resta es "+resta);
	}
	static int multiplica(int num1, int num2) {
	    int resultado = num1 * num2;
	    return resultado;
	}

	}
