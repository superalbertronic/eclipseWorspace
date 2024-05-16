package extraermetodos;

public class Factorizado2 {

    public static double calcularSalarioNeto(double horasTrabajadas, double tarifaHora) {
        double salarioBruto = calcularSalarioBruto(horasTrabajadas, tarifaHora);
        
        double impuestos = calcularImpuestos(salarioBruto);
       
        double salarioNeto = salarioBruto - impuestos;
        return salarioNeto;
    }
//calcular slalariobruto
    public static double calcularSalarioBruto(double horasTrabajadas, double tarifaHora) {
        return horasTrabajadas * tarifaHora;
    }
// calcular impuestos
    public static double calcularImpuestos(double salarioBruto) {
        return salarioBruto * 0.15;
    }

    public static void main(String[] args) {
        double horasTrabajadas = 40;
        double tarifaHora = 20;

        double salarioNeto = calcularSalarioNeto(horasTrabajadas, tarifaHora);
        System.out.println("Salario neto: " + salarioNeto);
    }
}
