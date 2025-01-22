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


    }
}
