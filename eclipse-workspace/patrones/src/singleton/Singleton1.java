package singleton;

public class Singleton1 {
    private static Singleton1 instance;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Singleton1() {}

    // Método estático para obtener la única instancia de la clase
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    // Método de ejemplo para mostrar el funcionamiento del Singleton
    public void mostrarMensaje() {
        System.out.println("¡Hola! Soy un Singleton en verdad ave.");
    }

    public static void main(String[] args) {
        // Obtener la instancia del Singleton
        Singleton1 singleton = Singleton1.getInstance();
        Singleton1 singleton1=Singleton1.getInstance();
     Singleton1 singleton2=new Singleton1();
        // Usar la instancia para llamar al método showMessage
        singleton.mostrarMensaje();
        
        if (singleton1==singleton) {
        	System.out.println("es la misma instancia "+singleton+ ""+singleton1);
        }else {
        	System.out.println("es diferente");	
        	}
        
        // Usar la instancia para llamar al método showMessage
        if (singleton1==singleton2) {
        	System.out.println("es la misma instancia"+singleton+ ""+singleton2);
        }else {
        	System.out.println("es diferente");	
        	}
        }
    }

