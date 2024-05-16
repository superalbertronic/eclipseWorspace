package abstractfactory;

//Interfaz para el producto abstracto profesorfp
interface ProfesorFp {
    void describirProfesor();
}

//Interfaz para el producto abstracto alumnofp
interface AlumnoFp {
    void describirAlumnor();
}


//Interfaz para la fábrica abstracta de centrofp
interface CentroFp {
    ProfesorFp crearProfesor();
    AlumnoFp crearAlumno();
    }

//Implementación concreta de la fábrica de alumnos y profesores
class CentroFpSanitaria implements CentroFp {
    @Override
    public ProfesorFp crearProfesor() {
        return new ProfesorFpSanitaria();
    }

    @Override
    public AlumnoFp crearAlumno() {
        return new AlumnoFpSanitaria();
    }   
}
//Implementación concreta de profesores rama sanitaria
class ProfesorFpSanitaria implements ProfesorFp {
    @Override
    public void describirProfesor() {
        System.out.println("Este profesor es de la rama sanitaria.");
    }
}

//Implementación concreta del alumnos rama sanitaria
class AlumnoFpSanitaria implements AlumnoFp {
    @Override
    public void describirAlumnor() {
        System.out.println("Este alumno es de la rama sanitaria.");
    }
}
//fp rama informatica
class CentroFpInformatica implements CentroFp {
    @Override
    public ProfesorFp crearProfesor() {
        return new ProfesorFpInformatica();
    }

    @Override
    public AlumnoFp crearAlumno() {
        return new AlumnoFpInformatica();
    }   
}
//Implementación concreta de profesores rama informatica
class ProfesorFpInformatica implements ProfesorFp {
    @Override
    public void describirProfesor() {
        System.out.println("Este profesor es de la rama informatica.");
    }
}

//Implementación concreta del alumnos rama informatica
class AlumnoFpInformatica implements AlumnoFp {
    @Override
    public void describirAlumnor() {
        System.out.println("Este alumno es de la rama informatica.");
    }
}

//implementacion de la rama administrativa

class CentroFpAdministrativa implements CentroFp {
    @Override
    public ProfesorFp crearProfesor() {
        return new ProfesorFpAdministrativa();
    }

    @Override
    public AlumnoFp crearAlumno() {
        return new AlumnoFpAdministrativa();
    }   
}
//Implementación concreta de profesores rama sanitaria
class ProfesorFpAdministrativa implements ProfesorFp {
    @Override
    public void describirProfesor() {
        System.out.println("Este profesor es de la rama administratica.");
    }
}

//Implementación concreta del alumnos rama sanitaria
class AlumnoFpAdministrativa implements AlumnoFp {
    @Override
    public void describirAlumnor() {
        System.out.println("Este alumno es de la rama administrativa.");
    }
}




//Ejemplo de uso
public class abstractfactory3 {
    public static void main(String[] args) {
        //rama sanitaria
    	CentroFpSanitaria ramasanitaria = new CentroFpSanitaria();
            	
        ProfesorFp profesorFpsanitaria = ramasanitaria.crearProfesor();
        AlumnoFp alumnoFpSanitaria = ramasanitaria.crearAlumno();
       
        profesorFpsanitaria.describirProfesor();
        alumnoFpSanitaria.describirAlumnor();
       
      //rama informatica
    	CentroFpInformatica ramainformatica = new CentroFpInformatica();
            	
        ProfesorFp profesorFpinformatica = ramainformatica.crearProfesor();
        AlumnoFp alumnoFpinformatica = ramainformatica.crearAlumno();
       
        profesorFpinformatica.describirProfesor();
        alumnoFpinformatica.describirAlumnor();
        
        // rama administrativa
        //rama informatica
    	CentroFpAdministrativa ramaAdministrativa = new CentroFpAdministrativa();
            	
        ProfesorFp profesorFpAdministrativa = ramaAdministrativa.crearProfesor();
        AlumnoFp alumnoFpAdministrativa = ramaAdministrativa.crearAlumno();
       
        profesorFpAdministrativa.describirProfesor();
        alumnoFpAdministrativa.describirAlumnor();
        
        
    }
}
