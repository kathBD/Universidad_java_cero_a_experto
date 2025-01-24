public class OperadoresAsignacion {
    public static void main(String[] args) {
        /*
        *  = Asignacion simple
        * += Suma y asignacion
        * -= resta y asignacion
        *  *=Multiplicacion y Asignacion
        *  /= division y asignacion
        * %= modulo y asignacion
        * */
        System.out.println("***Operadores de Asignacion");
        int a = 10;
        int b = 5;

        // Asignacion simple
        int x = a;
        var numero = 10;
        System.out.println("numero = " + numero);

        // Suma y asignacion compuesto
        x += b;

        // Resta y asignacion
        x -= b;
        numero +=5; //se incrementa su valor en 5
        System.out.println("numero sumandole 5 = " + numero);

        // Multiplicacion y asignacion
        x *= b;

        // Division y asignacion
        x /= b;

        // Modulo y asignacion
        x %= b;

       //Asgnacion de variables multiples
        int c = 2, d = 3, e = 4;

        System.out.printf("c = %d\n, d = %d, e = %d" , c, d, e);
    }
}
