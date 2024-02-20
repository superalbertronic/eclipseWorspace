package colecciones;
import java.util.HashSet;
public class HashSetEjemplo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("superalbertron");
        hashSet.add("pablitron");
        hashSet.add("jablitron");
        hashSet.add("superalbertron"); // Duplicado, no se agrega
        
        System.out.println(hashSet);
    }
	
}
