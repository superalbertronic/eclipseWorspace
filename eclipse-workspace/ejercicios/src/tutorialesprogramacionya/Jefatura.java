package tutorialesprogramacionya;


import pildorasinformaticasSuperclase1.Empleado;

public class Jefatura extends Empleado {
private double incentivo;
public Jefatura(String nom, double sue, int agno, int mes, int dia) {
super (nom, sue, agno, mes, dia);//para coger el constructor de la clase padre
//como ya tienen parametros hay q pasarle parametros
}
public void estableceIncentivo(double b) {//no devuelve nada SETTER
incentivo=b;
}
public double dameSueldo() {//GETTER sobre escribe o machaca el metodo heredado
// triangulo verde quiere decir que el metodo machaca encima del
//metodo de la clase padre
double sueldoJefe=super.dameSueldo();//metodo d la clase padre no de la clase jefatura
return sueldoJefe+incentivo;
}
}
