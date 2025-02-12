package FundamentosJava.EntradaDatosConsola;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer diferentes tipos de datos
        var consola = new Scanner(System.in);

        System.out.print("Ingrese edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        //Leer un tipo double
        System.out.print("Ingresa altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        //consumir el salto de linea
        consola.nextLine();
        //Leer un String
        System.out.print("Ingrese nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //Cerrar el Scanner
        consola.close();


        

    }
}
