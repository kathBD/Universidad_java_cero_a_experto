package cadenas;

public class Metodos {
    public static void main(String[] args) {
        //metodos de cadenas
        var cadena1 = "Hola, mundo!";
        System.out.println("obtenerLongitud " + cadena1.length()); // imprime: 13

        //reeemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        //convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        //convertir  minisculas
        System.out.println("cadena1 = " + cadena1.toLowerCase());
        //eliminar espacios al inicio y al final
        var cadena2 = " Leo mucho  ciencia ficcion....    ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());


    }
}
