package strategy;

//Estrategia de pago con PayPal
class PayPalPayment implements PaymentStrategy {
 private String email;
 private String password;

 public PayPalPayment(String email, String password) {
     this.email = email;
     this.password = password;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Pagando " + amount + " usando PAYPAL: " + email);
 }
}