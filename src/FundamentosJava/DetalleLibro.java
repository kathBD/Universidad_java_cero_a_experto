package FundamentosJava;

public class DetalleLibro {
    public static void main(String[] args) {
        //DEtalle de un libro

        //Variable localos memoria stack  /   objects(memoria Heap)
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precioLibro = 12.99;

        System.out.println("Titulo: " + tituloLibro + " Año publicación: " + anioPublicacion);
        System.out.println("Disponible:" + libroDisponible +  " Precio:" + precioLibro);

        //modificar titulo dejo de apuntar al primero
        tituloLibro = "El Señor de los anillos";

    }
}