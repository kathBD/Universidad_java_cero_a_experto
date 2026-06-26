package persona;

public class Persona {
    //atributos
    private String  nombre;
    private String apellido;

    //contructror
    public  Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // metodos

   public void mostrarPersona(){

        System.out.println("nombre:  " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
