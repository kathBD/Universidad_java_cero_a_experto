package arreglos;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("***Promedio de Calificaciones");
        //número de calificaciones a promediar
        var scanner = new Scanner(System.in);
        System.out.print("Introduzca el número de calificaciones que va a promediar: " );
        var calificaciones = Integer.parseInt(scanner.nextLine());
        //solicitar notas
        var totalCalificaciones = new int[calificaciones];
         for(var i=0; i<calificaciones; i++) {
             System.out.print("Introduce las notas [" + i + " ] = ");
             totalCalificaciones[i]= Integer.parseInt((scanner.nextLine()));
         }

        //Imprimer promedio
        var sumapromedio = 0;
        for (var i=0; i<calificaciones; i++) {
           sumapromedio += totalCalificaciones[i]; //sumaPromedios = sumaPromedio + totalcalificacioens

    }
         var promedio = sumapromedio / calificaciones;
        System.out.println("Promedio notas: " + promedio);
    }
}
