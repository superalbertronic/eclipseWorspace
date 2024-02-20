package hilos;

class Par implements Runnable {
	public void run() {
		for (int i = 2; i < 20; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

class Impar implements Runnable {
	public void run() {
		for (int i = 1; i < 20; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class AlumnoCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Par hPar = new Par();
		Thread h1 = new Thread(hPar);

		Impar hImpar = new Impar();
		Thread h2 = new Thread(hImpar);

		h1.start();
		h2.start();

	}

}
