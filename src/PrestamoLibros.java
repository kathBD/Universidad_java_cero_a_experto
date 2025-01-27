import java.util.Scanner;

public class PrestamoLibros {

    public static void main(String[] args) {
        System.out.println("***Sistema de Prestamos de Libros ***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var teclado = new Scanner(System.in);

        System.out.println("POsee credencial de estuduante (true/false)?: ");
        var tieneCredencial = Boolean.parseBoolean(teclado.nextLine());

        System.out.println("A cuantos kilometros vives de la biblioteca?");
        var distancia = Integer.parseInt(teclado.nextLine());

        var esElegiblePrestamo =  tieneCredencial || distancia <= DISTANCIA_PERMITIDA_KM ;

        if (esElegiblePrestamo) {
            System.out.println("Usted puede solicitar prestamo de libros.");
        } else {
            System.out.println("Usted no puede solicitar prestamo de libros.");
        }


    }
}
