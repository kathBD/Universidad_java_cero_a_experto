package matrices;

import java.util.Scanner;

public class IntroduccionDatos {

    public static void main(String[] args) {

        int filas, columnas;
        var consola = new Scanner(System.in);

        System.out.print("Introducir las filas: ");
        filas = Integer.parseInt(consola.nextLine());

        System.out.print("Introducir las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[filas][columnas];

        // Introducir valores
        for (var fil = 0; fil < filas; fil++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Valor [" + fil + "][" + col + "] = ");
                matriz[fil][col] = Integer.parseInt(consola.nextLine());
            }
        }

        // Mostrar valores
        for (var fil = 0; fil < filas; fil++) {
            for (var col = 0; col < columnas; col++) {
                System.out.println("Matriz [" + fil + "][" + col + "] = " + matriz[fil][col]);
            }
        }

        consola.close();
    }
}