import java.util.Scanner;

public class CreacionValidacionPassword {
    public static void main(String[] args) {
        String password;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        password = scanner.nextLine();
        Boolean salir = false;

        while (!salir) {

            if (password.length() < 6) {
                System.out.println("PassWord Válido!." + password);
                salir = true;
            } else {
                System.out.println("El password no cumple con los requisitos: Debe tener al menos 6 caracteres." + password);
                System.out.print("Introduce una nueva contraseña: ");
                password = scanner.nextLine();
            }
        }
    }
}
