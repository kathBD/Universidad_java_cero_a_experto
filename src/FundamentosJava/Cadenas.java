package FundamentosJava;

public class Cadenas {
    public static void main(String[] args) {

        //una cadema es un objeto doble comilla sintaxis
        System.out.println("****Manejo de Cadenas****");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        //sintaxis formal
        var cadena2 = new String ("Mundo");
        System.out.println("cadena2 = " + cadena2);
        var cadena3  = cadena1 + cadena2;
        System.out.println("cadena3 = " + cadena3);
        //cadena multiples lineas text block
        var cadena4 = """
                Hola soy
                un texto 
                de varias lineas
                """;
        System.out.println("cadena4 = " + cadena4);
;




    }
}
