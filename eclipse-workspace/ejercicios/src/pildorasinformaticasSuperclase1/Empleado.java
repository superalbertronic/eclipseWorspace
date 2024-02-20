package pildorasinformaticasSuperclase1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado{

public  Empleado (String nom,double sue, int agno, int mes, int dia) {

nombre= nom;
sueldo= sue;
GregorianCalendar calendario=new GregorianCalendar (agno,mes-1,dia);
altaContrato=calendario.getTime();//getter
}
public String dameNombre() {//getter
return nombre;
}
public double dameSueldo() { //getter
return sueldo;

}
public Date dameFechaContrato() { //getter
return altaContrato;

}
public void subeSueldo(double porcentaje) {//setter
double aumento= sueldo*porcentaje/100;
sueldo+=aumento;
}
private String nombre;
private double sueldo;
private Date altaContrato;
private static int IdSiguiente;
private int Id;

}