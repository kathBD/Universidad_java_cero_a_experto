import java.util.Scanner;

public class MayorNumero {

    public static void main(String[] args) {

       var scanner = new Scanner(System.in);
       //Informacion
        System.out.println("Ingrese un número entero:  ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese otro número entero:  ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if(num1 < num2) {
            System.out.println("El número " + num1 +  " mayor es el segundo: " + num2);
        } else if (num2 < num1) {
            System.out.println("El número "  +  num2  + " mayor es el primero: " + num1);
        }else
            System.out.println("Ambos números son iguales");

    }
}
