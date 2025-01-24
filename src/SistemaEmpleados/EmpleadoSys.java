package SistemaEmpleados;

import java.util.Scanner;

public class EmpleadoSys {
    public static void main(String[] args) {
        //Infrmacion Empleados
        System.out.println("***Sistema de Empleados****");

        var entrada = new Scanner(System.in);
        //Nombre del empleado
        System.out.print("Ingrese nombre empleado: ");
        var nombreEmpleado = entrada.nextLine();

        //Edad Empleado
        System.out.print("Ingrese edad: ");
        var edadEmpleado = Integer.parseInt(entrada.nextLine());

        //salario empleado
        System.out.print("Ingrese Salario Empleado: ");
        var sueldoEmpleado = Double.parseDouble(entrada.nextLine());

        //Cargo Gerencial
        System.out.print("Es gerente: (true/false): ");
        var esGerente = Boolean.parseBoolean(entrada.nextLine());

        //Imprimir Empleado
        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        System.out.println("\tSueldo: " + sueldoEmpleado);
        System.out.printf("\tSueldo con formato: $%.2f%n", sueldoEmpleado);
        System.out.println("\tEs gerente: " + esGerente);

        entrada.close(); //Cerrar el scanner

    }
}
