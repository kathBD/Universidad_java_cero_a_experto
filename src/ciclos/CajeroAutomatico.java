package ciclos;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("Bienvenido cajero Banco");
        double saldo = 10000;
        var salir = false;


        Scanner  scanner = new Scanner(System.in);


        while (!salir){
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");

         int   opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de dinero a depositar:");
                    double monto = scanner.nextDouble();
                    saldo += monto;
                    System.out.println("Dinero ingresado exitosamente. Saldo actual: " + "$" +  saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero a retirar:");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo){
                        System.out.println("No tienes suficiente saldo.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Dinero retirado exitosamente. Saldo actual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Su saldo es: " + saldo);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema..");
                    salir = true;
            }
            System.out.println("Sistema cerrado exitosamente. " );
        }

    }

}
