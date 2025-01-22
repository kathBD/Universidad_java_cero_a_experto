package cadenas;

public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //formas de concatenacion
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + cadena2;
        System.out.println("cadena3 =  "  + cadena3);

        //metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);
//StringBuilder constructor de cadenas
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ").append(cadena2);
        System.out.println("constructorCadenas = " + constructorCadenas);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);
        
        //StringBuffer hilos 
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("stringBuffer = " + stringBuffer);
          resultado = stringBuffer.toString();
        System.out.println("resultado = " + resultado);

//METODOjoin
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado de join = " + resultado);

    }
}
