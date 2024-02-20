package misClases;

public class Oveja extends Animal{
    
    //Constructor
    public Oveja(String nombre) {
        super(nombre);
       
    }
  
        //Metodos implementados de la clase abstracta Animal
     @Override
    String saludar() {
        return "Mi cabra dice BEEEE y yo digo TIIII";
    }
}