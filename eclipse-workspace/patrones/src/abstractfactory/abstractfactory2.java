package abstractfactory;

// Interfaz para el producto abstracto Silla
interface Silla1 {
    void describir();
}

// Interfaz para el producto abstracto Sofá
interface Sofa1 {
    void describir();
}
//mesa
interface Mesa1{
	void describir();
}

// Interfaz para la fábrica abstracta de muebles
interface FabricaMuebles1 {
    Silla1 crearSilla();
    Sofa1 crearSofa();
    Mesa1 crearMesa();
}

// Implementación concreta de la fábrica de muebles de estilo moderno
class FabricaMueblesModernos1 implements FabricaMuebles1 {
    @Override
    public Silla1 crearSilla() {
        return new SillaModerna1();
    }

    @Override
    public Sofa1 crearSofa() {
        return new SofaModerno1();
    }

	@Override
	public Mesa1 crearMesa() {
		// TODO Auto-generated method stub
		return new MesaModerna1();
	}
}

// Implementación concreta de la fábrica de muebles de estilo victoriano
class FabricaMueblesVictorianos1 implements FabricaMuebles1 {
    @Override
    public Silla1 crearSilla() {
        return new SillaVictoriana1();
    }

    @Override
    public Sofa1 crearSofa() {
        return new SofaVictoriano1();
    }

	@Override
	public Mesa1 crearMesa() {
		// TODO Auto-generated method stub
		return new MesaVictoriano1();
	}
}

// Implementación concreta del producto Silla moderna
class SillaModerna1 implements Silla1 {
    @Override
    public void describir() {
        System.out.println("Esta es una silla moderna.");
    }
}

// Implementación concreta del producto Sofá moderno
class SofaModerno1 implements Sofa1 {
    @Override
    public void describir() {
        System.out.println("Este es un sofá moderno.");
    }
}

class MesaModerna1 implements Mesa1{

	@Override
	public void describir() {
		System.out.println("Este es una mesa moderna.");
		
	}
	
}

// Implementación concreta del producto Silla victoriana
class SillaVictoriana1 implements Silla1 {
    @Override
    public void describir() {
        System.out.println("Esta es una silla victoriana.");
    }
}

// Implementación concreta del producto Sofá victoriano
class SofaVictoriano1 implements Sofa1 {
    @Override
    public void describir() {
        System.out.println("Este es un sofá victoriano.");
    }
}
class MesaVictoriano1 implements Mesa1{

	@Override
	public void describir() {
		System.out.println("Esta es una mesa victoriana.");
		
	}
	
}

// Ejemplo de uso
public class abstractfactory2 {
    public static void main(String[] args) {
        // Crear una fábrica de muebles modernos
        FabricaMuebles1 fabricaModernos = new FabricaMueblesModernos1();
        // Utilizar la fábrica para crear muebles modernos
        Silla1 sillaModerna = fabricaModernos.crearSilla();
        Sofa1 sofaModerno = fabricaModernos.crearSofa();
        Mesa1 mesaModerna=fabricaModernos.crearMesa();

        sillaModerna.describir();
        sofaModerno.describir();
        mesaModerna.describir();

        // Crear una fábrica de muebles victorianos
        FabricaMuebles1 fabricaVictorianos = new FabricaMueblesVictorianos1();
        // Utilizar la fábrica para crear muebles victorianos
        Silla1 sillaVictoriana = fabricaVictorianos.crearSilla();
        Sofa1 sofaVictoriano = fabricaVictorianos.crearSofa();
        Mesa1 mesaVictoriano=fabricaVictorianos.crearMesa();

        sillaVictoriana.describir();
        sofaVictoriano.describir();
        mesaVictoriano.describir();
    }
}


