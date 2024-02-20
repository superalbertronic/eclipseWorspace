package colecciones;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LinkedHashMapOrdenado {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Java", 2);
        linkedHashMap.put("Python", 1);
        linkedHashMap.put("JavaScript", 3);

        System.out.println("LinkedHashMap sin ordenar: " + linkedHashMap);

        LinkedHashMap<String, Integer> linkedHashMapOrdenado = linkedHashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));

        System.out.println("LinkedHashMap ordenado por valor: " + linkedHashMapOrdenado);
    }
}
