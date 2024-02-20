package refactorizarmediator;

import java.util.ArrayList;
import java.util.List;

// La interfaz Mediator define un método que los componentes utilizarán para comunicarse entre sí.
interface Mediator {
    void enviarMensaje(String mensaje, Usuario usuario);
}

// La clase ChatRoom es el Mediator concreto que implementa la interfaz Mediator
class ChatRoom implements Mediator {
    private List<Usuario> usuarios = new ArrayList<>();

    // Agregar un usuario a la lista de usuarios
    void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            // No envía el mensaje al usuario que lo envió originalmente
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }
}

// La clase Usuario representa los componentes que se comunican entre sí a través del Mediator.
class Usuario {
    private String nombre;
    private Mediator mediator;

    public Usuario(String nombre, Mediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    // El usuario envía un mensaje a través del Mediator
    void enviarMensaje(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    // El usuario recibe un mensaje del Mediator
    void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibió el mensaje: " + mensaje);
    }
}

// Ejemplo de uso del patrón de diseño Mediator
public class mediator1 {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Usuario juan = new Usuario("Juan", chatRoom);
        Usuario maria = new Usuario("Maria", chatRoom);
        Usuario pedro = new Usuario("Pedro", chatRoom);

        chatRoom.agregarUsuario(juan);
        chatRoom.agregarUsuario(maria);
        chatRoom.agregarUsuario(pedro);

        juan.enviarMensaje("Hola a todos!");
        maria.enviarMensaje("Hola Juan y Pedro!");
    }
}

