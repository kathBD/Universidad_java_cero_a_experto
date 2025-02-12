import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[]args){
        System.out.println("***Bienvenido a la Casa de los Espejos");

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Le tiene miedo a la oscuridad (true/false): ");
        boolean oscuridad = Boolean.parseBoolean(scanner.nextLine());

        //verificacion
        if(!oscuridad && edad <= 10){
            System.out.println("Puedes entrar a la Casa de los Espejos");
        }else{
            System.out.println("Lo siento, te puede dar miedo la Casa de los Espejos");
        }
    }
}
