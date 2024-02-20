package diagramasdeflujo;

public class relog {

    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (true) {
            // Imprime la hora actual
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);

            // Pausa durante 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Actualiza los segundos y ajusta minutos/horas según sea necesario
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
    }
}
