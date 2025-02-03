package OperadoresJava;

import java.util.Scanner;

public class CalculiAReaRectangulo {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = Double.parseDouble(teclado.nextLine());
  //calculo area de un tringulo

  var area = base * altura;
        System.out.println("area = " + area);
  var perimetro = 2 * (base + altura);
        System.out.println("perimetro = " + perimetro);



    }
}
