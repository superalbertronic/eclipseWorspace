package colecciones;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapEjemplo {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Madrid", 2);
        treeMap.put("Andalucia", 1);
        treeMap.put("Extremadura", 3);

        System.out.println("TreeMap: " + treeMap);

        int value = treeMap.get("Madrid");
        System.out.println("Valor asociado a la clave 'Madrid': " + value);
       //mostrar todos los datos
        for (String key : treeMap.keySet()) {
            int valor = treeMap.get(key);
            System.out.println(key + " -> " + valor);
        }
        //si queremos saber el valor asociado a la clave
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("La clave asociada al valor 1 es: " + entry.getKey());
                
            }
        }
        
    }
}

