package main;

import java.util.ArrayList;

import seleccionFutbol.Entrenador;
import seleccionFutbol.Futbolista;
import seleccionFutbol.Masajista;
import seleccionFutbol.Seleccion;

public class Main {
	
	public static ArrayList<Seleccion> integrantes = new ArrayList<Seleccion>();

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Futbolista pedri = new Futbolista(1, "Pedro", "Gonzalez", 19, 26, "Centrocampista");
		Entrenador luisEnrique = new Entrenador(2, "Luis Enrique", "Martinez", 51, "FED0001");
		Masajista manitas = new Masajista(3, "Manuel", "Manitas", 40, "Fisioterapeuta", 15);
		
		integrantes.add(pedri);
		integrantes.add(luisEnrique);
		integrantes.add(manitas);
		
		System.out.println("ENTRENAMIENTO:");
		System.out.print(pedri.getNombre()+" "+pedri.getApellidos()+" -> ");
		pedri.entrenar();
		System.out.print(luisEnrique.getNombre()+" "+luisEnrique.getApellidos()+" -> ");
		luisEnrique.dirigirEntrenamiento();
		
		System.out.println("PARTIDO:");
		System.out.print(pedri.getNombre()+" "+pedri.getApellidos()+" -> ");
		pedri.jugarPartido();
		System.out.print(luisEnrique.getNombre()+" "+luisEnrique.getApellidos()+" -> ");
		luisEnrique.dirigirPartido();
		
		System.out.println("MASAJE:");
		System.out.print(manitas.getNombre()+" "+manitas.getApellidos()+" -> ");
		manitas.darMasaje();

	}

}
