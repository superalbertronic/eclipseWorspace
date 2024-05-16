package patronbuilder;

public class CuentaBancaria {
     
    private String numero;
    private String titular;
    private String dni;
    private double saldo;
     
    
    //subclase dentro de CuentaBancaria
    public static class Builder {
        private String numero;
        private String titular;
        private String dni;
		private double saldo;
        
        public Builder() {} //constructor me permite que pueda 

        public Builder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder titular(String titular) {
            this.titular = titular;
            return this;
        }

        public Builder saldo(double saldo) {
            this.saldo = saldo;
            return this;
        }
        public Builder dni(String dni) {
            this.dni = dni;
            return this;
        }
        
        
   //construye el objeto con los datos que le introduzcamos
        public CuentaBancaria build() {
            return new CuentaBancaria(this);
        }
    }
    //podemos utilizar los argumentos dentro de la instancia de objeto CuentaBancaria
    private CuentaBancaria(Builder builder) {
        this.numero = builder.numero;
        this.titular = builder.titular;
        this.saldo = builder.saldo;
        this.dni=builder.dni;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//to string para que me muestre los datos
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo + ", dni="+dni+
                '}';
    }
  //ejecutor main
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria.Builder()
                .numero("12345").titular("Alberto Ruiz").saldo(1000.0).build();
        CuentaBancaria cuenta1 = new CuentaBancaria.Builder()
                .numero("33345").titular("Eva Lucena").build();
        CuentaBancaria cuenta2 = new CuentaBancaria.Builder()
                .numero("33345").titular("Eva Lucena").dni("12121212A").build();
        System.out.println(cuenta.toString());
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
    
}
