package ciclos;

public class Pares {
    public static void main(String[] args) {
        System.out.println("Pares del 1 al 20");
        for (int i = 0; i <=20; i++) { //int i =0; i<=20; i+=2)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
