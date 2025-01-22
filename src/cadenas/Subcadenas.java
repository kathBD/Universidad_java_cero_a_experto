package cadenas;

public class Subcadenas {
    public static void main(String[] args) {
        //Subcadena indice final no se incluye
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
         // Subcadena 1
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);
        System.out.println("subcadena1 = " + cadena1.substring(5));


    }
}
