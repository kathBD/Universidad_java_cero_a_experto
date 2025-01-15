package FundamentosJava;

public class TiposdeDatos {
    public static void main(String[] args) {

        //valor por default 0
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt); //32bits
        long tipoLong = 987654L; //64bits
        System.out.println("tipoLong = " + tipoLong);

        //valor por default 0.0
        //Punto flotante
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble);

        //caracter ('\u0000')

        char tipoChar = '@'; //caracteres Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);

        //Boleanos (false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Cadenas defaul null sin referencia
        String nombre = null;
        System.out.println(nombre);
        String tipoString = "Hola, mundo!";
        System.out.println("tipoString = " + tipoString);

    }
}
