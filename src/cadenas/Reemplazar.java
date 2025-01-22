package cadenas;

public class Reemplazar {
    public static void main(String[] args) {
        //reemplazar subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 original = " + cadena1);
        // Reemplzar " MUndo " por a todos
        var nuevaCadena = cadena1.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        //reemplazar "HOla por "adios"

        nuevaCadena = cadena1.replace("Hola", "Saludos");
        //cadenas inmutables
        System.out.println("nuevaCadena = " + nuevaCadena);


    }


}
