package proyectoxmlmaven;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MainInverso {
    public static void main(String[] args) {
        try {
            // Establecer conexión con la base de datos
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "usuario", "contraseña");
            Statement statement = conn.createStatement();

            // Consultar la base de datos y obtener los datos de la tabla alumno
            ResultSet resultSet = statement.executeQuery("SELECT * FROM alumno");

            // Crear una lista para almacenar los objetos Alumno
            List<Alumno> alumnos = new ArrayList<>();

            // Recorrer el resultado de la consulta y crear objetos Alumno
            while (resultSet.next()) {
                Alumno alumno = new Alumno(null, null, null, null, null, null);
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setTelefono(resultSet.getString("telefono"));
                alumno.setDireccion(resultSet.getString("direccion"));
                alumno.setCp(resultSet.getString("cp"));
                alumno.setEmail(resultSet.getString("email"));
                alumnos.add(alumno);
            }

            // Crear un contexto JAXB para la clase Alumno
            JAXBContext jaxbContext = JAXBContext.newInstance(Alumno.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // Formatear el XML para que sea legible
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Escribir los objetos Alumno en un archivo XML
            File xmlFile = new File("alumno2.xml");
            FileOutputStream fos = new FileOutputStream(xmlFile);
            for (Alumno alumno : alumnos) {
                jaxbMarshaller.marshal(alumno, fos);
            }

            // Cerrar la conexión
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

