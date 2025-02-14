public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("***Operador Ternario***");
        //sintaxis
        //condicion ? (true)Expres1 : (false)Expres2;
        //Determinar su un numero es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El núumero:  " + numero + " es " + resultado);

        //Calcular si es mayor de edad
        var edad = 17;
        var esMayorDeEdad = (edad >= 18) ? "Eres Mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes: " + edad + "  años entonces eres: " + esMayorDeEdad);

        //Valor positivo, negativo o cero (operador ternario anidado)

        Integer num = 10;
        var resultado2 =(num >0)?"Positivo":(num<0)?"Negativo":"Cero";
        System.out.println("\nEl número " + num + " es: " + resultado2);
    }
}
