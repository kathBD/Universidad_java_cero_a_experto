package matrices;



import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        //suma de diagola de una matriz

        int filas, columnas;
        var consola = new Scanner(System.in);
        //definir valores
        System.out.println("Introduzca las filas: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.println("Introduzca las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[filas][columnas];
        //solicitamos valores
        for(var fil=0; fil < filas; fil++){
            for (var col=0; col<columnas; col++){
                System.out.print("Valor [" + fil + "] [" + col + "] = ");
                matriz[fil][col] =Integer.parseInt((consola.nextLine()));
            }
        }
        //suma diagonal
        System.out.println();
        var sumaDiagonal = 0;
        for(var fil=0; fil < filas; fil++) {
            for (var col = 0; col < columnas; col++){
                if(fil ==col)
                    sumaDiagonal += matriz[fil][col];
            }

        }
        System.out.println("Suma diagola de matriz cuadrada: " + sumaDiagonal);
    }


    }
