package clasesyobjetos;

public class OperadorThis {

    int operadon1;
    int operando2;

    public OperadorThis(){}

    public OperadorThis(int operadon1, int operando2){
        System.out.println("Ejecutando constructor");
        this.operadon1 = operadon1;
        this.operando2 = operando2;
    }

    void sumar(){
        var resultado = operadon1 + operando2;
        System.out.println("resultado de la suma: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("Ejmplo de aritmetica");
        var aritmetica = new OperadorThis(5, 6);
        aritmetica.sumar();
    }

}
