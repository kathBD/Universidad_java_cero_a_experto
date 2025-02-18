public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("Switch Mejorado");

        int dia = 3;
        String diaSemana;
        diaSemana =switch (dia){
            case 1 -> "Lunes";
            case 2 -> "martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "sabado";
            case 7 -> "Domingo";
            default -> "Dia Invalido";
        };
        System.out.println(diaSemana);
        dia = 7;
        switch (dia){
            case 1 -> System.out.println("Luens");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("domingo");
            default -> System.out.println("Dia Invalido");
        }
    }
}
