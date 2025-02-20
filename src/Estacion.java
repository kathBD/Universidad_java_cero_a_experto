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

        //Ejecicio con Switch
        String estacionSwitch = "";
        switch(mes){
            case 1: case 2: case 12:
                estacionSwitch = "Invierno";
                break;
            case 4: case 3: case 5:
                estacionSwitch = "Primavera";
                break;
            case 6: case 7: case 8:
                estacionSwitch = "Verano";
                break;
            case 9: case 10: case 11:
                estacionSwitch = "Otoño";
                break;
            default:
                System.out.println("El mes ingresado no es válido");
        }
        System.out.printf("La estación para el mes %d es %s ", mes, estacionSwitch);

        //Mejoraro Switch
        String estacionSwitchEnhanced = "";
        switch(mes){
            case 1, 2, 12 -> estacionSwitchEnhanced = "Invierno";
            case 4, 3, 5 -> estacionSwitchEnhanced = "Primavera";
            case 6, 7, 8 -> estacionSwitchEnhanced = "Verano";
            case 9, 10, 11 -> estacionSwitchEnhanced = "Otoño";
            default -> System.out.println("El mes ingresado no es válido");
        }
        System.out.printf("La estación para el mes %d es %s ", mes, estacionSwitchEnhanced);
    }
}
