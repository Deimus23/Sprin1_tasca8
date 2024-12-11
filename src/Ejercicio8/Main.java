package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        String toReverse="Hello world";
        Reverse reversed= (a) -> new StringBuilder(toReverse).reverse().toString();
        System.out.println(reversed.reverse(toReverse));
    }
}

