package EntradaDatosConsola;


import java.util.Scanner;

public class ConversionDatos {
    public static void main(String[] args) {
     var entrada = new Scanner(System.in);
     //conversion de datos
        System.out.println("Proporciona en valor entero: ");
        var enteroString = entrada.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("El valor entero es: " + entero);
        System.out.print("EScribe flotante: ");
        var flotante = Float.parseFloat(entrada.nextLine());

        System.out.println("flotante = " + flotante);
    }
}
