package SentenciasDecision;

public class SentenciaIf {
    public static void main(String[] args) {
        var edad = 30;
        if(edad >= 18){
            System.out.println("Eres mayor de edad: Puedes acceder" );
        }else {
            System.out.println("Eres menor de edad: no tienes acceso");
        }

        //Else if
        Integer age = 10;
       
        if(age >=12) {
            System.out.println("eres un infante");
        } else if (age> 13 && age <= 18 ) {
            System.out.println("Eres un adolescente");
        }else {
            System.out.println("Eres mayor de edad");
        }
            
        }
    }


