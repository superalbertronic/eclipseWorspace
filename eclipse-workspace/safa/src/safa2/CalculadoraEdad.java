package safa2;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalculadoraEdad {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Introduzca dia: ");
        int dia = Integer.parseInt(src.nextLine());
        System.out.print("Introduzca mes: ");
        int mes = Integer.parseInt(src.nextLine());
        System.out.print("Introduzca anio: ");
        int anio = Integer.parseInt(src.nextLine());

        GregorianCalendar hoy = new GregorianCalendar();
        int anioHoy = hoy.get(GregorianCalendar.YEAR);
        int mesHoy = hoy.get(GregorianCalendar.MONTH) + 1;
        int diaHoy = hoy.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("");
        double edad = getEdad(anioHoy, anio, mesHoy, mes, diaHoy, dia);
        if (edad < 0)
            System.out.println("Error: La fecha de nacimiento es posterior a la fecha actual");
        else
            System.out.println("Edad: " + edad);
        src.close();
    }

    public static double getEdad(int anio_actual, int anio_nacimiento, int mes_actual, int mes_nacimiento, int dia_actual, int dia_nacimiento) {
        double edad = anio_actual - anio_nacimiento;
        if (mes_actual < mes_nacimiento || (mes_actual == mes_nacimiento && dia_actual < dia_nacimiento)) {
            edad--;
        }
        double dif = ((mes_actual - mes_nacimiento) * 30.415 + (dia_actual - dia_nacimiento));

        if (dif < 0) dif += 365;
        edad += dif / 365;
        return edad;
    }
}
