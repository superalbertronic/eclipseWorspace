package strategy2;

//Ejemplo de uso
public class Main {
 public static void main(String[] args) {
     // Seleccionamos la estrategia de pago
     PaymentStrategy creditCardStrategy = new CreditCardPayment("1234 5678 9012 3456", "12/25", "123");
     PaymentStrategy paypalStrategy = new PayPalPayment("albertoruiz@cenecmalaga.es", "12345");
     PaymentStrategy bitcoinStrategy = new BitcoinPayment("12345");

     // Contexto con la estrategia de pago con tarjeta de crédito
     PaymentContext context = new PaymentContext(creditCardStrategy);
     context.pay(100.0);

     // Cambiamos la estrategia de pago a PayPal
     context = new PaymentContext(paypalStrategy);
     context.pay(50.0);
     
     context = new PaymentContext(bitcoinStrategy);
     context.pay(150.0);
 }
}
