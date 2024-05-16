package usarmetodos;

public class SinRefactorizar {

    public double calcularTotalConImpuestos(double precioBase, double impuestoPorcentaje) {
        // Calcular impuesto
        double impuesto = precioBase * (impuestoPorcentaje / 100);

        // Calcular total con impuesto
        double totalConImpuestos = precioBase + impuesto;

        // Redondear total con impuesto a dos decimales
        totalConImpuestos = Math.round(totalConImpuestos * 100.0) / 100.0;

        // Imprimir el total con impuestos
        System.out.println("El total con impuestos es: $" + totalConImpuestos);

        return totalConImpuestos;
    }
}
