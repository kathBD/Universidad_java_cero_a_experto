import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("Sistema de CAlificaciones");
        var scanner = new Scanner(System.in);
        System.out.println("Introduzca una calificación entre 0 y 10: ");
        var calificacion = Double.parseDouble(scanner.nextLine());
        String calificacionLetra = null;

        //rangos
        if (calificacion >= 9 && calificacion <= 10) {
            calificacionLetra = "A";
        } else if (calificacion >= 8 && calificacion <= 9) {
            calificacionLetra = "B";
        } else if (calificacion >= 7 && calificacion < 8) {
            calificacionLetra = "C";
        } else if (calificacion >= 6 && calificacion < 7) {
            calificacionLetra = "D";
        }else if (calificacion >= 0 && calificacion < 6) {
            calificacionLetra = "E";
    }else {
            calificacionLetra = "Calificación incorrecta";
        }
        //Imprimir resultado
        System.out.printf("Calificación %.1f es equivalente %s ", calificacion, calificacionLetra);
        }
}