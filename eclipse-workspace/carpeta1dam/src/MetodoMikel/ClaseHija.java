package MetodoMikel;

class ClaseHija extends ClaseAbstracta {
    public ClaseHija(String nombre, String usuario) {
        super(nombre, usuario);
    }
    
    @Override
    public void Gracias() {
        System.out.println("Gracias por sus datos."+getUsuario());
    }
}