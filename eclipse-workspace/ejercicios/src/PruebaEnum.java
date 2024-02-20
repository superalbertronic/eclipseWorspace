public class PruebaEnum{
// Nos creamos un enumerado para definir las personas correspondientes a cada fila el orden debe coincidir con datos
// esta definido en el main
enum Personas {Pablo,Ana,Sonia};
// No creamos un enumerado para definir los campos que son las columnas y deben coincidir con con datos esta definido
// en el main
enum Campos {nombre,edad,ciudad};


public static void main(String[]args) {
//cada fila contiene los datos de una persona cuyos campos son nombre, edad y ciudad
String datos[][]= {{"Pablo","30","Malaga"},{"Ana","20","Sevilla"},{"Sonia","25","Madrid"}};

// nos creamos variables que contenga los diferentes campos de nuestra estructura que a traves del método ordinal
// obtendremos la posicion que ocupa en nuestra estructura enum que coincide con la columnas correspondientes en
// datos porque lo hemos puesto adrede en el mismo orden que datos. ejemplo la posicion de nombre en el enum es
// 0 y en nuestra variable datos la columna 0 contiene todos los nombres, lo mismo pasa con la edad que sería 1 y
// la ciudad con esto podemos trabajar con el nombre de una fila o columna en vez de usar números enteros
Campos nombre=Campos.nombre;
Campos edad = Campos.edad;
Campos ciudad=Campos.ciudad;

// para no hacerlo muy pesado de forma manual creamos un for que por lo menos nos recorra las personas que tenemos
// en datos es decir las filas porque cada persona es una fila
for(Personas Persona: Personas.values()) {

// mostramos los datos de cada persona usando los tipos enumerado y no un número entero. si lo hubiramos
// hecho sin recorre las filas con un bucle habrimos tenido que poner todas las filas de manera manual
// y para eso en vez de poner Persona.ordinal() ponemos Personas.Pablo.ordinal() para que nos de la fila de
// Pablo
System.out.print("Nommbre: "+datos[Persona.ordinal()][nombre.ordinal()]);


System.out.print(" Edad: "+datos[Persona.ordinal()][edad.ordinal()]);


System.out.println(" Ciudad: "+datos[Persona.ordinal()][ciudad.ordinal()]);

}
}
}