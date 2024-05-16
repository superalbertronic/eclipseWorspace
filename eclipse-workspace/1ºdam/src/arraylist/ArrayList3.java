package arraylist;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        // Crear un ArrayList de objetos de tipo MiObjeto
        ArrayList<MiObjeto> miArrayList = new ArrayList<>();

        // A�adir algunos objetos al ArrayList
        miArrayList.add(new MiObjeto("Valor 1"));
        miArrayList.add(new MiObjeto("Valor 2"));
        miArrayList.add(new MiObjeto("Valor 3"));

        // Obtener el objeto en la posici�n 1 (la primera posici�n tiene el �ndice 0)
        MiObjeto objetoEnPosicion1 = miArrayList.get(1);

        // Imprimir el valor del objeto en la posici�n 1
        System.out.println("El objeto en la posici�n 1 es: " + objetoEnPosicion1);
    }
}

class MiObjeto {
    private String valor;

    public MiObjeto(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}