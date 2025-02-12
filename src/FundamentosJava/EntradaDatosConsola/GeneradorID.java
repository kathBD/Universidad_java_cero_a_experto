package FundamentosJava.EntradaDatosConsola;

import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
        System.out.println("***Sistema Generador de ID único***");
        var entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        var apellido = entrada.nextLine();
        System.out.print("Ingrese su año de nacimiento: ");
        var fechaNacimiento = entrada.nextLine();

        //generar valor aleatorio de 4 digitos entre 1 y 9999
        var digitos = new Random().nextInt(1000);



//generar ID
        var nombreNormalizado = nombre.toUpperCase().substring(0,2) + apellido.toUpperCase().substring(0,2);
        var fecha = fechaNacimiento.substring(2,4);

        //imprimir Informacion



        var id = nombreNormalizado + String.format("%04d", digitos) + fecha;


        System.out.printf("""
                 %nID Generado:\\s
                                ------------------------
                                \tid: %s
                """, id);

    }}
