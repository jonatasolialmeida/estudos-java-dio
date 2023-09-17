package ternario;

public class Main {
    public static void main (String[] args) {

        int a, b;
        String resultado;
        a = 5;
        b = 6;

        if (a==b){
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }


        System.out.println(resultado);
        
        // ternario
        resultado = a < b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
        
        int resultado2 = a < b ? 1 : 0;
        System.out.println(resultado2);

    }
}
