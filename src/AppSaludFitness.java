import java.util.Scanner;

public class AppSaludFitness {
    public static void main(String[] args) {
        System.out.println("***Salud y Fitnes");
        //Constantes
        final var METE_PASOS_PASOS = 10000;
        final var CALORIAS_POR_PASO =  0.04; //valor aproximado son kilocalorias

        // valores del usuario

        var teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var nombre = teclado.nextLine();
        System.out.print("Cuanto pasos has caminado hoy?  ");
        var pasos = Integer.parseInt(teclado.nextLine());

      // verificar meta de pasos diarios

        var meta = (pasos >= METE_PASOS_PASOS) ? "Si, felicidades cumpliste tu meta :)" : "NO, :( cumpliste tu meta, sigue adelante no te rindas";
     // calcular las calorias quemadas
        var caloriasQuemadas = CALORIAS_POR_PASO * pasos;

        System.out.println("\nHola " + nombre + "! " + meta);
        System.out.printf("Has quemado %.2f kilocalorias durante este día.\n", caloriasQuemadas);
    }
}
