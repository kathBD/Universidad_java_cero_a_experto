package RecetasdeCocina;

import java.util.Scanner;

public class proyectoRecetario {
    public static void main(String[] args) {
        System.out.println("***Recetas de Cocina ***");
        //NOmbre de la receta
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese Nombre de la receta");
        var nombreReceta = entrada.nextLine();
        //Ingrediente de receta
        System.out.println("Ingrese los ingredientes: ");
        var ingredientes = entrada.nextLine();
        //Tiempo de la receta

        System.out.println("Ingrese tiempo de la receta(min): ");
        var tiempo = Integer.parseInt(entrada.nextLine());
        //Dificulta
        System.out.println("Ingrese Dificultad de la receta: (fácil, media, alta");
        var dificultad = entrada.nextLine();

        //Imprimir receta
        System.out.println("\n***Recetas de Cocina ***");
        System.out.println("\tReceta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo: " + tiempo + " min");
        System.out.println("\tDificultad: " + dificultad);
        entrada.close();
    }
}
