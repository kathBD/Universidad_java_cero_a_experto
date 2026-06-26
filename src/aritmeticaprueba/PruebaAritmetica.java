package aritmeticaprueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("***Ejempo Aritmetica");
        var aritmetica1 = new Aritmetica(5, 7 );
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.suma();
        aritmetica1.restar();
        //Creamos objetos
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        var aritmetica2 = new Aritmetica(12, 16);
         aritmetica2.suma();
    }
}
