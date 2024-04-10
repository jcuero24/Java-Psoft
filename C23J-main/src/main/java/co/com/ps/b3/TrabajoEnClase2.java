package co.com.ps.b3;

import java.util.Scanner;
//Crear una calculadora que funcion por consola pidiendo 2 datos numericos
public class TrabajoEnClase2 {

    public static void main(String[] args) {
        /*
        int a = 0,b = 0;
        double result = a/b;
         */
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número correspondiente a la operación: ");
        int opcion = scanner.nextInt();

        double resultado = 0;


        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return; // Salir del programa si intenta dividir por cero
                }
                break;
            default:
                System.out.println("Opción inválida.");
                return; // Salir del programa si la opción no es válida
        }
        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}



