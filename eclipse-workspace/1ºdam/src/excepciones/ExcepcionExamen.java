package excepciones;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class ExcepcionExamen {
    public static void main(String[] args) {
        try {
            System.out.print("a");

            int[] array = {1, 88, 6};
            int resultado = array[3] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("b");
        } catch (ArithmeticException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
            System.out.print("e");
        }
        System.out.print("g");
    }
}
