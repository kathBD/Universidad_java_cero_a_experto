public class OperadoresUnarios {
    public static void main(String[] args) {

        System.out.println("Operadores Unarios");
        int numero = 5;
        int a= 3, b = -2, resultado;
        var c = true;

        //Operador positivo
        resultado =+a;
        System.out.println("resultado positivo= " + resultado);
        //Operador negativo
        resultado = -a;
        System.out.println("resultado negativo = " + resultado);
        //Preincremento
        a = 3;
        resultado = ++a;
        System.out.println("resultado preincremento = " + resultado);
        System.out.println("Ya se incremento = " + resultado);
        // postincrement
        a = 3;
        resultado = a++;
        System.out.println("Resultado postincremento a++= " + resultado);
        System.out.println("Ya se incremento = " + a);


        // Operador de conversion a booleano
        resultado = (a > 0)? 1 : 0;
        System.out.println("Resultado conversion booleano = " + resultado); // Imprime: 1

        // Operador de conversion a double
        double d = 10.5;
        resultado = (int) d;
        System.out.println("Resultado conversion double = " + resultado); // Imprime: 10

        // Operador de conversion a char
        char letra = 'a';
        resultado = (int) letra;
        System.out.println("Resultado conversion char = " + resultado); // Imprime: 97

        // Operador de conversion a String

        // Incremento un valor
        numero++;
        System.out.println("Incremento: " + numero); // Imprime: 6

        // Decremento un valor
        numero--;
        System.out.println("Decremento: " + numero); // Imprime: 5

        // Negativo de un valor
        numero = -numero;
        System.out.println("Negativo: " + numero); // Imprime: -5

        // Lógica NOT
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("NOT verdadero: " +!verdadero); // Imprime: false
        System.out.println("NOT falso: " +!falso); // Imprime: true
    }
}
