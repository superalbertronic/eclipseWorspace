package patronmethod;

public class Main {
    public static void main(String[] args) {
        AsignaturaFactory asignaturaFactory = 
        		new AsignaturaFactoryImpl();
        
        Asignatura matematicas = 
        		asignaturaFactory.crearAsignatura(1);
        System.out.println("Nombre de la asignatura: " + 
        matematicas.getNombre()+ 
        		" "+matematicas.getCodigo());
        
        Asignatura fisica = asignaturaFactory.crearAsignatura(2); 
        System.out.println("Nombre de la asignatura: " 
        + fisica.getNombre()+ " "
        +fisica.getCodigo());
        
        Asignatura historia = asignaturaFactory.crearAsignatura(3); 
        System.out.println("Nombre de la asignatura: " 
        + historia.getNombre()+ " "
        +historia.getCodigo());
        
        Asignatura quimica = asignaturaFactory.crearAsignatura(4); 
        System.out.println("Nombre de la asignatura: " 
        + quimica.getNombre()+ " "
        +quimica.getCodigo());
        
        
    }
}
