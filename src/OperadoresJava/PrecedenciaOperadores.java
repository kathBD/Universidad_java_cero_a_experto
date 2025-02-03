package OperadoresJava;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
      /* 1. Postfijo: expr++, expr--
         2. Unarios: ++expr, --expr, +expr, -expr, ~, !
         3. Creación de Objetos: new, new[]
        4. Multiplicación/División: *, /, %
        5. Aditivos: +, -
        6. Relacionales: <, >, <=, >=
        7. Igualdad: ==, !=
        8. Lógicos AND Condicional:*/

        //prioridad con los que se aplican los operadores

var a = 12/3 + 2 * 3 -1 ;
//division 12/ 3 = 4
// multiplicación 2 * 3 = 6
// suma 4 + 6 = 10
// resta 10 - 1 = 9

System.out.println("Resultado: " + a);

//parenteris maxima prioridad
        var b = 12/3 + 2 * (3 -1) ;
        System.out.println("b = " + b);

        var c= 12/(3 + 2) * 3 -1 ;
        System.out.println("c = " + c);
        



    }
}
