package ciclos;

public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("NumerosImpares 0 al 20");
        int count = 0;
        do {
            if (count % 2 != 0)
                System.out.print(count + " ");
                count++;
            }while (count <= 20);

    }
}
