package Funciones;

import java.util.Scanner;

public class FuncionSumar {

    //definir la funcion sumar
    static int sumar(int a, int b){
        var result = a + b;
        return  result;
    }

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Intorduzca el primer número a sumar: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Intorduzca el primer número a sumar: ");
        var num2 = Integer.parseInt(consola.nextLine());
        System.out.print("Resultado de la Suma: " + sumar(num1, num2));


    }

}
