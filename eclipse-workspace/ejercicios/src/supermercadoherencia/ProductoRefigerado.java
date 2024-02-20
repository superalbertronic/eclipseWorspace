package supermercadoherencia;

public class ProductoRefigerado extends Producto{
    private String codigoSupervisionAlimentaria;
   
    public ProductoRefigerado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        codigoSupervisionAlimentaria = "Desconocido";
    }
   
    public void setCodigoSupervisionAlimentaria(String codigo){
        codigoSupervisionAlimentaria = codigo;
    }

	@Override
	public String toString() {
		return "ProductoRefigerado [codigoSupervisionAlimentaria=" + codigoSupervisionAlimentaria + ", fechaCaducidad="
				+ fechaCaducidad + ", numeroLote=" + numeroLote + "]";
	}
   
    
}