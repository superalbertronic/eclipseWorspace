package conectarmysql;

import java.util.Scanner;

public class Cajero {
	 
	private static Cuenta[] cuentas;
	private static Scanner teclado = new Scanner(System.in);
 

	public static void main (String[] args) {
		inicializarCuentas();
		int opcion = 0;
 
		while (opcion != 4) { //iniciamos con un menú que nos pide que queremos hacer
			System.out.println("BIENVENIDO AL CAJERO AUTOMÁTICO");
			System.out.println("--------------------------------");
			System.out.println("[1] Retirar saldo");
			System.out.println("[2] Depositar saldo");
			System.out.println("[3] Consultar saldo");
			System.out.println("[4] SALIR");
			System.out.print("Elija una opcion: ");
			opcion = Integer.parseInt(teclado.nextLine());
			//utilizamos switch para asociar un número al método que queremos usar
			switch(opcion) {
			case 1:
				retirar();
				break;
			case 2:
				ingresar();
				break;
			case 3:
				consultarSaldo();
				break;
			case 4:
				System.out.println("GRACIAS. HASTA LA PRÓXIMA");
				break;
			default:
				System.out.println("NÚMERO NO VÁLIDO. INTRODUZCA OTRA VEZ");
				System.out.println("");
			}
		}
	}
 
	
 
	//Creamos un array con las diferentes cuentas que vamos a usar e introducimos los datos para poder hacer movimientos
	private static void inicializarCuentas() {
		cuentas = new Cuenta[5];
		cuentas[0] = new Cuenta("Laura Gaona", "1234", 1300.50);
		cuentas[1] = new Cuenta("Sarai Gordillo", "0000", 390);
		cuentas[2] = new Cuenta("Pablo Motos", "6969", 1250.60);
		cuentas[3] = new Cuenta("Deborah Rossi", "1975", 50);
		cuentas[4] = new Cuenta("Linda Liu", "2012", 80.69);
 
	}
 
	
	 //Pide un PIN al usuario
	private static Cuenta buscarPorPIN() {
		System.out.println("\nIntroduzca su PIN de 4 digitos");
		String PIN = teclado.nextLine();
 
		//Buscamos la cuenta por el PIN
		for (int i = 0; i < cuentas.length; i++)
			if (cuentas[i].getPIN().equals(PIN))
				return cuentas[i]; //Si la encontramos, la retornamos
 
		//Si el bucle FOR no ha retornado nada, es que el PIN es incorrecto y volvemos a empezar
		return null;
	}
 
	//Permite retirar dinero
	private static void retirar() {
 
		Cuenta usuario = buscarPorPIN();
 
		if (usuario == null)
			System.out.println("\nNo existe una cuenta asociada a ese PIN");
		else {
			System.out.print("\nCantidad a retirar: ");
			double cantidad = Double.parseDouble(teclado.nextLine());
			usuario.retirar(cantidad);
		}
	}
 
	//Permite ingresar dinero
	private static void ingresar() {
 
		Cuenta usuario = buscarPorPIN();
 
		if (usuario == null)
			System.out.println("\nNo existe una cuenta asociada a ese PIN");
		else {
			System.out.print("\nCantidad a ingresar: ");
			double cantidad = Double.parseDouble(teclado.nextLine());
			usuario.ingresar(cantidad);
		}
	}
 
	//Permite consultar saldo
	private static void consultarSaldo() {
 
		Cuenta usuario = buscarPorPIN();
 
		if (usuario == null)
			System.out.println("\nNo existe una cuenta asociada a ese PIN");
		else
			System.out.println("\nSaldo actual: " + usuario.getSaldo());
	}
}