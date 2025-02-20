package ciclos;

import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        System.out.println("***Sistema de administarción cuentas**");

        var consola = new Scanner(System.in);
        var salir = false;

        //Iteracion del menu
        while (!salir) {
            System.out.println("\nElija una opción:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Eliminar cuenta");
            System.out.println("3. Salir");

            int opcion = consola.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Creando su cuenta...\n");
                case 2 -> System.out.println("Eliminar cuenta...");
                case 3 -> {
                    System.out.print("Saliendo...\s");
                    salir = true;

                }
                default -> System.out.println("Opción invalida...");
            }

        }
        System.out.println("Fin del sistema");
    }
}