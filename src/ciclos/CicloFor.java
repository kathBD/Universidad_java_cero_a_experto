package ciclos;

public class CicloFor {
    public static void main(String[] args) {
        System.out.println("ciclo for");

        // Itera entre 0 y 10 (exclusivo)
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i);
        }

        // Itera entre 10 y 0 (inclusivo)
        for (int i = 10; i >= 0; i--) {
            System.out.println("Iteración inversa " + i);
        }
    }
}
