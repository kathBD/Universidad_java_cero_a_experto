package OperadoresJava;

import java.util.Scanner;

public class SistemaAutentificacion {
    public static void main(String[] args) {
        System.out.println("***Sistema de Login***");
        final String USUARIO = "admin";
       final  String PASSWORD = "12345";
        var autentificar = true;
        var teclado = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        var ingresadoUsuario = teclado.nextLine();
        System.out.print("Ingrese su passwor: ");
        var ingresadoPassword = teclado.nextLine();

         autentificar = USUARIO.equals(ingresadoUsuario) && PASSWORD.equals(ingresadoPassword);
         ;

        if (autentificar) {
            System.out.println("Autenticación exitosa!");
        }else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
