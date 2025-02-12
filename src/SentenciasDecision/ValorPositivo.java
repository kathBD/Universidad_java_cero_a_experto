package SentenciasDecision;

import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("***Valor Positico****");

        var teclado = new Scanner(System.in);
        System.out.println("Introducce un núumero");
        var numero = Integer.parseInt(teclado.nextLine());

        if(numero >0){
            System.out.println("numero positivo = " + numero);
        } else if (numero < 0) {
         System.out.println("numero negativo = " + numero);
        }else{
            System.out.println("El número es 0");
        }

    }
}
