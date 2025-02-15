import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("**Reserva de Hotel***");

        var scanner = new Scanner(System.in);
        var VistaMar = 190000;
        var SinVistaMar = 150000;

        System.out.print("Nombre Cliente:");
        var nombreCliente = scanner.nextLine();
        System.out.print("Ingrese el número de días de estadía: ");
        var estadiaDias = Integer.parseInt(scanner.nextLine());
        System.out.print("Su habitación con vista al mar? (true/false)");
        var vista = Boolean.parseBoolean(scanner.nextLine());

        var reserva = ((vista) ? 190000 : 150000);
        var totalPagar = estadiaDias * reserva;

        System.out.println("Reserva realizada con éxito!");
        System.out.println("Días de estadia: " + estadiaDias);
        System.out.println("El monto de su reserva es de:  $" + totalPagar);
        scanner.close();


    }
}
