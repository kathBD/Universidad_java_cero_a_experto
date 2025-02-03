package OperadoresJava;

public class OperadoresComparacion {
    public static void main(String[] args) {
        /*
        *   == si dos valores son iguales
        *  != distintos dos valores
        *  mayor que > si un valor es mayor
        *  mayor o igual >= compara si es un valor mayor o igual
        * menor que < si un valor es menor
         *  menor o igual <= compara si es un valor menor o igual
        * */

        System.out.println("**Operadores de compracion o relacionales***");
        int a = 3, b = 2;
        // Igualdad ==
        var result = a == b; //tipos primitivos objetos es su tipo
        System.out.println("result = a ==b : " + result);

        //diferente
        result = a != b;
        System.out.println("result a !distinto de !=b " + result);

    }
}
