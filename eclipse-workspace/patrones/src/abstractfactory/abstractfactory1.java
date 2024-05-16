package abstractfactory;

// Interfaz para el producto abstracto Silla
interface Silla {
    void describir();
}

// Interfaz para el producto abstracto Sofá
interface Sofa {
    void describir();
}

interface Mesa{
	void describir();
}
interface Lampara{
	void describirLampara();
}

// Interfaz para la fábrica abstracta de muebles
interface FabricaMuebles {
    Silla crearSilla();
    Sofa crearSofa();
    Mesa crearMesa();
    Lampara crearLampara();
}


// Implementación concreta de la fábrica de muebles de estilo moderno
class FabricaMueblesModernos implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }
    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
    @Override
    public Lampara crearLampara() {
        return new LamparaModerna();
    }
    
}
//crear fabrica de muebles victoriano
//Implementación concreta de la fábrica de muebles de estilo moderno
class FabricaMueblesVictorianos implements FabricaMuebles {
 @Override
 public Silla crearSilla() {
     return new SillaVictoriana();
 }

 @Override
 public Sofa crearSofa() {
     return new SofaVictoriana();
 }
 @Override
 public Mesa crearMesa() {
     return new MesaVictoriana();
 }
 @Override
 public Lampara crearLampara() {
     return new LamparaVictoriana();
 }
 
}


// Implementación concreta del producto Silla moderna
class SillaModerna implements Silla {
    @Override
    public void describir() {
        System.out.println("Esta es una silla moderna.");
    }
}

// Implementación concreta del producto Sofá moderno
class SofaModerno implements Sofa {
    @Override
    public void describir() {
        System.out.println("Este es un sofá moderno.");
    }
}

class MesaModerna implements Mesa{
	 @Override
	    public void describir() {
	        System.out.println("Este es una mesa moderna.");
	    }
}
class LamparaModerna implements Lampara{
	@Override
    public void describirLampara() {
        System.out.println("Este es una lampara moderna.");
    }
}




//muebles victorianas
class SillaVictoriana implements Silla{
	@Override
    public void describir() {
        System.out.println("Este es una silla victoriana.");
    }
}

//muebles victorianas
class SofaVictoriana implements Sofa{
	@Override
  public void describir() {
      System.out.println("Este es un sofa victoriana.");
  }
}

//muebles victorianas
class MesaVictoriana implements Mesa{
	@Override
  public void describir() {
      System.out.println("Este es una mesa victoriana.");
  }
}
class LamparaVictoriana implements Lampara{
	@Override
    public void describirLampara() {
        System.out.println("Este es una lampara victoriana.");
    }
}

// Ejemplo de uso
public class abstractfactory1 {
    public static void main(String[] args) {
        // Crear una fábrica de muebles modernos
        FabricaMuebles fabricaModernos = new FabricaMueblesModernos();
        FabricaMuebles fabricavictoriano= new FabricaMueblesVictorianos();
        // Utilizar la fábrica para crear muebles modernos
        Silla sillaModerna = fabricaModernos.crearSilla();
        Sofa sofaModerno = fabricaModernos.crearSofa();
        Mesa mesaModerna=fabricaModernos.crearMesa();
        Lampara lamparaModerna=fabricaModernos.crearLampara();
        sillaModerna.describir();
        sofaModerno.describir();
        mesaModerna.describir();
        lamparaModerna.describirLampara();

        
        //muebles victorianos
        Silla sillavictoriano = fabricavictoriano.crearSilla();
        Sofa sofavictoriano = fabricavictoriano.crearSofa();
        Mesa mesavictoriano=fabricavictoriano.crearMesa();
        Lampara lamparavictoriana=fabricavictoriano.crearLampara();
        sillavictoriano.describir();
        sofavictoriano.describir();
        mesavictoriano.describir();
        lamparavictoriana.describirLampara();
        
        
           }
}

