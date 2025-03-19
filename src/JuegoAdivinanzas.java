import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        int numero = 0;
        final int INTENTOS_MAXIMOS = 5;
        Random random = new Random();
        numero = random.nextInt(50) + 1; // Genera un número aleatorio entre 1 y 100

        int intentos = 0;
        int numeroAdivinado = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina un número entre 1 y 50.");

        while (numeroAdivinado!= numero && intentos < INTENTOS_MAXIMOS) {
            intentos++;
            System.out.print("Intento " + intentos + ": ");
            numeroAdivinado = scanner.nextInt();

            if (numeroAdivinado < numero) {
                System.out.println("El número es mayor.");
            } else if (numeroAdivinado > numero) {
                System.out.println("El número es menor.");
            }
        }
        if (numeroAdivinado == numero){
            System.out.println("Felicidades has adivinado el número secreto");
        }else{
            System.out.println("Has agotado todos los intentos. El número secreto era: " + numero);
        }
    }
}
