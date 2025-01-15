package Ejercicio7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Object> words = Arrays.asList("Antonio", 1, "a", 15, "los", 13, "Pipo");


        List<String> strings = words.stream()
               .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());


        List<Integer> numbers = words.stream()
                .filter(item -> item instanceof Integer)
                .map(item -> (Integer) item)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<Object> sortedList = new ArrayList<>();
        sortedList.addAll(numbers);
        sortedList.addAll(strings);

        System.out.println(sortedList);
    }
}

