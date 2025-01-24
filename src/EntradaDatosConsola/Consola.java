package EntradaDatosConsola;

import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        //introducir valores por consola
        var scanner = new Scanner(System.in); // in - input -entrada de datos
        System.out.print("Introduce tu nombre: ");
        var nombre = scanner.nextLine(); // in - entrada de datos
        System.out.println("nombre = " + nombre);

    }
}
