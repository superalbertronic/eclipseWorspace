package interfacedificilpoo;

//Interfaz para las operaciones comunes en las cuentas bancarias
interface CuentaBancaria {
 void depositar(double cantidad);
 boolean retirar(double cantidad);
 double consultarSaldo();
}

//Clase base para las cuentas bancarias
abstract class Cuenta implements CuentaBancaria {
 protected double saldo;

 public Cuenta(double saldoInicial) {
     this.saldo = saldoInicial;
 }

 @Override
 public void depositar(double cantidad) {
     saldo += cantidad;
     System.out.println("Depósito realizado: " + cantidad);
 }

 @Override
 public boolean retirar(double cantidad) {
     if (cantidad <= saldo) {
         saldo -= cantidad;
         System.out.println("Retiro realizado: " + cantidad);
         return true;
     } else {
         System.out.println("Fondos insuficientes");
         return false;
     }
 }

 @Override
 public double consultarSaldo() {
     return saldo;
 }
}

//Clase para la cuenta corriente
class CuentaCorriente extends Cuenta {
 private double limiteCredito;

 public CuentaCorriente(double saldoInicial, double limiteCredito) {
     super(saldoInicial);
     this.limiteCredito = limiteCredito;
 }

 @Override
 public boolean retirar(double cantidad) {
     if (cantidad <= saldo + limiteCredito) {
         saldo -= cantidad;
         System.out.println("Retiro realizado: " + cantidad);
         return true;
     } else {
         System.out.println("Excede el límite de crédito");
         return false;
     }
 }
}

//Clase para la cuenta de ahorro
class CuentaAhorro extends Cuenta {
 private double tasaInteres;

 public CuentaAhorro(double saldoInicial, double tasaInteres) {
     super(saldoInicial);
     this.tasaInteres = tasaInteres;
 }

 public void calcularInteres() {
     double interes = saldo * tasaInteres;
     saldo += interes;
     System.out.println("Intereses calculados: " + interes);
 }
}

//Clase principal para probar el sistema
public class Main {
 public static void main(String[] args) {
     // Crear una cuenta corriente con saldo inicial de 1000 y límite de crédito de 500
     CuentaCorriente cuentaCorriente = new CuentaCorriente(1000, 500);
     cuentaCorriente.depositar(500);
     cuentaCorriente.retirar(1200);
     System.out.println("Saldo cuenta corriente: " + cuentaCorriente.consultarSaldo());

     // Crear una cuenta de ahorro con saldo inicial de 2000 y tasa de interés del 2%
     CuentaAhorro cuentaAhorro = new CuentaAhorro(2000, 0.02);
     cuentaAhorro.depositar(1000);
     cuentaAhorro.calcularInteres();
     cuentaAhorro.retirar(500);
     System.out.println("Saldo cuenta de ahorro: " + cuentaAhorro.consultarSaldo());
 }
}
