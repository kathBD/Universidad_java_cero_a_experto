public class PlabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("***Break and Continue***");

        //Ejmplo break, imprimir solo el primer numero par
        for (var numnero = 1; numnero < 10; numnero++){
            if(numnero % 2 == 0){
                System.out.print(numnero + " ");
                break;
            }
        }

        //imprimir solo numero pares
        System.out.println("\nPalabra continue");
        for (var numnero = 1; numnero < 10; numnero++){
            if(numnero % 2!= 0){
                continue; //saltamos a la siguente iteracion
            }
            System.out.print(numnero + " ");
        }
    }
}
