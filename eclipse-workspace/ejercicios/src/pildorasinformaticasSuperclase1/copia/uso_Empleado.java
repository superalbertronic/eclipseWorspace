package pildorasinformaticasSuperclase1.copia;

import tutorialesprogramacionya.Jefatura;

public class uso_Empleado {

public static void main(String[] args) {

Jefatura jefe_RRHH=new Jefatura("Juan",55000,2006,9,25);
jefe_RRHH.estableceIncentivo(2570);
Empleado[] misEmpleados=new Empleado[6];
misEmpleados[0]=new Empleado("Paco Gomez", 8500,1990,12,17);
misEmpleados[1]=new Empleado ("Ana Lopez",9500,1995,06,02);
misEmpleados[2]=new Empleado ("Maria Martin",10500,2002,03,15);
misEmpleados [3]=new Empleado ("Antonio Fernandez",4700,2005,11,9);
misEmpleados[4]=jefe_RRHH; //polimorfismo en accion. principio de sustitucion.
misEmpleados[5]=new Jefatura ("Maria",9500,1999,5,26);
// te puede meter empleado y opjetos de los empleados.
for(Empleado e: misEmpleados) {
e.subeSueldo(5);
}
for (Empleado e: misEmpleados) {
System.out.println("Nombre: "+e.dameNombre()
+"sueldo: "+e.dameSueldo()
+"fecha de alta: "+e.dameFechaContrato());

}
}
}
