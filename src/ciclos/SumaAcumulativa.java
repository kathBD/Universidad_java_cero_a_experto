package ciclos;

public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("Suma iterativa");
        final int MAXIMO = 5;
        int acumuladorSumna = 0;


        //iterar valores
        int number = 1;
        while(number < MAXIMO){
            acumuladorSumna += number++;
            System.out.println("Iteración: " + number + ", acumulador: " + acumuladorSumna);

        }
    }
}
