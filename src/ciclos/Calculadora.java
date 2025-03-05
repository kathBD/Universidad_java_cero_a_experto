package ciclos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("***Calculadora en Java***");
        Scanner scanner = new Scanner(System.in);
        Boolean salir = false;
        int operacion;


        double num1 =0, num2 = 0;
        double resultado; //forma del profesor

        while (!salir) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            operacion = scanner.nextInt();
            if(operacion >= 1 && operacion <=4) {

                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
            }
            switch (operacion) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.printf("El resultado de la suma: %.2f%n%n", resultado);
                }
                case 2 -> System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
                case 3 -> System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0)
                        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2)); }
                case 5 -> {
                        System.out.print("Saliendo...\s");
                        salir = true;
                    }
                    default -> System.out.println("Opción inválida");
                }


            }

        System.out.println("Fin del sistema");
        }

    }



