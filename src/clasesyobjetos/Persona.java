package clasesyobjetos;

public class Persona {
    //atributos
    String  nombre;
    String apellido;
    // metodos

    void mostrarPersona(){
        System.out.println("nombre:  " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {

        System.out.println("****Creación de Clases y Objerto Peronas *****");
        var objeto1 = new Persona();
        objeto1.nombre = "Pedro";
        objeto1.apellido = "Love";
        objeto1.mostrarPersona();
        System.out.println(" ");
        var objeto2 = new Persona();
        objeto2.nombre = "Ana";
        objeto2.apellido = "Pimo";
        objeto2.mostrarPersona();
    }

}
