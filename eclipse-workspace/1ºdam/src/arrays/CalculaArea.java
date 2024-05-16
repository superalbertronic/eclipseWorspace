package arrays;

public class CalculaArea {
    public static void main(String[] args) {
        // Definici�n de los puntos del pol�gono
        double[][] puntosPoligono = {
            {0, 0}, // Punto 1
            {0, 3}, // Punto 2
            {4, 0}  // Punto 3
        };

        // C�lculo del �rea del pol�gono
        double area = calcularArea(puntosPoligono);

        // C�lculo del per�metro del pol�gono
        double perimetro = calcularPerimetro(puntosPoligono);

        // Impresi�n de los resultados
        System.out.println("Area del poligono: " + area);
        System.out.println("Perimetro del poligono: " + perimetro);
    }

    // M�todo para calcular el �rea del pol�gono
    public static double calcularArea(double[][] puntos) {
        double area = 0;
        int n = puntos.length;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += puntos[i][0] * puntos[j][1];
            area -= puntos[j][0] * puntos[i][1];
        }
        area /= 2.0;
        return Math.abs(area);
    }

    // M�todo para calcular el per�metro del pol�gono
    public static double calcularPerimetro(double[][] puntos) {
        double perimetro = 0;
        int n = puntos.length;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            double dx = puntos[j][0] - puntos[i][0];
            double dy = puntos[j][1] - puntos[i][1];
            perimetro += Math.sqrt(dx * dx + dy * dy);
        }
        return perimetro;
    }
}
