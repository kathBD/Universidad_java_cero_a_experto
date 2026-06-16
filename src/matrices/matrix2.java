package matrices;

import com.sun.source.tree.BinaryTree;
import jdk.jshell.EvalException;

public class matrix2 {
    public static void main(String[] args) {

        var matriz = new int[][]{
                {100,200,300},
                {400,500,600},
        };

        //recorrer ciclo mas externo
        for(var ren = 0; ren<matriz.length; ren++){
            //ciclo mas interno
            for(var col =0; col<matriz[ren].length; col++){
                System.out.println("valor [ " + ren + "][" + col + "] " + matriz[ren][col] );
            }

        }



        /**   final var FILA = 2;
        final var COLUMNAS = 3;
      var matriz= new int [FILA][COLUMNAS];
        matriz[0][0]=100;
        matriz[0][1]=200;
        matriz[0][2]=300;
        matriz[1][0]=400;
        matriz[1][1]=500;
        matriz[1][2]=600;
        //recorrer una matriz
        //recorrer ciclo mas externo
        for(var ren = 0; ren<FILA; ren++){
            //ciclo mas interno
            for(var col =0; col<COLUMNAS; col++){
                System.out.println("valor [ " + ren + "][" + col + "] " + matriz[ren][col] );
            }

        }


         */


    }

}
