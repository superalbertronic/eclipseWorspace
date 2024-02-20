package ejerciciosalumnos;

import java.util.Scanner;

public class Santi1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Meses del año
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        // Días en cada mes
        int diasPorMes[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Días de la semana
        String diasSemana[] = { "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };

        System.out.println("Introduzca el mes (en números, por ejemplo: 1 para enero):");
        int mes = s.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Mes inválido. Por favor, introduzca un mes válido:");
            mes = s.nextInt();
        }

        System.out.println("Introduzca el día:");
        int dia = s.nextInt();
        while (dia < 1 || dia > diasPorMes[mes - 1]) {
            System.out.println("Día inválido. Por favor, introduzca un día válido para el mes seleccionado:");
            dia = s.nextInt();
        }

        int diasTranscurridos = 0;
        for (int i = 0; i < mes - 1; i++) {
            diasTranscurridos += diasPorMes[i];
        }
        diasTranscurridos += dia - 1;

        int diaSemana = diasTranscurridos % 7;

        System.out.println("El " + dia + " de " + meses[mes - 1] + " es " + diasSemana[diaSemana]);
    }
}