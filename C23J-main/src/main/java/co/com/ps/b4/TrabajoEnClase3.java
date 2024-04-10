package co.com.ps.b4;

import java.util.Scanner;
public class TrabajoEnClase3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una palabra con 8 letras:");
        String palabra = scanner.nextLine();

        if (palabra.length() == 8) {

            int cantidadLetras = palabra.length();

            System.out.println("La palabra '" + palabra + "' tiene " + cantidadLetras + " letras.");
        } else {
            System.out.println("La palabra ingresada no tiene exactamente 8 letras.");
        }
        scanner.close();
    }
}

