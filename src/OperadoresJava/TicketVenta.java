package OperadoresJava;

import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("***Generación de ticket de venta ***");
        var teclado = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(teclado.nextLine());
        System.out.print("Precio Pan: ");
        var precioPan = Double.parseDouble(teclado.nextLine());
        System.out.print("Precio cafè: ");
        var precioCafe = Double.parseDouble(teclado.nextLine());
        System.out.print("Precio galletas: ");
        var precioGalletas = Double.parseDouble(teclado.nextLine());

        // Descuento en función del total de la compra
        System.out.println("Aplicar algún descuento (%) ?");
        var descuento = Integer.parseInt(teclado.nextLine());

        // Calculo del subTotal (sin impuestos)
        var subTotal = precioLeche + precioPan + precioCafe + precioGalletas;
        System.out.println("Subtotal: $" + subTotal);

        // Calculo descuento
        var descuentoCompra = subTotal * (descuento / 100.0);
        var subTotalConDescuento = subTotal - descuentoCompra;

        // Calculo con impuestos
        var impuesto = subTotalConDescuento * 0.16;
        var costoTotalCompra = subTotalConDescuento + impuesto;

        // Impresión del ticket
        System.out.printf("""
                        %n Ticket de venta
                        ----------------
                        Leche: $%.2f
                        Pan: $%.2f
                        Café: $%.2f
                        Galletas: $%.2f
                        ----------------
                        Subtotal: $%.2f
                        Descuento: $%.2f (%d%%)
                        Impuesto: (16%%): $%.2f
                        Costo total: $%.2f
                        """, precioLeche, precioPan, precioCafe, precioGalletas, subTotal, descuentoCompra, descuento, impuesto, costoTotalCompra);

        System.out.println("Gracias por su compra!!!!");

        teclado.close();
    }
}

