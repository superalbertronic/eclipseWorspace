package proyectoTrimestre;

public class Cliente extends CasinoMarbella implements Persona {

    // variable apuesta1 será el número con el que el cliente apostará
    private int apuesta1;


    // getter and setter
    public int getApuesta1() {
        return apuesta1;
    }

    public void setApuesta1(int apuesta1) {
        this.apuesta1 = apuesta1;
    }


// en este constructor donde en súper hacemos referencia del constructor de la clase padre CasinoMarbella añadimos el número de tiradas
    public Cliente(int apuesta1) {
        super(1);
        this.apuesta1 = apuesta1;

    }


    @Override
    public int numerosObtenidos() {  /* definimos el método con un método random de 36 valores que son las posibles casillas donde
                                        puede caer la bola en la ruleta */
            apuesta1 = (int) (Math.random() * 36);


        return apuesta1;
    }

    @Override
    public String despedida() {   // métodos sobreescritos de la clase interface Persona
        return "deseamos volver a verle pronto";
    }

    @Override
    public String bienvenida() {
        return "Bienvenidos al Casino Marbella, por favor pase y póngase cómodo";
    }
}

