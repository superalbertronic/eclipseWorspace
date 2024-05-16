package strategy;

//Contexto que utiliza una estrategia de pago
class PaymentContext {
 private PaymentStrategy paymentStrategy;

 public PaymentContext(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void pay(double amount) {
     paymentStrategy.pay(amount);
 }
}
