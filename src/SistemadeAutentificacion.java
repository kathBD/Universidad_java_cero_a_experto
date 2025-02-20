import java.util.Scanner;

public class SistemadeAutentificacion {

    public static void main(String[] args) {

                System.out.println("Sistema de Autentificación");

                String usuarioCorrecto = "admin";
                String contrasenaCorrecta = "12345";

                var scanner = new Scanner(System.in);

                System.out.print("Ingrese su Usuario: ");
                String usuarioIngresado = scanner.nextLine().strip();

                System.out.print("Ingrese su contraseña: ");
                String contrasenaIngresada = scanner.nextLine().strip();

                if (usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta)) {
                    System.out.println("Bienvenido, administrador al Sistema!");
                } else if (!usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta)) {
                    System.out.println("Usuario inválido, por favor corregirlo");
                } else if (usuarioIngresado.equals(usuarioCorrecto) && !contrasenaIngresada.equals(contrasenaCorrecta)) {
                    System.out.println("Password incorrecto, por favor corregirlo");
                } else {
                    System.out.println("Usuario y Password incorrectos");
                }


            }
        }
