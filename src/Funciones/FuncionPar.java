package Funciones;

import java.util.Scanner;

public class FuncionPar {
    //funcion para saber si es par
    static boolean esPar(int num) {
  /*      if(num % 2 == 0 )
            return true;
        else
            return false;

   */
        //ternario
        return (num % 2 == 0 )? true: false;
    }


    public static void main(String[] args) {
        System.out.print("Proporciona un número para saber si es par: ");
        var num = Integer.parseInt((new Scanner(System.in).nextLine() ));
        System.out.println("Número par ?:  " + esPar(num));

    }
}
