import java.util.Objects;
import java.util.Scanner;

public class RetoTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese monto total de compra: ");
        var  totalCompra = Integer.parseInt(scanner.nextLine());
        System.out.print("Es miembro de la tienda (true/false): ");
        var  miembroTienda = Boolean.parseBoolean(scanner.nextLine());
        //calcular descuento

        if (totalCompra > 1000 && miembroTienda) {
            System.out.println("%nFelicidades, Has obtenido un descuento del 10% $" + (totalCompra * 0.1));

        } else if (miembroTienda){
                System.out.println("%nFelicidades, Has obtenido un descuento del 5%  $" + totalCompra * 0.05);
            }else {
            System.out.println("Haste Miembro para recibir descuentos");
        }
        }

    }

