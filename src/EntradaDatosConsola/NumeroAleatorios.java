package EntradaDatosConsola;

import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {
        //Valores aleatorios
        System.out.println("Números Aleatorios");
       //Random  random= new Random();
        var random = new Random();
        //generar numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10); //el valor que escribimos no se incluye
        System.out.println("numeroAleatorio entre 1 y 9 = " + numeroAleatorio);
        //generar numero aleatorio entre 0 y 10
        var numeroAleatorio10 = random.nextInt(10)+ 1; //el valor que escribimos + 1 para agregar hasta 10
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio10);

        //generar un numero flotante entre 0.0 y 1.0
        var numeroFlotante = random.nextFloat();
        System.out.println("numeroFlotante = " + numeroFlotante);

        //simular lanzamiento de dado
        var dado = random.nextInt(6)+1;
        System.out.println("lanzamiento de Dado = " + dado);
    }
}
