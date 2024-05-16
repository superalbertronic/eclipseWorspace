package relog;

public class Reloj {

	private int horas;
	private int minutos;
	private int segundos;

	public Reloj() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	public Reloj(int horas, int minutos, int segundos) {
		if (validarHora(horas, minutos, segundos)) {
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
		} else {
			System.out.println("Hora no valida.Se establecera la hora en 00:00:00");
			this.horas = 0;
			this.minutos = 0;
			this.segundos = 0;
		}

	}

	// VALIDAR HORA
	private boolean validarHora(int horas, int minutos, int segundos) {
		return (horas >= 0 && horas <= 23) && (minutos >= 0 && minutos <= 59) && (segundos >= 0 && segundos <= 59);
	}

	// MODIFICAR LA HORA ENTERA
	public boolean modificarHora(int horas, int minutos, int segundos) {
		if (validarHora(horas, minutos, segundos)) {
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
			return true;
		} else {
			System.out.println("Hora no válida");
			return false;
		}
	}

	// METODO PARA SUMAR SEGUNDOS

	public void sumarSegundo() {
		segundos++;
		if (segundos == 60) {
			segundos = 0;
			minutos++;
			if (minutos == 60) {
				minutos = 0;
				horas++;
				if (horas == 24) {
					horas = 0;
				}
			}
		}
	}

	// FUNCION PARA SUMAR SEGUNDOS DETERMINADOS
	public void sumarSegundos(int segundos) {
		if (segundos > 0) {
			for (int i = 0; i < segundos; i++) {
				sumarSegundo();
			}
		}
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", horas, minutos, segundos);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas >= 0 && horas <= 23) {
			this.horas = horas;
		} else {
			System.out.println("Hora no valida");
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos >= 0 && minutos <= 23) {
			this.minutos = minutos;
		} else {
			System.out.println("Hora no valida");
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 23) {
			this.segundos = segundos;
		} else {
			System.out.println("Hora no valida");
		}
	}
	// MOSTRAR RELOJ POR PANTALLA
    public static void mostrarReloj(Reloj reloj) {
        System.out.println("Hora actual: " + reloj.toString());
    }

}
