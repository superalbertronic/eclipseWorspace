package strategy2;

//Estrategia de pago con PayPal
class BitcoinPayment implements PaymentStrategy {
 private String codigo;
 
 public BitcoinPayment(String codigo) {
     this.codigo = codigo;
    
 }

 @Override
 public void pay(double amount) {
     System.out.println("Pagando " + amount + " usando BItcoin: " + codigo);
 }
}