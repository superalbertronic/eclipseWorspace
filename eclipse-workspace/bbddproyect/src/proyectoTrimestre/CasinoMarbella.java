package proyectoTrimestre;

public abstract class CasinoMarbella {

    public abstract int numerosObtenidos();   // creamos el método public abstracto que después vamos a definir en la clase Cliente

    private int numeroDeTiradas; /* creamos la variable numeroDeTiradas que será el número de bolas y la vamos a definir en
                                   el constructor de la clase Cliente */

    public CasinoMarbella(int numeroDeTiradas) {  // creamos método constructor
        this.numeroDeTiradas = numeroDeTiradas;
    }
  // método getter and setter

    public int getNumeroDeTiradas() {
        return numeroDeTiradas;
    }

    public void setNumeroDeTiradas(int numeroDeTiradas) {
        this.numeroDeTiradas = numeroDeTiradas;
    }


    @Override
    public String toString() {
        return "Bienvenidos al Casino Marbella, por favor pase y póngase cómodo " +
                " \nle recordamos que el número máximo de apuestas en nuestra Ruleta Americana es de: " + numeroDeTiradas;
    }
}
