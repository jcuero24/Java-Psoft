package co.com.ps.b3;

import java.util.Scanner;

public class EntradaConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba su nombre: ");
        String nombre = scanner.next();
        System.out.print("Su nombre es "+ nombre);

        System.out.print("Escriba su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Su edad es "+ edad);
    }

}
