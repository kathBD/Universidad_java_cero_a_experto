package ciclos;

public class NUmeroPares {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 20: ");

        int contador = 1;
        while (contador <=20) {
            if (contador % 2 == 0)
                 System.out.println(contador);
            contador++;
        }

    }
}
