package Funciones;

public class FuncionesRecursivas {
    //imprimir los numeros del 1 al 10
    //funcion recursiva
    static void recursivaF(int numero ){
       //caso base
       if(numero ==1)
           System.out.print(numero + " ");
       else{
           //caso recursivo
//recursivaF(numero -1);
        //   System.out.println(" Inverso");
           //inverso de 10 a 1
           System.out.print(numero + " ");
           recursivaF(numero -1);


       }
    }



    public static void main(String[] args) {
           recursivaF(10);
    }
}
