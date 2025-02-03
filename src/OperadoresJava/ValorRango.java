package OperadoresJava;

import java.util.Scanner;

public class ValorRango {
    public static void main(String[] args) {
        //se definen los limites
       final var MIN =  0;
        final var  MAX = 5;
// solicitar valor entre o y 5
        System.out.println("Introduce un número entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());

//Verificar dato si esta dentrp de  rango
        boolean isWithinRange = dato >= MIN && dato <= MAX;

        System.out.println("El número " + dato + " está dentro del rango de " + MIN + " a " + MAX + ": " + isWithinRange);
    }
}
