import java.util.Scanner;

public class DibujarTriangulo {
    public static  void main(String [] args){

        System.out.println("DibujarTriangulo");
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el número de filas: ");
        int numeroFilas = consola.nextInt();
        //Iteracion
        for(int fila = 1; fila <= numeroFilas; fila++){
            String espaciosBlanco = " ".repeat(numeroFilas - fila);
            String asteriscos = "*".repeat(2*fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }

    }

}
