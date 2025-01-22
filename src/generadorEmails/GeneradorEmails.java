package generadorEmails;

import java.util.StringJoiner;

public class GeneradorEmails {
    public static void main(String[] args) {
        var nombre = "Luis Naranjo Soto";
        var empresa = "didi";
        var dominio = "com.es";

        System.out.println(" ***Generador de  email****");
        var resultadoEmail = nombre.toLowerCase().replaceAll("\\s", ".") + "@" + empresa.toLowerCase() + "." + dominio;
        System.out.println("resultadoEmail = " + resultadoEmail);

        //respuesta 1
        System.out.println("\n ***Generador de  email****");
        var nombreCompleto = new StringJoiner(" ").add(nombre).add("Naranjo").add("Soto").toString();
        var email = nombreCompleto.toLowerCase().replaceAll("\\s", ".") + "@" + empresa.toLowerCase() + "." + dominio;
        System.out.println("Email generado por el profesor: " + email);

        //respuesta 2
        var nombreNormalizado = nombreCompleto.strip(); //limpia espacios
        //reeemplazar espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        //convertimos a minnusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();

        //datos empresa
        var nombreEmpresa = "Global Mentoring";
        System.out.println("\nnombreEmpresa = " + nombreEmpresa);
        var extendionDominio = "com.mx";
        System.out.println("extendionDominio = " + extendionDominio);

        //Normalizar
        var nombreEmpresaNormalizador = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominoEmailNormalizado = "@" + nombreEmpresaNormalizador + extendionDominio;
        System.out.println("dominoEmailNormalizado = " + dominoEmailNormalizado);
        
        //creamos email
        
        var emailNormalizado = nombreNormalizado + dominoEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
        


        

    }
}
