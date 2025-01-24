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

    }
}
