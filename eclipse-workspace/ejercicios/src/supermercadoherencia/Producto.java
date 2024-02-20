package supermercadoherencia;


	public class Producto {
	    String fechaCaducidad, numeroLote;
	   
	    public Producto(String fechaCaducidad, String numeroLote){
	        this.fechaCaducidad = fechaCaducidad;
	        this.numeroLote = numeroLote;
	    }

		public String getFechaCaducidad() {
			return fechaCaducidad;
		}

		public void setFechaCaducidad(String fechaCaducidad) {
			this.fechaCaducidad = fechaCaducidad;
		}

		public String getNumeroLote() {
			return numeroLote;
		}

		public void setNumeroLote(String numeroLote) {
			this.numeroLote = numeroLote;
		}

		@Override
		public String toString() {
			return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
		}
	   
	    
	   
	   
	}


