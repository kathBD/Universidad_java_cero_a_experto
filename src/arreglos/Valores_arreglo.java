package arreglos;

import java.util.Scanner;

public class Valores_arreglo {
        public static void main(String[] args) {
                // Introducir valores a un arreglo
                var consola = new Scanner(System.in);
                //declarar arreglos
                System.out.println("Proporcione el alrgo del arreglo: ");
                var largoArreglo =Integer.parseInt((consola.nextLine()));
                // creamos de manera dinamica el arreglo
                var enteros = new  int[largoArreglo];
                //solicitar valroes del arreglo
                for(var i=0; i <largoArreglo; i++){
                        System.out.print("Proporciona enteros [" + i + " ] = ");
                        enteros[i]= Integer.parseInt((consola.nextLine()));
                }
                //Imprimer valores
                System.out.println("\nImpresión del arreglo:  ");
                for (var i=0; i<largoArreglo; i++)
                        System.out.println("enteros [" +i +  "] = " + enteros[i]);
        }
}
