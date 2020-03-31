package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        hashMap.put(6, "Six");
        hashMap.put(7, "Seven");
        hashMap.put(8, "Eight");
        hashMap.put(9, "Nine");
        hashMap.put(10, "Ten");

        List<Map.Entry<Integer, String>> a = hashMap.entrySet().stream().filter(x -> x.getKey() > 5).collect(Collectors.toList());
        System.out.println(a);

        hashMap.entrySet().stream().forEach(x -> {
            if (x.getKey() % 3 == 0) { System.out.print(x + ",");
            } else { System.out.print(x +" "); } });

        Integer b = hashMap.entrySet().stream().filter(x -> x.getKey() > 5)
                .map(x -> x.getKey()).reduce((x,x1) -> x*x1).orElse(1);
        System.out.println("\n"+b);

    }
}

