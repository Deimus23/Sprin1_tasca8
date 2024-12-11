package Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Paco", "Tania", "Fede", "Juan", "Carlos", "Olivia ");
        System.out.println(words);

        List<String> filtredWords = words.stream()
                .filter(word -> word.toLowerCase().contains("o")&& word.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filtredWords);
    }
}

