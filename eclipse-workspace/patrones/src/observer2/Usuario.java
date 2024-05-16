package observer2;

class Usuario implements Observer {
    private double umbral;

    public Usuario(double umbral) {
        this.umbral = umbral;
    }

    @Override
    public void actualizar(double temperatura) {
        if (temperatura > umbral) {
            System.out.println("¡Alerta! La temperatura ha superado el umbral de " + umbral + " grados.");
        }
    }
}

