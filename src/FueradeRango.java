import java.util.Scanner;

public class FueradeRango {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        var dato = Integer.parseInt(teclado.nextLine());

        //Revisar si esta dentro de rango (entre entre 1 y 10)
        var  estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("El número está dentro del rango (1 y 10)" + estaDentroRango);

        //LOgica inversa esat fuera de rango

        var estaFueraRango = !(dato < 1 || dato > 10);
        if (estaFueraRango) {
            System.out.println("El número está fuera del rango(1 y10).");
        } else {
            System.out.println("El número no está fuera del rango(1y 10)");
        }

    }

    }

