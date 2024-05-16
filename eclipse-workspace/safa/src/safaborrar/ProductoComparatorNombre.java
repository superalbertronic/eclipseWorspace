
package safaborrar;
import java.util.Comparator;

public class ProductoComparatorNombre implements Comparator <Producto> {
	
	private boolean asc;
	ProductoComparatorNombre(boolean asc) {
        this.asc = asc;
    }
    @Override
    public int compare(Producto o1, Producto o2) {
        int ret;
        if (asc) {
            ret = o1.getNombre().compareTo(o2.getNombre());
        } else {
            ret = o2.getNombre().compareTo(o1.getNombre());
        }
        return ret;
    }
}

