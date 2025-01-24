package EntradaDatosConsola;

public class FormateoNumerosCadenas {
    public static void main(String[] args) {
        System.out.println("**Formateo de cadenas***");
        var nombre = "Mateo";
        var edad = 25;
        var altura = 1.75;

        //formato a la informacion
        //String.format
        var mensaje = String.format("Nombre: %s", nombre);
        System.out.println(mensaje);
        var mensajeCompleto = String.format("Nombre: %s, Edad: %d, Estatura: %.2f", nombre, edad, altura);
        System.out.println(mensajeCompleto);

        //metodo prinf
        System.out.printf("Nombre: %s, Edad: %d, Estatura: %.2f%n", nombre, edad, altura);

        var numeroEmpleado = 12;
        // formateo con text block
        mensaje = """
                %nDetalles de la Persona:\s
                ------------------------
                \tNombre: %s
                \tN° Empleado: %04d 
                \tEdad: %d
                \tEstatura: %.2f%n
                """.formatted(nombre, numeroEmpleado,  edad, altura);
        System.out.println(mensaje);
        //Formateo con text block printf
        System.out.printf("""
                 %nDetalles de la Persona:\\s
                                ------------------------
                                \tNombre: %s
                                \tN° Empleado: %04d\s
                                \tEdad: %d
                                \tEstatura: %.2f
                """, nombre, numeroEmpleado, edad, altura);

        
    }
}
