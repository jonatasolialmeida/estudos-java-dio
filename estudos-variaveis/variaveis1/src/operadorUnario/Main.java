package operadorUnario;

public class Main {
    public static void main (String[] args) {
        // (+) operador unário positivo
        // (-) operador unário negativo
        // (++) operador unário de incremento de valor >> incrementa o valor em 1 unidade 
        // (--) operador unário de decremento de valor >> decrementa o valor em 1 unidade 
        // (!) operador unário lógico de negação >> nega o valor de uma expressão booleana;

        int numero = 5;
        System.out.println(numero);
        
        numero = - numero;
        System.out.println(numero);
        
        numero = numero * -1;
        System.out.println(numero);
        
        // ******************
        int incremento = 2;
        System.out.println(incremento);
        
        // incremento = incremento + 1;
        incremento++;
        System.out.println(incremento);

        System.out.println(incremento++);
        System.out.println(++incremento);
        
        boolean boleano = true;
        System.out.println(boleano);
        
        boleano = !boleano;
        System.out.println(boleano);
    }
}
