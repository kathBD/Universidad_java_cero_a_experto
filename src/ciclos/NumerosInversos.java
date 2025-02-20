package ciclos;

public class NumerosInversos {
    public static void main(String[] args) {
        System.out.println("**Numeros Inversos ***");
        int i = 1;
        while (i <= 10) {
            System.out.println(10 - i);
            i++;
        }
        System.out.println("Forma 2");
        int count = 10;
        do{
            System.out.print(count-- + " ");
        }while (count >0);
    }
}
