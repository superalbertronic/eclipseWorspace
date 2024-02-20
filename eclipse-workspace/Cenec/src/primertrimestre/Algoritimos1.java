package primertrimestre;

public class Algoritimos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean afirmacion;
		afirmacion= true && true;
		System.out.println("true && true= "+afirmacion);
		afirmacion=false&& false;
		System.out.println("false&& false= "+afirmacion);
		afirmacion=true&&false;
		System.out.println("true&&false= "+afirmacion);
		afirmacion=false&&true;
		System.out.println("false&&true= "+afirmacion);
		afirmacion= true || true;
		System.out.println("true||true= "+afirmacion);
		afirmacion=false || false;
		System.out.println("false||false= "+afirmacion);
		afirmacion=true || false;
		System.out.println("true||false= "+afirmacion);
		afirmacion=false|| true;
		System.out.println("false||true= "+afirmacion);
		
	}

}
