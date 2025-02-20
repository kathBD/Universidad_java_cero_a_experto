package ciclos;

public class EjercicioBucle {
    public static void main(String[] args) {

        System.out.println("Ciclos : while");

        int contador = 1;

        while (contador <=5){
            System.out.println(contador); //contador++ se puede colocar aqui eliminando la siguente linea
            contador++;

            System.out.println("Segunda forma: ");
            while (contador <= 10)
                System.out.println(contador++);
        }
    }
}
