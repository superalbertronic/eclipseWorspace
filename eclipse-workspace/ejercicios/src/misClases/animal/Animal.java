package misClases.animal;
public class Animal { 
    private String name;  
    private int id; 
    public Animal(String myName, int myid) { 
        name = myName; 
        id = myid;
    } 
    public void eat(){ 
                
				System.out.println (name + "Comer"); 
    }
    public void sleep(){
                 System.out.println (name + "durmiendo");
    }
    public void introduction() { 
                 System.out.println ("¡Hola a todos! Soy" + id + "signo" + name + "."); 
    }
}
