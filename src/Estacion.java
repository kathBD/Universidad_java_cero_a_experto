import java.util.Scanner;

public class Estacion {
    public static void main(String[] args) {
        System.out.println("Estacion del año");

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes (1 -12) para conocer la estación del año : ");
        int mes = Integer.parseInt(scanner.nextLine());

       if(mes == 1 || mes == 2 || mes == 12){
           System.out.println("Este mes pertenece a Invierno");
       } else if (mes == 4 || mes == 3 || mes == 5) {
           System.out.println("Este mes pertenece: Primavera");
       } else if (mes == 6 || mes == 7 || mes == 8) {
           System.out.println("Este mes pertenece a Verano ");
       }else if (mes == 9 || mes == 10 || mes == 11) {
           System.out.println("Este mes pertenece a Otoñp");
       }else{
           System.out.println("El mes ingresado no es válido");
       }
        scanner.close();

        // Otra forma de resolverlo utilizando
        var estacion = "";

        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        } else if (mes == 4 || mes == 3 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }else{
            System.out.println("El mes ingresado no es válido");
        }
        scanner.close();
        System.out.printf("La estación para el mes %d es %s ", mes, estacion);
    }
}
