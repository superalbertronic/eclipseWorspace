package encapsulararrays;

public class EncapsularArray2 {
    private int[] numeros;
//constructor
    public EncapsularArray2(int[] numeros) {
        this.numeros = numeros;
    }
//getter numeros
    public int[] getNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
    	//asignamos valores
        int[] numeros = {1, 2, 3, 4, 5};
        EncapsularArray2 encapsulado = new EncapsularArray2(numeros);

        // Mostrando el array encapsulado
        int[] arrayEncapsulado = encapsulado.getNumeros();
        
        System.out.println("Array encapsulado:");
        for (int numero : arrayEncapsulado) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
