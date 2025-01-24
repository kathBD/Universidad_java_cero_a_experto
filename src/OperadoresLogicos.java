public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("**Operadores Logicos***");
/*
*  && (AND) regresa verdadero si ambos operadores son verdaderos
* || (OR) regresa verdadero si cualquier operando es verdadero
* ! (negacionl) invierte el valor logico unario

* */
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println("a &&!b: " + (a &&!b));
        System.out.println("a ||!b: " + (a ||!b));

        System.out.println("\n**Operadores Relacionales***");

        //or (regresa true si cualquiera de los valores es true)
       //not invierte el valor
        System.out.println("a OR b: " + (a || b));
        System.out.println("!a OR b: " + (!a || b));

        //and (regresa true si ambos valores son true)
        System.out.println("a AND b: " + (a && b));
        System.out.println("!a AND b: " + (!a && b));

        //xor (regresa true si solo uno de los valores es true)
        System.out.println("a XOR b: " + (a ^ b));
        System.out.println("!a XOR b: " + (!a ^ b));

        System.out.println("\n**Operadores Aritmeticos***");

        int x = 5;
        int y = 3;

        //suma
        System.out.println("x + y: " + (x + y));



    }
}
