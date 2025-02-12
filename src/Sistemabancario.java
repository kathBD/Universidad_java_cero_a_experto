import java.util.Scanner;

public class Sistemabancario {

    public static void main(String[] args) {
        System.out.println("***Bienvenido al Sistema Banco M ");

        var scanner = new Scanner(System.in);
        System.out.println("Desea salir del Sistema? (true/false) ");
        var salirSistema = Boolean.parseBoolean(scanner.nextLine());
        if(!salirSistema){
            System.out.println("Continuamos en el sistema banco....");
        }else{
            System.out.println("Saliendo de sistema...");
        }


    }
}
