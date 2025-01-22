package cadenas;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        //caracteres especiales
        var cadena1 = "Hola MUndo";
        System.out.println("cadena1 = " + cadena1);
        //\n imprimir un salto de linea
        var caddena2 = "Hola\nMundo";
        System.out.println("caddena2 = " + caddena2);
        //\t imprimir un tabulador
        var caddena3 = "\tHola\tMundo";
        System.out.println("caddena3 = " + caddena3);
        //\r imprimir el cursor al principio de la linea
        var caddena4 = "Hola\rMundo";
        System.out.println("caddena4 = " + caddena4);
        //\b imprimir el cursor una posición atrás
        var caddena5 = "Hola\bMundo";
        System.out.println("caddena5 = " + caddena5);
        //\f imprimir el papelera
        var caddena6 = "Hola\fMundo";
        System.out.println("caddena6 = " + caddena6);
        //uso de comillas simples
        var cadena7 = "\' Hola \' Mundo";
        System.out.println("cadena7  = " + cadena7 );



    }

}
