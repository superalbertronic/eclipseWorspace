package safaborrar;
import java.util.Comparator;

public class ProductoComparatorPrecio implements Comparator <Producto> {
	
	private boolean asc;
	ProductoComparatorPrecio(boolean asc) {
        this.asc = asc;
    }
    @Override
    public int compare(Producto o1, Producto o2) {
        int ret;
        if (asc) {
            ret = o1.getPrecio().compareTo(o2.getPrecio());
        } else {
            ret = o2.getPrecio().compareTo(o1.getPrecio());
        }
        return ret;
    }
}


