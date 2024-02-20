package tutorialesprogramacionya;

//Código Java sobre el uso de this() para
//invocar al constructor de la clase actual
class TestThis
{
 int a;
 int b;

 //Constructor predeterminado
 TestThis()
 {  
     this(10, 20);
     System.out.println("Dentro del constructor predeterminado \n");
 }
  
 //Constructor parametrizado
 TestThis(int a, int b)
 {
     this.a = a;
     this.b = b;
     System.out.println("Dentro del constructor parametrizado");
 }

 public static void main(String[] args)
 {
     TestThis object = new TestThis();
 }
}