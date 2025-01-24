public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int a = 5, b =3, resultado;
//Operadores Aritméticos
        System.out.println("***Operadores Aritméticos)");
        // Adicionar
        int suma = num1 + num2;
        System.out.println("Suma: " + suma);

        //suma
        resultado = a + b;
        System.out.println("Resultado: " + resultado);


        // Resta
        int resta = num1 - num2;
        System.out.println("Resta: " + resta);
        resultado = a - b;
        System.out.println("resta = " + resta);

        // Multiplicar
        int multip = num1 * num2;
        System.out.println("Multiplicacion: " + multip);

        resultado = a * b;
        System.out.println("multip = " + multip);

        // Dividir
        double division = (double) num1 / num2;
        System.out.println("Division: " + division);

        resultado = a / b;
        System.out.println("division = " + division);

        // Resto da division
        int resto = num1 % num2;
        System.out.println("Modulo: " + resto);

        resultado = a % b;
        System.out.println("Modulo = " + resto);


    }
}
