package FundamentosJava;

public class TipoVar {
    public static void main(String[] args) {
        System.out.println("**Uso de var***");
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);

        //Uso de var
        var nombre2 = "Pedro";
        System.out.println("nombre2 = " + nombre2);

        //Uso de var con tipo de dato primitivo
        var edad = 30;
        System.out.println("edad = " + edad);

        //Uso de var con tipo de dato complejo
        var fraccion = 1/3.0f;
        System.out.println("fraccion = " + fraccion);

        //Uso de var con tipo de dato referencia
        var persona = "Juan";
        System.out.println("persona = " + persona);

    }
}
