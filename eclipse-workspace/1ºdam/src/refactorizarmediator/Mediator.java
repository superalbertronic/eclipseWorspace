package refactorizarmediator;

import java.util.ArrayList;
import java.util.List;

// La interfaz Mediator define un mÃ©todo que los componentes utilizarÃ¡n para comunicarse entre sÃ­.
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
            // No envÃ­a el mensaje al usuario que lo enviÃ³ originalmente
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }
}

// La clase Usuario representa los componentes que se comunican entre sÃ­ a travÃ©s del Mediator.
class Usuario {
    private String nombre;
    private Mediator mediator;

    public Usuario(String nombre, Mediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    // El usuario envÃ­a un mensaje a travÃ©s del Mediator
    void enviarMensaje(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    // El usuario recibe un mensaje del Mediator
    void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibiÃ³ el mensaje: " + mensaje);
    }
}

// Ejemplo de uso del patrÃ³n de diseÃ±o Mediator
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

