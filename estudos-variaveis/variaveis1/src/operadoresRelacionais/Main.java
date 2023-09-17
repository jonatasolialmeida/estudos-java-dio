package operadoresRelacionais;

public class Main {
    public static void main (String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        simNao = numero1 != numero2;
        System.out.println(simNao);

        simNao = numero1 > numero2;
        System.out.println(simNao);

        simNao = numero1 < numero2;
        System.out.println(simNao);

        System.out.println("///////////*************//////////");
        
        String nomeUm = "Jonatas";
        String nomeDois = "Jonatas";
        System.out.println(nomeUm == nomeDois);
        
        String nomeTres = new String("Jonatas");
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm.equals(nomeTres));

    }
}
