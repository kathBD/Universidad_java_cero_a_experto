package cadenas;

public class ComparacionCadenas {
    public static void main(String[] args) {
        //comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        //se creaa un nuevo objeto
        var cadena3 = new String ("Java");
//pool la memoria apunta a la misma direccion porque usa los mismos caracteres

//comparacion de cadenas == comapran referencia de memoria
        System.out.print("la referencia de cadena1 es igual a cadena 2 = " );
        System.out.println(cadena1 == cadena1);
        System.out.println("la referencia de cadena1 es igual a cadena 3 = " + cadena1 == cadena3);

        //comparar contenido usaremos equals

        System.out.println("cadena1 es igual a contenido a cadena3 = " + cadena1.equals(cadena1));

    }
}
