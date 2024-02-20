package pildorasinformaticas;

public class Coche {
private int ruedas;
private int largo;
private int ancho;
private int motor;
private int peso_plataforma;
private String color;
private int peso_total;
private boolean asiento_cuero, climatizador;

public Coche() {
ruedas = 4;
largo = 2000;
ancho = 300;
motor = 1600;
peso_plataforma = 500;
}

public String Dime_Datos_Generales() {// GETTER
return "La plataforma del vehiculo tiene " + ruedas + " ruedas" + "y tiene un largo de " + largo
+ " y un ancho de " + ancho + " con un motor de " + motor + " y su plataforma tiene un peso de "
+ peso_plataforma + " Kg.";

}

public String Establece_Color() {// SETTER
return "el color del coche es " + color;

}

public void configura_asiento(String asientos_cuero) {// SETTER
if (asientos_cuero.equalsIgnoreCase("si")) {
this.asiento_cuero = true;
} else {
this.asiento_cuero = false;
}
}

public String dime_asiento() { // GETTER
if (asiento_cuero == true) {
return "el coche tiene los asientos de cuero";
} else {

return "el coche tiene los asientos de serie";

}
}

public void configura_climatizador(String climatizador) {// SETTER
if (climatizador.equalsIgnoreCase("si")) {
this.climatizador = true;
} else {
this.climatizador = false;
}
}

public String dime_climatizador() {// GETTER
if (climatizador == true) {
return "el coche incorpora climatizador";
} else {

return "el coche lleva aire acondicionado";

}
}

public String dime_peso_coche() {// SETTER Y GETTER
int peso_carroceria = 500;
peso_total = peso_carroceria + peso_plataforma;
if (asiento_cuero == true) {
peso_total = peso_total + 50;

}
if (climatizador == true) {
peso_total = peso_total + 20;
}
return "el peso total es " + peso_total;
}

}


