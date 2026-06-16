package clasesyobjetos;

public class Aritmetica {
    int operando1;
    int operando2;

    //onstructor
    public Aritmetica(int op1, int op2){
        System.out.println("Ejecutando constructor");
    }

    //metodos
    void sumar(){
      var resultado =  operando1 + operando2;
        System.out.println(" El resultado de la suma es: " + resultado);
    }

    void restar(){
        var resultado =  operando1 - operando2;
        System.out.println(" El resultado de la suma es: " + resultado);
    }

    void multiplicar(){
        var resultado =  operando1 * operando2;
        System.out.println(" El resultado de la suma es: " + resultado);
    }

    public static void main(String[] args) {

        System.out.println("Ejmplo de Aritmetica: ");
                                 //parametros
        var aritmetica1 = new Aritmetica(8, 5);
      /**  aritmetica1.operando1 = 8;
        aritmetica1.operando2 = 5;**/
         aritmetica1.sumar();
         aritmetica1.restar();
         aritmetica1.multiplicar();
//Aritmetica 2
        System.out.println("Segundo Objeto: ");
         var aritmetica2 = new Aritmetica(10, 6);
        /** aritmetica2.operando1 = 10;
         aritmetica2.operando2 = 6;**/
         aritmetica2.sumar();
         aritmetica2.restar();
         aritmetica2.multiplicar();


    }
}
