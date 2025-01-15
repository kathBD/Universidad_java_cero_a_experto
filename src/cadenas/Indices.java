package cadenas;

public class Indices {
    public static void main(String[] args) {
        //manejo de indices en una cadena
        var cadena1 = "Hola Mundo";
        
        //manejo de indices en una cadena
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        var letramedia = cadena1.charAt(5);
        System.out.println("letramedia = " + letramedia);
    }

}
