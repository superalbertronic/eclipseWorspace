package abstractaATS;

public class Principal {
    public static void main(String[] args) {

        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHerviboro animalH = new AnimalHerviboro();

        animalH.alimentarse();
        planta.alimentarse();
        animalC.alimentarse();
    }
}
