package metodos;

// al no usar static, tenemos que crear un objeto de la clase y usamos los metodos sin static

public class CalculadoraObjeto {
    public static void main(String[] args) {
        CalculadoraObjeto calculator = new CalculadoraObjeto();
        int a = 4, b = 5;
        System.out.println("Suma: " + calculator.Suma(a, b));
        System.out.println("Resta: " + calculator.Resta(a, b));
        System.out.println("Producto: " + calculator.Producto(a, b));
        System.out.println("División: " + calculator.Division(a, b));
        System.out.println("Raiz: " + calculator.raiz(a));
    }

    public int raiz(double a) {
		double c=Math.sqrt(a);
    	return (int) c;
    	
    }	
    
    public int Suma(int a, int b) {
        return a + b;
    }

    public int Resta(int a, int b) {
        return a - b;
    }

    public int Producto(int a, int b) {
        return a * b;
    }

    public int Division(int a, int b) {
        return a / b;
    }
    
    
}





