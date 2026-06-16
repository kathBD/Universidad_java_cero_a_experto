package clasesyobjetos;

public class Aritmetica2 {
    int operando1;
    int operando2;

    //constructor vacio
    public Aritmetica2(){

    }
    //constructor
    public Aritmetica2(int op1, int op2){
        System.out.println("Ejecutando constructor");
        operando1 = op1;
        operando2 = op2;
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

    public static void main(String[] args) {
          var aritmetica2 = new  Aritmetica2(5, 7);
          aritmetica2.operando1 = 5;
          aritmetica2.operando2 = 7;
          aritmetica2.sumar();
          // constructor vacio
        var aritmetica3 = new Aritmetica2();
        aritmetica3.sumar();


    }
}
