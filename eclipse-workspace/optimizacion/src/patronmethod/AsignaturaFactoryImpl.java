package patronmethod;

public class AsignaturaFactoryImpl implements 
AsignaturaFactory {
    public Asignatura crearAsignatura(int codigo) {
        switch(codigo) {
            case 1:
                return new Matematicas();
            case 2:
                return new Fisica();
            case 3:
                return new Historia();
            case 4:
                return new Quimica();
                
                
            default:
                throw new 
                IllegalArgumentException
                ("Código de asignatura no válido");
        }
    }
}
