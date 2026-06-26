package personaprueba;

import persona.Persona;


public class PersonaPrueba {

    public static void main(String[] args) {

        System.out.println("****Creación de Clases y Objerto Peronas *****");
        var objeto1 = new Persona("Juan", "Lope");
        objeto1.mostrarPersona();
        System.out.println(" ");
        var objeto2 = new Persona("Ana", "Fell");
        objeto2.mostrarPersona();
    }


}
