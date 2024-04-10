package co.com.ps.b4;


import java.util.Arrays;
import java.util.List;

public class ClaseStream {
        public static void main(String[] args) {
            List<String> palabras = Arrays.asList("Hola","como estas","donde estas");
            var miLista=palabras.stream().filter(palabra->palabra.length()>4).toList();

            List<String> palabras2 = Arrays.asList("Java","es","genial");

            var palabrasEnMayuscula= palabras2.stream().map(String::toUpperCase).toList();


            palabrasEnMayuscula.stream().forEach(System.out::println);
    }

}
