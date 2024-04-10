package co.com.ps.b6;

import java.util.Scanner;
public class CalculadoraEjercicioEnClase {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                mostrarMenu();
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        sumar(scanner);
                        break;
                    case 2:
                        restar(scanner);
                        break;
                    case 3:
                        multiplicar(scanner);
                        break;
                    case 4:
                        dividir(scanner);
                        break;
                    case 5:
                        System.out.println("Saliendo de la calculadora...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            } while (opcion != 5);

            scanner.close();
        }

        public static void mostrarMenu() {
            System.out.println("***** Calculadora *****");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
        }

        public static void sumar(Scanner scanner) {
            try {
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();
                int resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error. Asegúrese de ingresar números enteros.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        public static void restar(Scanner scanner) {
            try {
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();
                int resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error. Asegúrese de ingresar números enteros.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        public static void multiplicar(Scanner scanner) {
            try {
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();
                int resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error. Asegúrese de ingresar números enteros.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        public static void dividir(Scanner scanner) {
            try {
                System.out.print("Ingrese el dividendo: ");
                int dividendo = scanner.nextInt();
                System.out.print("Ingrese el divisor: ");
                int divisor = scanner.nextInt();
                if (divisor == 0) {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
                int resultado = dividendo / divisor;
                System.out.println("La división es: " + resultado);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error. Asegúrese de ingresar números enteros.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }

