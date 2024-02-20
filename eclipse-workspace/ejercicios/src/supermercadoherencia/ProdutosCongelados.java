package supermercadoherencia;

public class ProdutosCongelados  extends Producto {
	    private double tempCongelacionRecomendada;
	   
	    public ProdutosCongelados(String fechaCaducidad, String numeroLote){
	        super(fechaCaducidad, numeroLote);
	        tempCongelacionRecomendada = 0;
	    }
	   
	    public void setTemperaturaRecomendada(double temperatura){
	        tempCongelacionRecomendada = temperatura;
	    }
	   
	    public double getTemperaturaRecomendada(){
	        return tempCongelacionRecomendada;
	    }

		@Override
		public String toString() {
			return "ProdutosCongelados [tempCongelacionRecomendada=" + tempCongelacionRecomendada + ", fechaCaducidad="
					+ fechaCaducidad + ", numeroLote=" + numeroLote + "]";
		}
	    
	}
