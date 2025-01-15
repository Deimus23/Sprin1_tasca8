package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Paco", "Tania", "Fede", "Juan", "Carlos", "Olivia ");
        System.out.println(words);
        filterWords(words);
    }
    public static void filterWords(List<String> words) {

        List<String> filteredWords = words.stream()
                .map(String::trim)
                .filter(word -> word.toLowerCase().contains("o"))
                .collect(Collectors.toList());
        System.out.println("Palabras filtradas: " + filteredWords);
    }
}
