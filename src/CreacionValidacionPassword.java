import java.util.Scanner;

public class CreacionValidacionPassword {
    public static void main(String[] args) {
        String password;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        password = scanner.nextLine();
        Boolean salir = false;

        while (!salir) {

            if (password.length() <= 6) {
                System.out.println("PassWord Válido!.");
                salir = true;
            } else {
                System.out.println("Contraseña: Debe tener al menos 6 caracteres.");
                System.out.print("Introduce una nueva contraseña: ");
                password = scanner.nextLine();
            }
        }
    }
}
