package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEjemplo {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Andalucia", 1);
        linkedHashMap.put("Madrid", 2);
        linkedHashMap.put("Extremadura", 3);

        System.out.println("LinkedHashMap: " + linkedHashMap);

        int value = linkedHashMap.get("Andalucia");
        System.out.println("Valor asociado a la clave 'Andalucia': " + value);
    }
}

