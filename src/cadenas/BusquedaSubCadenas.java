package cadenas;

public class BusquedaSubCadenas {
    public static void main(String[] args) {
        //buscarSubcadenas
        //IndexOf devuelde el indide de la primera aparicieon d e  la cadena
        var cadena1 = "Hola Mundo";
        var indice1 = cadena1.indexOf(("Hola"));
        System.out.println("indice1 = " + indice1);
        //lastIndeof devuelve el indice de la ultima aparicion de la sudcadena
        //subcadena Mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        //subcadena no encontrada devuelve -1
    }
}
