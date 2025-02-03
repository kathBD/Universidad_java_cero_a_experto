package OperadoresJava;

import java.util.Scanner;

public class DescuentosVIP {
    public static void main(String[] args) {
        System.out.println("***Sistema de Descuentos VIP****");
        final var NUMERO_PRODUCTOS_DESCUENTOS = 10;
        var teclado = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy? ");
        var catidadProductos = Integer.parseInt(teclado.nextLine());
        System.out.println("Tienen Membresia de la tienda: (false/true) ");
        var tieneMembresia = Boolean.parseBoolean(teclado.nextLine());

        var esElegibleDescuento = catidadProductos >= NUMERO_PRODUCTOS_DESCUENTOS && tieneMembresia;
        if (esElegibleDescuento) {
            System.out.println("Descuento aplicado: 10%");
        } else {
            System.out.println("No tienes acceso al descuento VIP");
        }




    }
}
