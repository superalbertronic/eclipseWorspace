package conectarmysql;

public class Cuenta {
	//Atributos de clase
    private String titular;
    private String PIN;
    private double saldo;
 
    //Método Constructor
    public Cuenta(String titular, String PIN, double saldo) {
        this.titular = titular;
        this.PIN = PIN;
        this.saldo = saldo;
    }
 
    //Getter y Setter de los atributos
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getPIN() {
    	return PIN;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setPIN(String PIN) {
    	this.PIN = PIN;
    }
 
    //Método para ingresar dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) { //la cantidad siempre debe ser positiva
        	saldo += cantidad;
        	System.out.println("\nOperación completada.");
        }
        else
        	System.out.println("\nSaldo a ingresar incorrecto.");
    }
    //Método para sacaar dinero
    public void retirar(double cantidad) {
        if (saldo - cantidad < 0) //no puede retirar más dinero del que tiene
        	System.out.println("\nNo tiene sufiente saldo para retirar.");
        else {
        	saldo -= cantidad;
        	System.out.println("\nOperacion completada.");
        }
    }
}
