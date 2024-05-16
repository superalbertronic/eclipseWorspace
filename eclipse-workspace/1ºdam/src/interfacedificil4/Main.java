package interfacedificil4;

import java.util.ArrayList;
import java.util.List;

// Interfaz para los participantes (alumnos y profesores)
interface Participante {
    String getNombre();
    int getEdad();
}

// Clase abstracta para los cursos
abstract class Curso {
    protected String nombre;
    protected double costo;
    protected int duracionEnHoras;

    public Curso(String nombre, double costo, int duracionEnHoras) {
        this.nombre = nombre;
        this.costo = costo;
        this.duracionEnHoras = duracionEnHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public int getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public abstract String tipoDeCurso();
}

// Clase para representar cursos teóricos
class CursoTeorico extends Curso {
    public CursoTeorico(String nombre, double costo, int duracionEnHoras) {
        super(nombre, costo, duracionEnHoras);
    }

    @Override
    public String tipoDeCurso() {
        return "Curso Teórico";
    }
}

// Clase para representar cursos prácticos
class CursoPractico extends Curso {
    public CursoPractico(String nombre, double costo, int duracionEnHoras) {
        super(nombre, costo, duracionEnHoras);
    }

    @Override
    public String tipoDeCurso() {
        return "Curso Práctico";
    }
}

// Clase para representar cursos de reciclaje
class CursoReciclaje extends Curso {
    public CursoReciclaje(String nombre, double costo, int duracionEnHoras) {
        super(nombre, costo, duracionEnHoras);
    }

    @Override
    public String tipoDeCurso() {
        return "Curso de Reciclaje";
    }
}

// Clase para representar alumnos
class Alumno implements Participante {
    private String nombre;
    private int edad;
    List<Curso> cursos;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursos = new ArrayList<>();
    }

    public void inscribirseACurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}

// Clase para representar profesores
class Profesor implements Participante {
    private String nombre;
    private int edad;

    public Profesor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}

// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        Curso cursoTeorico = new CursoTeorico("Curso de teoría de conducción", 200.0, 20);
        Curso cursoPractico = new CursoPractico("Curso de práctica de conducción", 500.0, 40);
        Curso cursoReciclaje = new CursoReciclaje("Curso de reciclaje de conducción", 150.0, 10);

        Alumno alumno1 = new Alumno("Juan", 25);
        alumno1.inscribirseACurso(cursoTeorico);
        alumno1.inscribirseACurso(cursoPractico);

        Alumno alumno2 = new Alumno("María", 30);
        alumno2.inscribirseACurso(cursoPractico);
        alumno2.inscribirseACurso(cursoReciclaje);

        Profesor profesor1 = new Profesor("Pedro", 40);
        Profesor profesor2 = new Profesor("Ana", 35);

        System.out.println("Información de los cursos:");
        System.out.println(cursoTeorico.tipoDeCurso() + ": " + cursoTeorico.getNombre() + ", Costo: $" + cursoTeorico.getCosto() + ", Duración: " + cursoTeorico.getDuracionEnHoras() + " horas");
        System.out.println(cursoPractico.tipoDeCurso() + ": " + cursoPractico.getNombre() + ", Costo: $" + cursoPractico.getCosto() + ", Duración: " + cursoPractico.getDuracionEnHoras() + " horas");
        System.out.println(cursoReciclaje.tipoDeCurso() + ": " + cursoReciclaje.getNombre() + ", Costo: $" + cursoReciclaje.getCosto() + ", Duración: " + cursoReciclaje.getDuracionEnHoras() + " horas");

        System.out.println("\nInformación de los alumnos:");
        System.out.println("Alumno: " + alumno1.getNombre() + ", Edad: " + alumno1.getEdad() + ", Cursos: " + alumno1.cursos.size());
        System.out.println("Alumno: " + alumno2.getNombre() + ", Edad: " + alumno2.getEdad() + ", Cursos: " + alumno2.cursos.size());

        System.out.println("\nInformación de los profesores:");
        System.out.println("Profesor: " + profesor1.getNombre() + ", Edad: " + profesor1.getEdad());
        System.out.println("Profesor: " + profesor2.getNombre() + ", Edad: " + profesor2.getEdad());
    }
}

