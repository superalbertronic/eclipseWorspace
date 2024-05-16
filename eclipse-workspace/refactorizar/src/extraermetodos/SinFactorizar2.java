package extraermetodos;

public class SinFactorizar2 {

    public static double calcularSalarioNeto(double horasTrabajadas, double tarifaHora) {
        double salarioBruto = horasTrabajadas * tarifaHora;
        double impuestos = salarioBruto * 0.15;
        double salarioNeto = salarioBruto - impuestos;
        return salarioNeto;
    }

    // para refactorizar usariamos impuestos, calcular salario metodo
    public static void main(String[] args) {
        double horasTrabajadas = 40;
        double tarifaHora = 20;

        double salarioNeto = calcularSalarioNeto(horasTrabajadas, tarifaHora);
        System.out.println("Salario neto: " + salarioNeto);
    }
}
