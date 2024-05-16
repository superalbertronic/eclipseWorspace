package AdapterBásico;

class CirculoAdapter implements Forma {
    private Circulo circulo;

    public CirculoAdapter(Circulo circulo) {
        this.circulo = circulo;
    }

    @Override
    public double obtenerArea() {
        return circulo.obtenerAreaCirculo();
    }
    public String mensaje() {
		return "Hola";
    	
    }
}